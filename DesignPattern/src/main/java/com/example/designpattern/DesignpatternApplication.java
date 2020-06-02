package com.example.designpattern;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
public class DesignpatternApplication {


    public static void main(String[] args) {

        Collection collection;
        ArrayList arrayList;
        LinkedList linkedList;
        BeanFactory beanFactory;
        ArrayBlockingQueue arrayBlockingQueue;
        CacheManager cacheManager;
        Integer i = new Integer(10);
        String.valueOf(1000);
        Integer.parseInt("100");
        Thread thread;
        ThreadPoolExecutor threadPoolExecutor;
        ConcurrentSkipListMap skipList;

        SpringApplication.run(DesignpatternApplication.class, args);
    }
}
