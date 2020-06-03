package com.example.codedesign.performancestatistics;

import com.example.codedesign.performancestatistics.simple.Metrics;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.concurrent.TimeUnit;

/**
 * 应用场景：统计下面两个接口(注册和登录）的响应时间和访问次数
 * @author sunyajun
 * @date 2020/4/28 5:41 下午
 */
@Slf4j
@Controller
public class UserController1 {
    private Metrics metrics = new Metrics();

    public UserController1() {
        metrics.startRepeatedReport(60, TimeUnit.SECONDS);
    }

    public void register(UserVo user) {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamp("regsiter", startTimestamp);
        //...
        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("register", respTime);
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamp("login", startTimestamp);
        //...
        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("login", respTime);
        return null;
    }


}
