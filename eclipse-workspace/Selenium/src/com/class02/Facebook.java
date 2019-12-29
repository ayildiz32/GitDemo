package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: Mercury Tours Registration: 
//Open chrome browser
//Go to “http://newtours.demoaut.com/”
//Click on Register Link
//Fill out all required info
//Click Submit
//User successfully registered
//(Create 2 scripts using different locators)

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		//Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();

	//	Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Ahmet");
		
	//	Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("yildiz");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("12345677");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("Ahmet.yildiz@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("richardson 123");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("dallas");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("TX");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("75000");
		Thread.sleep(2000);
//		driver.findElement(By.name("country")).sendKeys("1");
//		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Ahmet.yildiz@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("112233");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("112233");
		Thread.sleep(2000);
	
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		
		boolean flag=driver.findElement(By.xpath("//b[starts-with(text(),' Dear')]")).isDisplayed();
		if(flag) {
		System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		
		driver.close();
	}
}
