package com.example.designpattern.behavior.observer.event.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/14 4:17 PM
 */
public class TaskFinishEventPublisher {

    private List<TaskFinishEventListner> listners = new ArrayList<>();

    //注册监听器
    public synchronized void register(TaskFinishEventListner listner) {
        if (!listners.contains(listner)) {
            listners.add(listner);
        }
    }

    //移除监听器
    public synchronized boolean remove(TaskFinishEventListner listner) {
        return listners.remove(listner);
    }


    //发布任务结束事件
    public void publishEvent(TaskFinishEvent event) {

        for (TaskFinishEventListner listner : listners) {
            listner.onTaskFinish(event);
        }
    }
}
