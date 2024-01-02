package orangeHrmDemoWebsite;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class orangeLoginPageObjects {

	WebDriver driver = null;
	By title_header = By.xpath("//*[contains(@classname,'title')]");
	By username_textbox = By.name("username");
	By password_textbox = By.name("password");
	By submit_button = By.xpath("//*[contains(@type,'sub')]");
	
	public orangeLoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitTillTitleIsVisible() {
		//WebElement title_head = driver.findElement(title_header);
		/*Wait<WebDriver> wait =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(5))
			            .pollingEvery(Duration.ofMillis(500))
			            .ignoring(ElementNotInteractableException.class);
		wait.until(d -> title_head.isDisplayed());*/
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
