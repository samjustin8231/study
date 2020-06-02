package com.example.designpattern.cteator.builder.poolconfig;

/**
 * @author sunyajun
 * @date 2020/4/15 11:28 AM
 */
public class Demo {

    public static void main(String[] args) {

// 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}
