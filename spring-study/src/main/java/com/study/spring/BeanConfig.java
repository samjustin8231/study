package com.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunyajun
 * @date 2020/5/23 10:41 下午
 */
@Configuration
public class BeanConfig {

    //生成Person实例
    @Bean(value = "userDao")
    public UserDao userDao() {
        return new UserDao();
    }
}
