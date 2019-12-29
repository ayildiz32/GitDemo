package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		final String expTitle="Syntax";
		String actTitle=driver.getTitle();
		
		if(expTitle.equals(actTitle)) {
			System.out.println("expected");
		}else {
			System.out.println("not expected");
		}
		
		driver.close();
	}

}
