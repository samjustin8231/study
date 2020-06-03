package com.example.designpattern.structure.adapter.motorcase;

/**
 * @author sunyajun
 * @date 2020/4/15 11:38 AM
 */

//光能适配器
class OpticalAdapter implements Motor {
    private OpticalMotor omotor;

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }

    public void drive() {
        omotor.opticalDrive();
    }
}