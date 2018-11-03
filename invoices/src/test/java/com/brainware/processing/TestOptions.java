package com.brainware.processing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.brainware.setup.ConfigureProjectPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class TestOptions {
	WebDriver driver;
	
	ConfigureProjectPageFactory cnfg = new ConfigureProjectPageFactory(driver);
	
	public static String path;
	
	public void setUpComboBox(String path) throws Exception {
		
		//WebDriver dr = cnfg.selectProject(driver);
		
		//WebElement element = driver.findElement(By.xpath(path)); //"//select[@name='ctl00$MainContentSection$ProjectList']"
		//ConfigureProjectPageFactory sel = new ConfigureProjectPageFactory();
		//cnfg.selectProject();
		
		

		
				
		
	}

}
