package com.example.designpattern.cteator.factory.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiPhoneTest {

    @Test
    public void make() {
        Phone phone = new MiPhone();
        phone.make();
    }
}