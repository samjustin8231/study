package com.example.backend.spring.ioc.annotation;

import com.example.backend.java8.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/5/13 10:59 PM
 */
@Configuration
public class UserConfiguration {

	@Bean("user")
	public User getUser() {

		User user = new User("www.baidu.com", "hah");
		return user;
	}
}
