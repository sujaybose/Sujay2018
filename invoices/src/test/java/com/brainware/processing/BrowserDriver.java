package com.brainware.processing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BrowserDriver {
	
	public WebDriver driver;
	static String url;
	static String path;
	
	
	public BrowserDriver (String url, String path){
		driver= new InternetExplorerDriver();
		
		
	}

}
