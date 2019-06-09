package com.tt.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md200\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.yahoo.com/");
		driver.manage().window().maximize();
		
		return driver;
		
	}
		
}
		
		

	


