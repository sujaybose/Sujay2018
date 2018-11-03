package TestSCM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ConfigureProjectPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//select[@name='ctl00$MainContentSection$ProjectList']")
	WebElement Project;
	
	@FindBy(xpath="//select[@name='ctl00$MainContentSection$SettingsList']")
	WebElement Settings;

	@FindBy(xpath="//select[@name='ctl00$MainContentSection$ProfileList']")
	WebElement Profile;
	
	
	
	@FindBy(xpath="//a[@innertext='Company Code']")
	WebElement CompanyCode;
	
	public ConfigureProjectPageFactory(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectProject(WebDriver driver) {
		Project.click();
	}
	
	public void selectSettings(WebDriver Settings) {
		((WebElement) Settings).click();
	}
	
	public void selectProfile() {
		Profile.click();
	}
}
