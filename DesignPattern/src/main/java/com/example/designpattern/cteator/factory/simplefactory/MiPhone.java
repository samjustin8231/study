package com.example.designpattern.cteator.factory.simplefactory;

/**
 * @author sunyajun
 * @date 2020/4/15 11:17 AM
 */
public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi phone!");
    }
}
