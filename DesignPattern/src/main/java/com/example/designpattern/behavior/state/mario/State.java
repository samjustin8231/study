package com.example.designpattern.behavior.state.mario;

/**
 * 超级玛丽的四种状态
 */
public enum State {
    SMALL(0),// 小马里奥
    SUPER(1), // 超级马里奥
    FIRE(2), // 火焰马里奥
    CAPE(3); // 斗篷马里奥

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
