package com.example.designpattern.structure.bridge.bagcase;

/**
 * @author sunyajun
 * @date 2020/4/15 11:48 AM
 */
//扩展抽象化角色：挎包
class HandBag extends Bag {
    public String getName() {
        return color.getColor() + "HandBag";
    }
}