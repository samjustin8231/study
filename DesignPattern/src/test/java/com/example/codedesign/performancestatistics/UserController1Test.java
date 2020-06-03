package com.example.codedesign.performancestatistics;

import org.junit.Test;

public class UserController1Test {


    @Test
    public void register() {
        UserController1 userController = new UserController1();
        userController.register(null);
    }

    @Test
    public void login() {
    }
}