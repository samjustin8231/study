package com.example.codedesign.ratelimiter.rule.parser;

import com.example.codedesign.ratelimiter.rule.ApiLimit;
import com.example.codedesign.ratelimiter.rule.RateLimitRule;
import com.example.codedesign.ratelimiter.rule.RuleConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TrieRateLimitRule implements RateLimitRule {
    public TrieRateLimitRule(RuleConfig ruleConfig) {
        log.info("=====> new TrieRateLimitRule by config");
    }

    @Override
    public ApiLimit getLimit(String appId, String url) {
        log.info("=====> getLimit[获取接口的apiLimit]");

        ApiLimit apiLimit = new ApiLimit();
        return apiLimit;
    }
}
