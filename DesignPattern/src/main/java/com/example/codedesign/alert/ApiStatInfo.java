package com.example.codedesign.alert;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/15 10:40 AM
 */
@Data
public class ApiStatInfo {

    private Integer errorCount;

    private Integer maxErrorCount;

    private String api;
}
