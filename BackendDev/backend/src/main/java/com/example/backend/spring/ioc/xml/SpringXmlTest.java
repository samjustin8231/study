package com.example.backend.spring.ioc.xml;

import com.alibaba.fastjson.JSON;
import com.example.backend.java8.User;
import com.example.backend.spring.ioc.annotation.UserConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类的实现描述：Spring xml中配置bean
 *
 * @author sunyajun 2019/5/13 10:49 PM
 */
@Slf4j
public class SpringXmlTest {

	public static void main(String[] args) {
		//通过xml文件中bean注入
		getUserBeanByXml();

		//通过@Configuration来注入到容器中
		getUserBeanByConfiguraion();
	}

	private static void getUserBeanByConfiguraion() {
		ApplicationContext ct = new AnnotationConfigApplicationContext(UserConfiguration.class);
		User user = (User) ct.getBean(User.class);
		log.info("user:{}", JSON.toJSONString(user));
	}

	private static void getUserBeanByXml() {
		ApplicationContext ct = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) ct.getBean("user");
		log.info("user:{}", JSON.toJSONString(user));
	}

}
