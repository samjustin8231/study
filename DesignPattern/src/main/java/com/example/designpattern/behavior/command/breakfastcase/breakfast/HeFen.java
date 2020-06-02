package com.example.designpattern.behavior.command.breakfastcase.breakfast;

import com.example.designpattern.behavior.command.breakfastcase.chef.HeFenChef;

/**
 * @author sunyajun
 * @date 2020/4/15 12:54 PM
 */
//具体命令：河粉
class HeFen implements Breakfast
{
    private HeFenChef receiver;
    HeFen()
    {
        receiver=new HeFenChef();
    }
    public void cooking()
    {
        receiver.cooking();
    }
}