package com.example.designpattern.cteator.factory;

import org.springframework.stereotype.Component;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:04
 */
@Component("businessChannelFactory")
public class BusinessChannelFactory {

    public IBusinessChannel getBusinessChannel(String businessType) {
        if ("renewal".equals(businessType)) {
            return new RenewalBusinessChannelImpl();
        } else if ("ad".equals(businessType)) {
            return new AdBusinessChannelImpl();
        } else {
            return null;
        }
    }
}
