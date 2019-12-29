package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SouceDemo {
	
//	TC 1: Swag Labs Positive login: 
//		Open chrome browser
//		Go to “https://www.saucedemo.com/”
//		Enter valid username and valid password and click login 
//		Verify robot icon is displayed 
//		Verify “Products” text is available next to the robot icon
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("a.yildiz10");
		Thread.sleep(1000);
		
		
		

	}
}
