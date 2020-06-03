package com.example.designpattern.cteator.factory.abstractfactory;

import com.example.designpattern.cteator.factory.simplefactory.IPhone;
import com.example.designpattern.cteator.factory.simplefactory.MiPhone;
import com.example.designpattern.cteator.factory.simplefactory.Phone;

/**
 * @author sunyajun
 * @date 2020/4/15 11:22 AM
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new MAC();
    }
}
