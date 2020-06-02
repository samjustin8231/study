package com.example.designpattern.structure.adapter.general.objectapdapter;

import com.example.designpattern.structure.adapter.general.classadapter.Adaptee;
import com.example.designpattern.structure.adapter.general.classadapter.Target;

/**
 * @author sunyajun
 * @date 2020/4/15 11:33 AM
 */
//对象适配器类
class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
