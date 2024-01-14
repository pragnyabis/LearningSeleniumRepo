package SauceLab_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class swagLabLoginPageObjects {

	WebDriver driver = null;
	//By title_header = By.xpath("//*[contains(@classname,'title')]");
	By title_header = By.xpath("//div[@class='login_logo']");
	By username_textbox = By.name("user-name");
	By password_textbox = By.name("password");
	By submit_button = By.id("login-button");
	
	public swagLabLoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isTitleVisible() {
		System.out.println(driver.findElement(title_header).isDisplayed());
	}
	
	public void setTextInUsernameTextbox(String text) {
		driver.findElement(username_textbox).sendKeys(text);
	}
	
	public void clickUsernameTextbox() {
		driver.findElement(username_textbox).click();
	}
	
	public void setTextInPasswordTextbox(String text) {
		driver.findElement(password_textbox).sendKeys(text);
	}
	
	public void clickPasswordTextbox() {
		driver.findElement(password_textbox).click();
	}
	
	public void clickLoginButton() {		
		driver.findElement(submit_button).click();
		waitTiming(5000);		
	}
	
	public void waitTiming(int t) {
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
