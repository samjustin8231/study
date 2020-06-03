package com.example.designpattern.structure.adapter.motorcase;

/**
 * @author sunyajun
 * @date 2020/4/15 11:39 AM
 */
//客户端代码
public class MotorAdapterTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor = (Motor) ReadXML.getObject();
        motor.drive();
    }
}