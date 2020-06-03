package com.example.designpattern.behavior.iterator;

/**
 * 抽象迭代器：婺源景点迭代器接口
 *
 * @author sunyajun
 * @date 2020/4/15 1:00 PM
 */
interface ViewSpotIterator {
    boolean hasNext();

    WyViewSpot first();

    WyViewSpot next();

    WyViewSpot previous();

    WyViewSpot last();
}