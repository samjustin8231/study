package com.example.designpattern.cteator.factory.abstractfactory;

import com.example.designpattern.cteator.factory.simplefactory.Phone;

/**
 * @author sunyajun
 * @date 2020/4/15 11:22 AM
 */
public interface AbstractFactory {
    Phone makePhone();

    PC makePC();
}
