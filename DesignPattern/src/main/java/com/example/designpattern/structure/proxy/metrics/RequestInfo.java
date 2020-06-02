package com.example.designpattern.structure.proxy.metrics;

/**
 * @author sunyajun
 * @date 2020/4/15 10:53 AM
 */
public class RequestInfo {

    private String name;

    private long responseTime;
    private long startTimestamp;

    public RequestInfo(String name, long responseTime, long startTimestamp) {
        this.name = name;
        this.responseTime = responseTime;
        this.startTimestamp = startTimestamp;
    }
}
