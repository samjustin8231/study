package com.example.codedesign.performancestatistics.ood;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/28 5:54 下午
 */
@Data
public class RequestInfo {

    private String apiName;
    private double responseTime;
    private long timestamp;
}
