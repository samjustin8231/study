package com.example.designpattern.behavior.responsibility.sensitiveword;

/**
 * @author sunyajun
 * @date 2020/4/14 5:06 PM
 */
public interface SensitiveWordFilter {

    /**
     * 过滤内容是否包含敏感词，如果包含返回false，表示过滤后不通过；
     *
     * @param content
     * @return
     */
    boolean doFilter(Content content);
}
