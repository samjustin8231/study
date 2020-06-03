package com.example.backend;

import com.alibaba.fastjson.JSON;
import com.example.backend.java8.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.NoSuchElementException;
import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OptionalTest {

	private User user;

	@Test(expected = NoSuchElementException.class)
	public void contextLoads() {
		Optional<User> emptyOpt = Optional.empty();
		emptyOpt.get();
	}

	@Test(expected = NullPointerException.class)
	public void whenCreateOfEmptyOptional_thenNullPointerException() {
		Optional<User> opt = Optional.of(user);
	}

	@Test
	public void whenCreateOfNullableOptional_thenOk() {
		String name = "John";
		Optional<String> opt = Optional.ofNullable(name);

		assertEquals("John", opt.get());
	}

	@Test
	public void whenCheckIfPresent_thenOk() {
		User user = new User("john@gmail.com", "1234");
		Optional<User> opt = Optional.ofNullable(user);
		assertTrue(opt.isPresent());

		assertEquals(user.getEmail(), opt.get().getEmail());

		// 满足，则执行Consumer
		opt.ifPresent(u -> checkIfEmailEquals(user, u));
	}

	private void checkIfEmailEquals(User user, User u) {
		log.info("checkIfEmailEquals");
		assertEquals(user.getEmail(), u.getEmail());
	}

	@Test
	public void whenEmptyValue_thenReturnDefault() {
		User user = null;
		User user2 = new User("anna@gmail.com", "1234");
		User result = Optional.ofNullable(user).orElse(user2);
		log.info("result:{}", JSON.toJSONString(result));
		assertEquals(user2.getEmail(), result.getEmail());
	}

	@Test
	public void whenValueNotNull_thenIgnoreDefault() {
		User user = new User("john@gmail.com", "1234");
		User user2 = new User("anna@gmail.com", "1234");
		User result = Optional.ofNullable(user).orElse(user2);

		assertEquals("john@gmail.com", result.getEmail());
	}

	@Test
	public void givenEmptyValue_whenCompare_thenOk() {
		User user = null;
		log.info("Using orElse");
		User result = Optional.ofNullable(user).orElse(createNewUser());
		log.info("Using orElseGet");
		User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
	}

	private User createNewUser() {
		log.info("Creating New User");
		return new User("extra@gmail.com", "1234");
	}

	@Test
	public void givenPresentValue_whenCompare_thenOk() {
		User user = new User("john@gmail.com", "1234");
		log.info("Using orElse");
		User result = Optional.ofNullable(user).orElse(createNewUser());
		log.info("Using orElseGet");
		User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
	}

	@Test
	public void whenMap_thenOk() {
		User user = new User("anna@gmail.com", "1234");
		String email = Optional.ofNullable(user)
				.map(u -> u.getEmail()).orElse("default@gmail.com");

		assertEquals(email, user.getEmail());
	}

	@Test
	public void whenFilter_thenOk() {
		User user = new User("anna@gmail.com", "1234");
		Optional<User> result = Optional.ofNullable(user)
				.filter(u -> u.getEmail() != null && u.getEmail().contains("@"));

		assertTrue(result.isPresent());
	}

	@Test
	public void whenFilter_thenOk1() {
		User user = new User("anna@gmail.com", "1234");
		Optional<User> result = Optional.ofNullable(user)
				.filter(u -> u.getEmail() == null);

		assertTrue(!result.isPresent());
	}
}
