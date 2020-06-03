package com.example.backend.java8.stream;

import com.alibaba.fastjson.JSON;
import com.example.backend.java8.User;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/5/13 10:59 AM
 */
@Slf4j
public class ToMapDemo {
	public static void main(String[] args) {

		List<User> listNotRepeat = Arrays.asList(new User("www.baidu.com", "user"), new User("www.baidu2.com", "user2"));
		// 1.toMap正常情况，key不重复
		Map<String, String> mapNotRepeat = listNotRepeat.stream().collect(Collectors.toMap(User::getName, User::getEmail));
		log.info("mapNotRepeat:{}", JSON.toJSONString(mapNotRepeat));

		List<User> listRepeatName = Arrays.asList(new User("www.baidu.com", "user"), new User("www.baidu2.com", "user"));
		// 2.toMap正常情况，key重复
		Map<String, String> mapRepeat = null;
		try {
			mapRepeat = listRepeatName.stream().collect(Collectors.toMap(User::getName, User::getEmail));
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("mapRepeat:{}", JSON.toJSONString(mapRepeat));

		List<User> listRepeatName1 = Arrays.asList(new User("www.baidu.com", "user"), new User("www.baidu2.com", "user"));
		// 3.toMap正常情况，key重复
		Map<String, String> mapRepeat1 = listRepeatName1.stream().collect(Collectors.toMap(User::getName, User::getEmail, (oldValue, newValue) -> newValue));
		log.info("mapRepeat:{}", JSON.toJSONString(mapRepeat1));

	}
}
