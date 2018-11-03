package com.brainware.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
  
  public static void explicitWait(WebDriver driver, WebElement element, int timeout) {
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
	  element.click();
	  
	  }
}
