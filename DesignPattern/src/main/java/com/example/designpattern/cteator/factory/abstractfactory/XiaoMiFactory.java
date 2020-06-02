package com.example.designpattern.cteator.factory.abstractfactory;

import com.example.designpattern.cteator.factory.simplefactory.MiPhone;
import com.example.designpattern.cteator.factory.simplefactory.Phone;

/**
 * @author sunyajun
 * @date 2020/4/15 11:22 AM
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
