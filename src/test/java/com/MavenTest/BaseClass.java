package com.Maven
Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void setUp() {
		System.setProperty("webdriver,chromedriver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println("This is my project");
		
	}
	public void failThis() {
		Assert.assertEquals(12, 13);
	}

}
