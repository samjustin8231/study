package com.example.codedesign.ratelimiter.rule;

public interface RateLimitRule {

    public ApiLimit getLimit(String appId, String url);
}
