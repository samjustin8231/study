package com.example.designpattern.cteator.factory;

import org.springframework.stereotype.Component;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:04
 */
@Component("adBusinessChannelImpl")
public class AdBusinessChannelImpl implements IBusinessChannel {
    @Override
    public void getBusinessInfoList() {
        System.out.println("get ad business list.");
    }
}
