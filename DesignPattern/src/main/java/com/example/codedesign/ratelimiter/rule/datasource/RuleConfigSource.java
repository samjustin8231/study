package com.example.codedesign.ratelimiter.rule.datasource;

import com.example.codedesign.ratelimiter.rule.RuleConfig;

public interface RuleConfigSource {

    RuleConfig load();
}
