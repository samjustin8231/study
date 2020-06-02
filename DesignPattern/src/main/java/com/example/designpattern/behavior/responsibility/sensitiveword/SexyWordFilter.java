package com.example.designpattern.behavior.responsibility.sensitiveword;

/**
 * 涉黄过滤
 *
 * @author sunyajun
 * @date 2020/4/14 5:06 PM
 */
public class SexyWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        return legal;
    }
}
