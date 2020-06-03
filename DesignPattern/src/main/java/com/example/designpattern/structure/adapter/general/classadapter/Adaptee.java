package com.example.designpattern.structure.adapter.general.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配者接口
 *
 * @author sunyajun
 * @date 2020/4/15 11:31 AM
 */
@Slf4j
public class Adaptee {
    public Adaptee() {
        log.info("=====> new Adaptee");

    }

    public void specificRequest() {
        log.info("=====> specificRequest[Adaptee]");
        System.out.println("适配者中的业务代码被调用！");
    }
}
