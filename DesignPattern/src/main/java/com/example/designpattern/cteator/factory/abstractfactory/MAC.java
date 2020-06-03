package com.example.designpattern.cteator.factory.abstractfactory;

/**
 * @author sunyajun
 * @date 2020/4/15 11:21 AM
 */
public class MAC implements PC {
    public MAC() {
        this.make();
    }

    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make mac PC!");
    }
}
