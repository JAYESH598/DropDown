package com.dropdown1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownBrowser1 {
	
	
	public static WebDriver driver;  
	//if method is decelered with static also class level or global level properties should be static
	public static void Browser(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		
	}

	
	 public static void browserClose() 
	 {
		 driver.close();
	 }
}
