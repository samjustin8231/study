package com.example.codedesign.ratelimiter;

import com.example.codedesign.ratelimiter.alg.FixedTimeWinRateLimitAlg;
import com.example.codedesign.ratelimiter.exception.InternalErrorException;
import com.example.codedesign.ratelimiter.rule.ApiLimit;
import com.example.codedesign.ratelimiter.rule.RateLimitRule;
import com.example.codedesign.ratelimiter.rule.RuleConfig;
import com.example.codedesign.ratelimiter.rule.datasource.FileRuleConfigSource;
import com.example.codedesign.ratelimiter.rule.datasource.RuleConfigSource;
import com.example.codedesign.ratelimiter.rule.parser.TrieRateLimitRule;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

/**
 * RateLimiter 类用来串联整个限流流程。它先读取限流规则配置文件，映射为内存中的 Java 对象（RuleConfig），然后再将这个中间结构构建成一个支持快速查询的数据结构（RateLimitRule）。
 * 除此之外，这个类还提供供用户直接使用的最顶层接口（limit() 接口）。
 */
@Slf4j
public class RateLimiter {

    // 为每个api在内存中存储限流计数器
    private ConcurrentHashMap<String, FixedTimeWinRateLimitAlg> counters = new ConcurrentHashMap<>();
    private RateLimitRule rule;

    public RateLimiter() {
        log.info("====> new RateLimiter");

        //改动主要在这里：调用RuleConfigSource类来实现配置加载
        RuleConfigSource configSource = new FileRuleConfigSource();
        RuleConfig ruleConfig = configSource.load();
        this.rule = new TrieRateLimitRule(ruleConfig);
    }

    public boolean limit(String appId, String url) throws InternalErrorException {
        log.info("====> limit exe. appId:{}, url:{}", appId, url);

        ApiLimit apiLimit = rule.getLimit(appId, url);
        if (apiLimit == null) {
            return true;
        }

        // 获取api对应在内存中的限流计数器（rateLimitCounter）
        String counterKey = appId + ":" + apiLimit.getApi();
        FixedTimeWinRateLimitAlg rateLimitCounter = counters.get(counterKey);
        if (rateLimitCounter == null) {
            FixedTimeWinRateLimitAlg newRateLimitCounter = new FixedTimeWinRateLimitAlg(apiLimit.getLimit());
            rateLimitCounter = counters.putIfAbsent(counterKey, newRateLimitCounter);
            if (rateLimitCounter == null) {
                rateLimitCounter = newRateLimitCounter;
            }
        }

        // 判断是否限流
        return rateLimitCounter.tryAcquire();
    }
}
