package com.AdactinCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.com.Baseclass;


public class Testbase extends Baseclass {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver =browserLaunch("chrome");
		openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement element = driver.findElement(By.name("username"));
		sendInputValue(element, "Admin");
		
		WebElement pass = driver.findElement(By.name("password"));
		sendInputValue(pass, "admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		clickTheElement(login);
		
	}
    
}
