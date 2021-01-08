package com.draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	
	public static WebDriver driver;
	public static void Browser() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jv20273\\eclipse-workspace\\DragAndDrop\\Chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.navigate().to("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
