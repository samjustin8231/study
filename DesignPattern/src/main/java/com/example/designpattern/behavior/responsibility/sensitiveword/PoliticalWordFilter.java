package com.example.designpattern.behavior.responsibility.sensitiveword;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * 反动过滤器
 *
 * @author sunyajun
 * @date 2020/4/14 5:06 PM
 */
@Slf4j
public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        log.info("=====> doFilter, content:{},legal:{}", JSON.toJSONString(content), legal);
        return legal;
    }
}
