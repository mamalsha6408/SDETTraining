package com.sdet.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAplication {

//	@Test
//	public void reg() {
//		System.out.print("Amazon reg");
//	}
//	
//	@Test
//	public void login() {
//		System.out.print("Amazon login");
//	}
//	
	
	@Test
	public void chrome1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://www.google.lk/");
		driver.close();
		driver.quit();
	}
	
	@Test
	public void chrome2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://www.google.lk/");
		driver.close();
		driver.quit();
	}
	
}
