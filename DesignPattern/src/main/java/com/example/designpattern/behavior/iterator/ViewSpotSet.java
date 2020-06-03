package com.example.designpattern.behavior.iterator;

/**
 * 抽象聚合：婺源景点集接口
 *
 * @author sunyajun
 * @date 2020/4/15 1:00 PM
 */
interface ViewSpotSet {
    void add(WyViewSpot obj);

    void remove(WyViewSpot obj);

    ViewSpotIterator getIterator();
}