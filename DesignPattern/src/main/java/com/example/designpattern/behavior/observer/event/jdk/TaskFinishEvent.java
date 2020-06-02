package com.example.designpattern.behavior.observer.event.jdk;

import java.util.EventObject;

/**
 * @author sunyajun
 * @date 2020/4/14 4:14 PM
 */
public class TaskFinishEvent extends EventObject {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TaskFinishEvent(Object source) {
        super(source);
    }
}
