package com.example.codedesign.performancestatistics.ood;

import com.example.codedesign.performancestatistics.ood.aggregate.Aggregator;
import com.example.codedesign.performancestatistics.ood.storage.MetricsStorage;
import com.example.codedesign.performancestatistics.ood.viewer.StatViewer;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/28 6:52 下午
 */
public abstract class ScheduledReporter {
    protected MetricsStorage metricsStorage;
    protected Aggregator aggregator;
    protected StatViewer viewer;

    public ScheduledReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.viewer = viewer;
    }

    protected void doStatAndReport(long startTimeInMillis, long endTimeInMillis) {
        long durationInMillis = endTimeInMillis - startTimeInMillis;
        Map<String, List<RequestInfo>> requestInfos =
                metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
        Iterator<Map.Entry<String, List<RequestInfo>>> iterator = requestInfos.entrySet().iterator();
        while ((iterator.hasNext())) {
//            Map<String, RequestStat> requestStats = aggregator.aggregate(iterator.next().getValue(), durationInMillis);
//            viewer.output(requestStats, startTimeInMillis, endTimeInMillis);
        }

    }

}
