package com.example.codedesign.alert.refactor.msgsender;

import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/15 10:44 AM
 */
public class WechatMsgSender implements MsgSender {
    private List<String> account;

    public WechatMsgSender(List<String> account) {
        this.account = account;
    }

    @Override
    public void send(String message) {
        //...
    }
}
