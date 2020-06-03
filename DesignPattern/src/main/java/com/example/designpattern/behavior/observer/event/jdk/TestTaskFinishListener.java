package com.example.designpattern.behavior.observer.event.jdk;

/**
 * @author sunyajun
 * @date 2020/4/14 4:18 PM
 */
public class TestTaskFinishListener {

    public static void main(String[] args) {

        //事件源
        Task source = new Task("用户统计", TaskFinishStatus.SUCCEDD);

        //任务结束事件
        TaskFinishEvent event = new TaskFinishEvent(source);

        //邮件服务监听器
        MailTaskFinishListener mailListener = new MailTaskFinishListener("takumiCX@163.com");
        SmsTaskFinishListener smsListener = new SmsTaskFinishListener("123456789");

        //事件发布器
        TaskFinishEventPublisher publisher = new TaskFinishEventPublisher();

        //注册邮件服务监听器
        publisher.register(mailListener);
        //注册短信服务监听器
        publisher.register(smsListener);

        //发布事件
        publisher.publishEvent(event);

    }
}
