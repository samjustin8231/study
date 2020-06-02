package com.example.codedesign.performancestatistics.simple;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Metrics核心类
 * Metrics类职责不单一，包含了多个功能：记录日志，存储，查询，统计，定时打印/发邮件</br>
 * 不好的设计</br>
 *
 * @author sunyajun
 * @date 2020/4/28 5:42 下午
 */
@Slf4j
public class Metrics {

    // Map的key是接口名称，value对应接口请求的响应时间或时间戳；
    private Map<String, List<Double>> responseTimes = new HashMap<>();
    private Map<String, List<Double>> timestamps = new HashMap<>();
    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public void recordResponseTime(String apiName, double responseTime) {
        log.info("=====> recordResponseTime, apiName:{}, responseTime:{}", apiName, responseTime);
        responseTimes.putIfAbsent(apiName, new ArrayList<>());
        responseTimes.get(apiName).add(responseTime);
    }

    public void recordTimestamp(String apiName, double timestamp) {
        timestamps.putIfAbsent(apiName, new ArrayList<>());
        timestamps.get(apiName).add(timestamp);
    }

    public void startRepeatedReport(long period, TimeUnit unit) {
        log.info("=====> startRepeatedReport exec...");
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                log.info("=====> startRepeatedReport run...");
                Gson gson = new Gson();
                Map<String, Map<String, Double>> stats = new HashMap<>();
                for (Map.Entry<String, List<Double>> entry : responseTimes.entrySet()) {
                    String apiName = entry.getKey();
                    List<Double> apiRespTimes = entry.getValue();
                    stats.putIfAbsent(apiName, new HashMap<>());
                    stats.get(apiName).put("max", max(apiRespTimes));
                    stats.get(apiName).put("avg", avg(apiRespTimes));
                }

                for (Map.Entry<String, List<Double>> entry : timestamps.entrySet()) {
                    String apiName = entry.getKey();
                    List<Double> apiTimestamps = entry.getValue();
                    stats.putIfAbsent(apiName, new HashMap<>());
                    stats.get(apiName).put("count", (double) apiTimestamps.size());
                }
                log.info("{}", gson.toJson(stats));
            }
        }, 0, period, unit);
    }

    private double max(List<Double> dataset) {//省略代码实现
        return 0;
    }

    private double avg(List<Double> dataset) {//省略代码实现
        return 0;
    }
}