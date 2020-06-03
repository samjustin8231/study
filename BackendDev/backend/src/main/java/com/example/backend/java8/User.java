package com.example.backend.java8;

import lombok.Data;

/**
 *
 * @author sunyajun 2019/5/2 5:17 PM
 */
@Data
public class User {
	private String name;

	private String email;

	public User() {
	}

	public User(String email, String name) {
		this.email = email;
		this.name = name;
	}
}
