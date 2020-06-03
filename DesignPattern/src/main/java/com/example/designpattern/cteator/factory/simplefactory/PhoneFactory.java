package com.example.designpattern.cteator.factory.simplefactory;

/**
 * @author sunyajun
 * @date 2020/4/15 11:17 AM
 */
public class PhoneFactory {

    public Phone makePhone(String phoneType) {
        if (phoneType.equalsIgnoreCase("MiPhone")) {
            return new MiPhone();
        } else if (phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
