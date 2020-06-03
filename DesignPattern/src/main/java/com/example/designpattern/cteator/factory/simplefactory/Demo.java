package com.example.designpattern.cteator.factory.simplefactory;

/**
 * @author sunyajun
 * @date 2020/4/15 11:18 AM
 */
public class Demo {
    public static void main(String[] arg) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("MiPhone");            // make xiaomi phone!
        IPhone iPhone = (IPhone)factory.makePhone("iPhone");    // make iphone!
    }
}
