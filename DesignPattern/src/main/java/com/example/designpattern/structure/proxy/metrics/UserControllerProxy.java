package com.example.designpattern.structure.proxy.metrics;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/15 10:52 AM
 */
@Slf4j
public class UserControllerProxy implements IUserController {

    private MetricsCollector metricsCollector;
    private UserController userController;

    public UserControllerProxy(UserController userController) {
        log.info("=====> new UserControllerProxy");
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    public UserControllerProxy(MetricsCollector metricsCollector, UserController userController) {
        this.metricsCollector = metricsCollector;
        this.userController = userController;
    }

    @Override
    public UserVo login(String telephone, String password) {
        log.info("=====> login[代理类]");
        long startTimestamp = System.currentTimeMillis();
        log.info("=====> login[前置通知]");

        // 委托
        UserVo userVo = userController.login(telephone, password);
        log.info("=====> login[后置通知]");

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo userVo = userController.register(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }
}
