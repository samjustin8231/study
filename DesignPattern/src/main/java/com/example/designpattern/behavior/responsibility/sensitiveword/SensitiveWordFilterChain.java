package com.example.designpattern.behavior.responsibility.sensitiveword;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/14 5:08 PM
 */
public class SensitiveWordFilterChain {

    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    // return true if content doesn't contain sensitive words.
    public boolean filter(Content content) {
        // 只要有一个不通过，则过滤不通过；所有的通过，才认为通过
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
