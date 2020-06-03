package com.example.designpattern.behavior.state.mario.status;

import com.example.designpattern.behavior.state.mario.MarioStateMachine;
import com.example.designpattern.behavior.state.mario.State;

/**
 * @author sunyajun
 * @date 2020/4/14 5:31 PM
 */
public class FireMario implements IMario{

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return null;
    }

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
