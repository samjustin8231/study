package com.example.designpattern.behavior.state.mario.status;

import com.example.designpattern.behavior.state.mario.State;

/**
 * @author sunyajun
 * @date 2020/4/14 5:25 PM
 */
public interface IMario {

    State getName();

    //以下是定义的事件
    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
