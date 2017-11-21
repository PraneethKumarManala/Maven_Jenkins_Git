package com.jenkins.praneeth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins_Test2 {

	@Test
	public void method1(){
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		
		System.out.println("Welcome to Jenkins");
		Assert.assertTrue(false);
	}
}
