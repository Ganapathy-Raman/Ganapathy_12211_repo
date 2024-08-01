package com.gana.backend.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gana.backend.service.UserService;

@SpringBootTest
class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@Test
	void testFindByUserName() {
		assertNotNull(userService.findByUserName("tomi"));
	}

	@Test
	void testFindByUserName1() {
		assertNull(userService.findByUserName("prabha"));
	}

}
