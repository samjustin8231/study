package com.example.designpattern.behavior.observer.event.jdk;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/14 4:13 PM
 */
@Data
public class Task {

    private String name;

    private TaskFinishStatus status;

    public Task(String name, TaskFinishStatus status) {
        this.name = name;
        this.status = status;
    }
}
