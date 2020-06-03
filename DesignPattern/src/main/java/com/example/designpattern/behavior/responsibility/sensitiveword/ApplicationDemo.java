package com.example.designpattern.behavior.responsibility.sensitiveword;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/14 5:09 PM
 */
@Slf4j
public class ApplicationDemo {
    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());

        boolean legal = filterChain.filter(new Content("sex"));
        if (!legal) {
            // 不发表
            log.info("=====> legal:{} 不发表", legal);
        } else {
            // 发表
            log.info("=====> legal:{} 发表", legal);
        }
    }
}
