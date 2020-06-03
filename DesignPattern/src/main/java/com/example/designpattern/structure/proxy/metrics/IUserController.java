package com.example.designpattern.structure.proxy.metrics;

/**
 * @author sunyajun
 * @date 2020/4/15 10:51 AM
 */
public interface IUserController {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);
}
