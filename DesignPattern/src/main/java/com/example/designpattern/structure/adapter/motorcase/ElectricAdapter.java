package com.example.designpattern.structure.adapter.motorcase;

/**
 * @author sunyajun
 * @date 2020/4/15 11:38 AM
 */
//电能适配器
class ElectricAdapter implements Motor
{
    private ElectricMotor emotor;
    public ElectricAdapter()
    {
        emotor=new ElectricMotor();
    }
    public void drive()
    {
        emotor.electricDrive();
    }
}