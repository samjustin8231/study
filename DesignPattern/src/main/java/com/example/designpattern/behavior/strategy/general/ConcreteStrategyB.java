package com.example.designpattern.behavior.strategy.general;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/14 11:48 AM
 */
@Slf4j
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        log.info("=====> 策略B算法");
    }
}
