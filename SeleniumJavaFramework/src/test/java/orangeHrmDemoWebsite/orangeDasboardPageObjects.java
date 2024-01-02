package orangeHrmDemoWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangeDasboardPageObjects {
	
	WebDriver driver = null;
	By admin_left_menu = By.xpath("//*[contains(@href,'admin')]");
	
	public orangeDasboardPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAdminMenu() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(admin_left_menu).click();
	}

}
