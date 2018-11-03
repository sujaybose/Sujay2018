package com.brainware.processing;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.brainware.setup.ConfigureProjectPageFactory;

import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	@BeforeTest
	public void TestAmount() {

		ConfigureProjectPageFactory cnfg = new ConfigureProjectPageFactory(driver);
		// TODO Auto-generated constructor stub
		driver.findElement(By.xpath("//a[@innertext='Field Settings']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("//input[@name='ctl00$MainContentSection$BRWAMTtxtFormat']"));

	}

}
