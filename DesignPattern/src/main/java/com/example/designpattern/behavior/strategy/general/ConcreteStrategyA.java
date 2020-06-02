package com.example.designpattern.behavior.strategy.general;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/14 11:47 AM
 */
@Slf4j
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        log.info("=====> 策略A算法");
    }
}
