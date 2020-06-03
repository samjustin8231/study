package com.example.codedesign.performancestatistics.ood.viewer;

import com.example.codedesign.performancestatistics.ood.RequestStat;

import java.util.Map;

public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}
