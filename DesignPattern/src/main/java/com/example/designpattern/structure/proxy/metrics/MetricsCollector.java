package com.example.designpattern.structure.proxy.metrics;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/15 10:53 AM
 */
@Slf4j
public class MetricsCollector {
    public void recordRequest(RequestInfo requestInfo) {
        log.info("=====> recordRequest[记录接口耗时], requestInfo:{}", JSON.toJSONString(requestInfo));
    }
}
