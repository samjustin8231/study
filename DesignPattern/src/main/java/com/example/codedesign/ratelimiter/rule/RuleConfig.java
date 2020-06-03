package com.example.codedesign.ratelimiter.rule;

import lombok.Data;

import java.util.List;

public class RuleConfig {
    private List<AppRuleConfig> configs;

    public List<AppRuleConfig> getConfigs() {
        return configs;
    }

    public void setConfigs(List<AppRuleConfig> configs) {
        this.configs = configs;
    }

    public static class AppRuleConfig {
        private String appId;
        private List<ApiLimit> limits;

        public AppRuleConfig() {}

        public AppRuleConfig(String appId, List<ApiLimit> limits) {
            this.appId = appId;
            this.limits = limits;
        }
        //...省略getter、setter方法...
    }

    @Data
    public class ApiLimit {

        private static final int DEFAULT_TIME_UNIT = 1; // 1 second
        private String api;
        private int limit;
        private int unit = DEFAULT_TIME_UNIT;

        public ApiLimit() {}

        public ApiLimit(String api, int limit) {
            this(api, limit, DEFAULT_TIME_UNIT);
        }

        public ApiLimit(String api, int limit, int unit) {
            this.api = api;
            this.limit = limit;
            this.unit = unit;
        }
        // ...省略getter、setter方法...
    }
}
