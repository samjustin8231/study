package com.example.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/6/4 9:43 PM
 */
@Slf4j
@RestController
public class IndexController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {

		return "helloll91";
	}
}
