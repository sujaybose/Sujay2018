package chrmTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class testChrme {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		
		driver.close();


	}

}
