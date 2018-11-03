package com.brainware.setup;

import com.brainware.helper.*;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstPage {
	
	static String driverPath = "C:\\Selenium\\Driver\\";
	static String url= "http://10.208.218.58/scm";
	
	static WebDriver driver;
	
	static ConfigureProjectPageFactory cnfg;
	
	@BeforeSuite
	public static void setUp() {
		System.out.println("*******************");
		
	  	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//WebDriver driver;
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("*******************");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public static WebDriver testSCM(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement abcd= driver.findElement(By.id("ctl00_MainContentSection_loginCtl_UserName"));
		
		ExplicitWait.explicitWait(driver, abcd, 10);
		
		driver.findElement(By.id("ctl00_MainContentSection_loginCtl_UserName")).sendKeys("Administrator");
		driver.findElement(By.id("ctl00_MainContentSection_loginCtl_LoginButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		cnfg = new ConfigureProjectPageFactory(driver);
		
			
				
		System.out.println("Select Project");
		Select drpProject = new Select(cnfg.Project);
		drpProject.selectByVisibleText("PICI300");
				
		System.out.println("Select Settings");
		Select drpSettings = new Select (cnfg.Settings);
		drpSettings.selectByVisibleText("Processing Settings");
		
		System.out.println("Select Profile");
		Select drpProfile = new Select (cnfg.Profile);
		drpProfile.selectByVisibleText("0 - DEFAULT");
		
		return driver;
		
		/*		
		//driver.findElement(By.id("ctl00_MainContentSection_SettingsViewt12")).click();
		driver.findElement(By.id("ctl00_MainContentSection_SettingsViewt5")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='Help']"));
		driver.findElement(By.xpath("//p[1]/input[@name='ctl00$MainContentSection$RadioGroup1']"));
		driver.findElement(By.id("tooltip"));
		
		*/
		
		
		
	}


	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing IE browser");
			//driver.quit();
		}
	}
}
