package com.example.designpattern.behavior.iterator;

import java.util.ArrayList;

/**
 * 具体聚合：婺源景点集
 *
 * @author sunyajun
 * @date 2020/4/15 1:00 PM
 */
class WyViewSpotSet implements ViewSpotSet {
    private ArrayList<WyViewSpot> list = new ArrayList<WyViewSpot>();

    public void add(WyViewSpot obj) {
        list.add(obj);
    }

    public void remove(WyViewSpot obj) {
        list.remove(obj);
    }

    public ViewSpotIterator getIterator() {
        return (new WyViewSpotIterator(list));
    }
}