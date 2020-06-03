package com.example.designpattern.structure.adapter.general.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 类适配器类
 *
 * @author sunyajun
 * @date 2020/4/15 11:32 AM
 */
@Slf4j
class ClassAdapter extends Adaptee implements Target {

    public ClassAdapter() {
        log.info("=====> new ClassAdapter[类适配器]");
    }

    public void request() {
        log.info("=====> request[ClassAdapter]");

        specificRequest();
    }
}
