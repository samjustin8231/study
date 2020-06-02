package com.example.designpattern.behavior.iterator;

/**
 * @author sunyajun
 * @date 2020/4/15 1:00 PM
 */
//抽象聚合：婺源景点集接口
interface ViewSpotSet
{
    void add(WyViewSpot obj);
    void remove(WyViewSpot obj);
    ViewSpotIterator getIterator();
}