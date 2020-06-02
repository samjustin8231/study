package com.example.designpattern.behavior.template.general;

/**
 * @author sunyajun
 * @date 2020/4/14 3:49 PM
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();
}
