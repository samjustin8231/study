package com.example.codedesign.performancestatistics;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Test
    public void register() {
        userController.register(null);
    }

    @Test
    public void login() {
    }
}