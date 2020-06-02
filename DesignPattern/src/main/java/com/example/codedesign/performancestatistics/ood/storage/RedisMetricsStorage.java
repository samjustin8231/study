package com.example.codedesign.performancestatistics.ood.storage;

import com.example.codedesign.performancestatistics.ood.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/28 5:56 下午
 */
public class RedisMetricsStorage implements MetricsStorage{
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }
}
