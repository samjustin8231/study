package com.example.designpattern.behavior.responsibility.sensitiveword;

/**
 * 广告过滤器
 *
 * @author sunyajun
 * @date 2020/4/14 5:06 PM
 */
public class AdsWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        return legal;
    }
}
