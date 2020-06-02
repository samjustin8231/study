package com.example.codedesign.performancestatistics.ood;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/28 5:59 下午
 */
@Data
public class RequestStat {

    private double maxResponseTime;
    private double minResponseTime;
    private double avgResponseTime;
    private double p999ResponseTime;
    private double p99ResponseTime;
    private long count;
    private long tps;
}
