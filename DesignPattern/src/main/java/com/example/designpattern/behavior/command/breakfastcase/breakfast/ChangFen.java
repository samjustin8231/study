package com.example.designpattern.behavior.command.breakfastcase.breakfast;


import com.example.designpattern.behavior.command.breakfastcase.chef.ChangFenChef;

/**
 * @author sunyajun
 * @date 2020/4/15 12:53 PM
 */
//具体命令：肠粉
class ChangFen implements Breakfast {
    private ChangFenChef receiver;

    ChangFen() {
        receiver = new ChangFenChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}