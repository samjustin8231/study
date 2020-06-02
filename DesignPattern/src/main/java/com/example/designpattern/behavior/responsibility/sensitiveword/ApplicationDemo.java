package com.example.designpattern.behavior.responsibility.sensitiveword;

/**
 * @author sunyajun
 * @date 2020/4/14 5:09 PM
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());

        boolean legal = filterChain.filter(new Content());
        if (!legal) {
            // 不发表
        } else {
            // 发表
        }
    }
}
