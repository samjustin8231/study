package com.example.designpattern.structure.proxy.metrics;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/15 10:52 AM
 */
@Slf4j
public class UserController implements IUserController {

    public UserController() {
        log.info("=====> new UserController");
    }

    @Override
    public UserVo login(String telephone, String password) {
        log.info("====> login[目标方法]");
        return null;
    }

    @Override
    public UserVo register(String telephone, String password) {
        log.info("====> register");
        return null;
    }
}
