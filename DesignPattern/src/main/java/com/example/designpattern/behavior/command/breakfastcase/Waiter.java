package com.example.designpattern.behavior.command.breakfastcase;

import com.example.designpattern.behavior.command.breakfastcase.breakfast.Breakfast;

/**
 * @author sunyajun
 * @date 2020/4/15 12:52 PM
 */
//调用者：服务员
class Waiter
{
    private Breakfast changFen,hunTun,heFen;
    public void setChangFen(Breakfast f)
    {
        changFen=f;
    }
    public void setHunTun(Breakfast f)
    {
        hunTun=f;
    }
    public void setHeFen(Breakfast f)
    {
        heFen=f;
    }
    public void chooseChangFen()
    {
        changFen.cooking();
    }
    public void chooseHunTun()
    {
        hunTun.cooking();
    }
    public void chooseHeFen()
    {
        heFen.cooking();
    }
}
