package com.dropdown1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown1Test extends DropdownBrowser1{
	
	
	@BeforeTest
	public void test1() throws Exception {
		
		Thread.sleep(2000);
		DropdownBrowser1.Browser();
		
	}
	
	@Test
	public void test2() throws Exception {
		Thread.sleep(2000);
		DropDown1Elements.eleMents();
	}
	
	
	@AfterTest
	public void broWser() throws Exception {
		Thread.sleep(2000);
		DropdownBrowser1.browserClose();
	}

}
