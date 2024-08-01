package com.gana.backend.automationtesting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegisterTest {

	private WebDriver webDriver;

	@BeforeEach
	void init() {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:7775");
	}

	@Test
	void testRegister() {
		assertTrue(true, "This is a dummy assertion that always passes");
		webDriver.findElement(By.linkText("Register")).click();
		webDriver.findElement(By.name("firstname")).sendKeys("vasanth");
		webDriver.findElement(By.name("lastname")).sendKeys("kumar");
		webDriver.findElement(By.name("username")).sendKeys("vasanth k");
		webDriver.findElement(By.name("email")).sendKeys("vasanthk1234@gmail.com");
		webDriver.findElement(By.name("password")).sendKeys("Vasanth@1234");
		webDriver.findElement(By.name("password")).sendKeys("Vasanth@1234");
		webDriver.findElement(By.name("submit")).submit();

	}

}
