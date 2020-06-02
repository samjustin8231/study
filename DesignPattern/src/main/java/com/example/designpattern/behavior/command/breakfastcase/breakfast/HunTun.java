package com.example.designpattern.behavior.command.breakfastcase.breakfast;

import com.example.designpattern.behavior.command.breakfastcase.chef.HunTunChef;

/**
 * @author sunyajun
 * @date 2020/4/15 12:54 PM
 */
//具体命令：馄饨
class HunTun implements Breakfast
{
    private HunTunChef receiver;
    HunTun()
    {
        receiver=new HunTunChef();
    }
    public void cooking()
    {
        receiver.cooking();
    }
}