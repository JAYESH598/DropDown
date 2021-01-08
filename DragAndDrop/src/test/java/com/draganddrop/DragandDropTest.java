package com.draganddrop;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropTest extends Browserlaunch{
	
	
	
	@BeforeTest
	
	public static void test1() {
		
		Browserlaunch.Browser();
		
	}
	
	
	
	@Test
	public static void test2() throws Exception {
		Thread.sleep(2000);
		DragAndDrop2.simPle();
	}

	@Test
	 public static void test3() throws Exception {
		 Thread.sleep(2000);
		 DragAndDrop2.DragMe();
	 }
	
	@AfterTest
	
	 public static void driverclose() throws Exception {
		 Thread.sleep(2000);
		 
		 driver.quit();
	 }
}
