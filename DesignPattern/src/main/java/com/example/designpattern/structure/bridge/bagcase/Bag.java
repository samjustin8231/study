package com.example.designpattern.structure.bridge.bagcase;

import com.example.designpattern.structure.bridge.bagcase.color.Color;

/**
 * @author sunyajun
 * @date 2020/4/15 11:47 AM
 */

//抽象化角色：包
abstract class Bag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}