package com.example.codedesign.performancestatistics.ood.storage;

import com.example.codedesign.performancestatistics.ood.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 *
 * @author sunyajun
 * @date 2020/4/28 5:53 下午
 */
public interface MetricsStorage {

    /**
     * 保存统计信息
     *
     * @param requestInfo
     */
    void saveRequestInfo(RequestInfo requestInfo);

    /**
     * 或者某个接口某个时间段内的统计信息列表
     *
     * @param apiName
     * @param startTimeInMillis
     * @param endTimeInMillis
     * @return
     */
    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    /**
     * 获取时间段内所有的api的统计信息
     *
     * @param startTimeInMillis
     * @param endTimeInMillis
     * @return
     */
    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
