package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 extends Browserlaunch{
	
	
	
	 public static void simPle() {
		 
		 
		 Actions action = new Actions(driver);
		 WebElement mainmanu = 
				 
				 driver.findElement(By.xpath("//a[text()='Simple']"));
				 
				 //driver.findElement(By.xpath("//a[text()='Accept']"));
				 
		 
		 
		 action.moveToElement(mainmanu);
		 action.click().build().perform();
	 }
	 
	 
	 public static void DragMe() throws Exception {
		 
		 
//		 WebElement from = driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
//		 Thread.sleep(2000);
//		 WebElement to = driver.findElement(By.xpath("//*[text()='Drop here']"));
//		 Thread.sleep(2000);
//	     Actions action = new Actions(driver);
//	     action.dragAndDrop(from, to).build().perform();
	     
	     
	     WebElement from = driver.findElement(By.xpath("//*[text()='Drag me']"));
		 Thread.sleep(2000);
		 WebElement to = driver.findElement(By.xpath("//*[text()='Drop here']"));
		 Thread.sleep(2000);
	     Actions action = new Actions(driver);
	     action.dragAndDrop(from, to).build().perform();
		 
		 
	     
	     
	     
		 
//		 Actions builder = new Actions(driver);
//		 builder.moveToElement(userName).click().keyDown(userName, Keys.SHIFT)//.sendKeys(userName, “testuser”)
//		 .keyUp(userName, Keys.SHIFT).doubleClick(userName).build().perform();
//
//		 // Enter the sign up keys after we passed the userName
//
//		 signUp.sendKeys(Keys.ENTER);
		
	 }

}
