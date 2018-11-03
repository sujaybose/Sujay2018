package com.brainware.processing;

import org.testng.annotations.Test;

import com.brainware.setup.FirstPage;


import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Date {
	String url = "http://10.208.218.58/scm";
	FirstPage fp= new FirstPage();
	WebDriver driver;
	
	
	  @BeforeMethod
	  public WebDriver beforeTest() {
		  WebDriver wd= fp.testSCM(url);
		  return wd;		  
		  	
	  }
	
  @Test
  public void date() throws InterruptedException {
	  driver.findElement(By.xpath("//a[@class='selectednode']")).click();
	  driver.wait(3000);
	  //List<WebElement> name= driver.findElements(By.xpath("//span[@columnname='VerifierFormat']"))getClass().getTypeName();
	  
	 	  
  }


  @AfterMethod
  public void afterTest() {
	  driver.close();
  }

}