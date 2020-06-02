package com.example.codedesign.alert.refactor.msgsender;

import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/15 10:44 AM
 */
public class EmailMsgSender implements MsgSender {
    private List<String> mails;

    public EmailMsgSender(List<String> mails) {
        this.mails = mails;
    }

    @Override
    public void send(String message) {
        //...
    }
}
