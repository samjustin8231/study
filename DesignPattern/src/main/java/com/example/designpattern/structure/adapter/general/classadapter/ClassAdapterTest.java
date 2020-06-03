package com.example.designpattern.structure.adapter.general.classadapter;

/**
 * @author sunyajun
 * @date 2020/4/15 11:32 AM
 */
//客户端代码
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
