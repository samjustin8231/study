package com.example.designpattern.cteator.factory.factorymethod;

import com.example.designpattern.cteator.factory.simplefactory.MiPhone;
import com.example.designpattern.cteator.factory.simplefactory.Phone;

/**
 * @author sunyajun
 * @date 2020/4/15 11:19 AM
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}