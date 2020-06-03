package com.example.backend.java8.optional;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * @author sunyajun
 * @date 2019/10/17 6:39 PM
 */
@Data
@Slf4j
public class Parent {

    private String userName;


    public String getParentNameWithOptional(Person son) {
        return Optional.ofNullable(son).map(Person::getParent).map(Parent::getUserName).orElse("--");
    }
}
