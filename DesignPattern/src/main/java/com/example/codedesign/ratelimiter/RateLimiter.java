package com.example.codedesign.ratelimiter;

import com.example.codedesign.ratelimiter.alg.RateLimitAlg;
import com.example.codedesign.ratelimiter.exception.InternalErrorException;
import com.example.codedesign.ratelimiter.rule.RateLimitRule;
import com.example.codedesign.ratelimiter.rule.RuleConfig;
import com.example.codedesign.ratelimiter.rule.Yaml;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/**
 * RateLimiter 类用来串联整个限流流程。它先读取限流规则配置文件，映射为内存中的 Java 对象（RuleConfig），然后再将这个中间结构构建成一个支持快速查询的数据结构（RateLimitRule）。
 * 除此之外，这个类还提供供用户直接使用的最顶层接口（limit() 接口）。
 */
@Slf4j
public class RateLimiter {

    // 为每个api在内存中存储限流计数器
    private ConcurrentHashMap<String, RateLimitAlg> counters = new ConcurrentHashMap<>();
    private RateLimitRule rule;

    public RateLimiter() {
        log.info("====> RateLimiter初始化...");
        // 将限流规则配置文件ratelimiter-rule.yaml中的内容读取到RuleConfig中
        InputStream in = null;
        RuleConfig ruleConfig = null;
        try {
            in = this.getClass().getResourceAsStream("/ratelimiter-rule.yaml");
            if (in != null) {
                Yaml yaml = new Yaml();
                ruleConfig = yaml.loadAs(in, RuleConfig.class);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    log.error("close file error:{}", e);
                }
            }
        }

        log.info("====> RateLimiter读取配置，创建ruleConfig");

        // 将限流规则构建成支持快速查找的数据结构RateLimitRule
        this.rule = new RateLimitRule(ruleConfig);
    }



    public boolean limit(String appId, String url) throws InternalErrorException {
        log.info("====> limit exe. appId:{}, url:{}", appId, url);

        RuleConfig.ApiLimit apiLimit = rule.getLimit(appId, url);
        if (apiLimit == null) {
            return true;
        }

        // 获取api对应在内存中的限流计数器（rateLimitCounter）
        String counterKey = appId + ":" + apiLimit.getApi();
        RateLimitAlg rateLimitCounter = counters.get(counterKey);
        if (rateLimitCounter == null) {
            RateLimitAlg newRateLimitCounter = new RateLimitAlg(apiLimit.getLimit());
            rateLimitCounter = counters.putIfAbsent(counterKey, newRateLimitCounter);
            if (rateLimitCounter == null) {
                rateLimitCounter = newRateLimitCounter;
            }
        }

        // 判断是否限流
        return rateLimitCounter.tryAcquire();
    }
}
