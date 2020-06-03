package com.example.designpattern.structure.adapter.general.objectapdapter;

import com.example.designpattern.structure.adapter.general.classadapter.Adaptee;
import com.example.designpattern.structure.adapter.general.classadapter.Target;
import lombok.extern.slf4j.Slf4j;

/**
 * 对象适配器类
 *
 * @author sunyajun
 * @date 2020/4/15 11:33 AM
 */
@Slf4j
class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        log.info("=====> new ObjectAdapter[对象适配器]");
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
