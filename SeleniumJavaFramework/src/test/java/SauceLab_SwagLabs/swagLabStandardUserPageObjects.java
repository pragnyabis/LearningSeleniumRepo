package SauceLab_SwagLabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class swagLabStandardUserPageObjects {

	WebDriver driver = null;
	By title_header = By.xpath("//div[@class='Products']");
	By addToCart_button = By.xpath("//*[text()='Click Me']");
	
	public swagLabStandardUserPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void isTitleVisible() {
		System.out.println(driver.findElement(title_header).isDisplayed());
	}
	
	public void clickAllAddToCartButtons() {
		List<WebElement> buttons = driver.findElements(addToCart_button);
		
		for (WebElement btn : buttons) {
            btn.click();
            waitTiming(2000);
        }
	}
	
	public void clickProduct(String productName) {
		String pname = "//a[contains(.,'"+ productName +"')]";
		System.out.println(pname);
		By product = By.xpath(pname);
		driver.findElement(product).click();
	}
	
	
	public void waitTiming(int t) {
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
