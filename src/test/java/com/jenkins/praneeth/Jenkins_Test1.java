package com.jenkins.praneeth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkins_Test1 {

	@Test
	public void method1(){
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tomcat.apache.org");
		
		System.out.println("Welcome to Jenkins");
	}
}
