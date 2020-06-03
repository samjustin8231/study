package com.example.codedesign.ratelimiter.rule.parser;

import com.example.codedesign.ratelimiter.rule.RuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {

    RuleConfig parse(String configText);

    RuleConfig parse(InputStream in);
}
