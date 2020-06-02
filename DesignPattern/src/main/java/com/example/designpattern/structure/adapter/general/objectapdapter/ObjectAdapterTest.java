package com.example.designpattern.structure.adapter.general.objectapdapter;

import com.example.designpattern.structure.adapter.general.classadapter.Adaptee;
import com.example.designpattern.structure.adapter.general.classadapter.Target;

/**
 * @author sunyajun
 * @date 2020/4/15 11:34 AM
 */
//客户端代码
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
