package com.example.designpattern.behavior.observer.event.jdk;

import java.util.EventListener;

/**
 * @author sunyajun
 * @date 2020/4/14 4:16 PM
 */
public interface TaskFinishEventListner extends EventListener {

    void onTaskFinish(TaskFinishEvent event);

}
