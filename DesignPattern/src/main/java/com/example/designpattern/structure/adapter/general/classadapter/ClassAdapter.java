package com.example.designpattern.structure.adapter.general.classadapter;

/**
 * @author sunyajun
 * @date 2020/4/15 11:32 AM
 */
//类适配器类
class ClassAdapter extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}
