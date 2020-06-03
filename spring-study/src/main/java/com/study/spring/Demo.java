package com.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sunyajun
 * @date 2020/5/23 10:17 下午
 */
public class Demo {

    public static void main(String[] args) {
        // 准备spring所有的环境
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDao");
        userDao.find();
    }
}
