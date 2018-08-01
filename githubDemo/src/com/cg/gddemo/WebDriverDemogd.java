package com.cg.gddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemogd {

	public static void main(String[] args) {
		try {
			
			
			System.setProperty("webdriver.chrome.driver","D:\\Saisree Mukka\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://github.com/login");
			
			 WebElement element1=driver.findElement(By.id("login_field"));
			 element1.sendKeys("mukkawarsaisree@gmail.com");
			 
			 WebElement element2=driver.findElement(By.id("password"));
			 element2.sendKeys("saisree@169");
			 element2.submit();
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
