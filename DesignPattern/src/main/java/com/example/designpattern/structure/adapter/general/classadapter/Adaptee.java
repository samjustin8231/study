package com.example.designpattern.structure.adapter.general.classadapter;

/**
 * @author sunyajun
 * @date 2020/4/15 11:31 AM
 */
//适配者接口
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
