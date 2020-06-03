package com.example.designpattern.behavior.iterator;

/**
 * 婺源景点类
 *
 * @author sunyajun
 * @date 2020/4/15 12:59 PM
 */
public class WyViewSpot {
    private String Name;
    private String Introduce;

    WyViewSpot(String Name, String Introduce) {
        this.Name = Name;
        this.Introduce = Introduce;
    }

    public String getName() {
        return Name;
    }

    public String getIntroduce() {
        return Introduce;
    }
}