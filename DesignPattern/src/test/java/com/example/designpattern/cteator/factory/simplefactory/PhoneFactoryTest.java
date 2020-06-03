package com.example.designpattern.cteator.factory.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneFactoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void makePhone_NotOk() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.makePhone("a");
        phone.make();
    }

    @Test
    public void makePhone_MiPhone() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.makePhone("MiPhone");
        phone.make();
    }

    @Test
    public void makePhone_IPhone() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.makePhone("IPhone");
        phone.make();
    }
}