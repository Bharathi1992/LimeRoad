package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
    public static WebDriver driver;
    public static Actions act;

	// 1 Launch Browser

	public static WebDriver launchBrowser(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup(); 
	driver = new ChromeDriver();
		}
	else if (browsername.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();
	}
	else if (browsername.equalsIgnoreCase("edge")) {

	WebDriverManager.edgedriver().setup(); 
	driver =new EdgeDriver();
	}
	driver.manage().window().maximize();

	return driver;
	}
	
	public static void moveCursorActions(WebElement target) {
		act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	
	// 2 get

	public static WebDriver launchurl(String url) {
		driver.get(url);
		return driver;
	}
	
	
}
	


