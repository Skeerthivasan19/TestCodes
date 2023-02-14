package com.baseclass.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rajku\\eclipse-workspace\\AdactinCucumber\\Driver\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("FireFox")) {

			System.setProperty("webdriver.gecko.driver", "path driver");

			driver = new FirefoxDriver();

		}

		else {
			System.out.println("check the browser name");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;

	}
	
	public static void openURL(String url) {
		driver.get(url);

	}
	
	public static void sendInputValue(WebElement ele,String str) {
		ele.sendKeys(str);

	}
	
	public static void clickTheElement(WebElement ele) {
		ele.click();
		

	}
	

}
