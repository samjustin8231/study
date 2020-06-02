package com.example.designpattern.cteator.factory.factorymethod;

/**
 * @author sunyajun
 * @date 2020/4/15 11:20 AM
 */
public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        appleFactory.makePhone();        // make iphone!
    }
}
