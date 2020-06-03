package com.example.codedesign.alert.refactor.msgsender;

import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/15 10:44 AM
 */
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }
}
