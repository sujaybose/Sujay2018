package com.src.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SelTest {
	
	//WebDriver driver;
  @Test
  public void f() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 System.out.println("driver.getTitle()");
	  
	 
  }
}
