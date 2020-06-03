package com.example.designpattern.cteator.factory;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:08
 */
@Service("businessInfoServiceImpl")
public class BusinessInfoServiceImpl implements IBusinessService {

    @Resource
    private BusinessChannelFactory businessChannelFactory;

    @Override
    public void getBusinessInfoList(String businessType) {
        IBusinessChannel businessChannel = businessChannelFactory.getBusinessChannel(businessType);
        businessChannel.getBusinessInfoList();
    }
}
