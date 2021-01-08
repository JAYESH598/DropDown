package com.dropdown1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropDown1Elements extends DropdownBrowser1{
	
	
	public static void eleMents() throws Exception {
		
		WebElement from = driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//*[text()='Drop here']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
	}

}
