package com.gana.backend.automationtesting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginTest {

	private WebDriver webDriver;

	@BeforeEach
	void init() {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:7775");
	}

	@Test
	void testLogin() {
		assertTrue(true, "This is a dummy assertion that always passes");
		webDriver.findElement(By.linkText("Login")).click();
		webDriver.findElement(By.name("username")).sendKeys("tomi");
		webDriver.findElement(By.name("password")).sendKeys("Tom@12345");
		webDriver.findElement(By.name("submit")).submit();

	}

}
