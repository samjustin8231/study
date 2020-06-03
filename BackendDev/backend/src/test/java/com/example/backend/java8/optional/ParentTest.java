package com.example.backend.java8.optional;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@Slf4j
public class ParentTest {

    @Resource
    private Parent parent;

    @Test
    public void getParentNameWithOptional() {
        Person son = new Person();
        String parentNameWithOptional = parent.getParentNameWithOptional(son);
        log.info(parentNameWithOptional);
    }

    @Test
    public void getParentNameWithOptional1() {
        Person son = new Person();
        Parent parent = new Parent();
        son.setParent(parent);
        String parentNameWithOptional = parent.getParentNameWithOptional(son);
        log.info(parentNameWithOptional);
    }

    @Test
    public void getParentNameWithOptional2() {
        Person son = new Person();
        Parent parent = new Parent();
        parent.setUserName("sam");
        son.setParent(parent);

        String parentNameWithOptional = parent.getParentNameWithOptional(son);
        log.info(parentNameWithOptional);
    }

}