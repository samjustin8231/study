package com.example.designpattern.behavior.responsibility.sensitiveword;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 敏感词过滤器链，使用了责任链模式</br>
 * 维护了多个过滤器，过滤内容时，每个过滤器多会过滤一下内容，直到某个过滤器验证不通过时返回false;否则返回true
 *
 * @author sunyajun
 * @date 2020/4/14 5:08 PM
 */
@Slf4j
public class SensitiveWordFilterChain {

    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public SensitiveWordFilterChain() {
        log.info("=====> new SensitiveWordFilterChain");
    }

    public SensitiveWordFilterChain(List<SensitiveWordFilter> filters) {
        this.filters = filters;
    }


    public void addFilter(SensitiveWordFilter filter) {
        log.info("=====> new addFilter, filter:{}", filter);

        this.filters.add(filter);
    }

    // return true if content doesn't contain sensitive words.
    public boolean filter(Content content) {
        log.info("=====> filter exec, content:{}", JSON.toJSONString(content));

        // 只要有一个不通过，则过滤不通过；所有的通过，才认为通过
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
