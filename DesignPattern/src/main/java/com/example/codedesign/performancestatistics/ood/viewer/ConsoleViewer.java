package com.example.codedesign.performancestatistics.ood.viewer;

import com.example.codedesign.performancestatistics.ood.RequestStat;
import com.google.gson.Gson;

import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/28 6:49 下午
 */
public class ConsoleViewer implements StatViewer {
    public void output(
            Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson(requestStats));
    }
}