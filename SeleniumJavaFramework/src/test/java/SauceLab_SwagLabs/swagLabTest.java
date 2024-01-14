package SauceLab_SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class swagLabTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void swagLabLogin() {
		swagLabLoginPageObjects loginObj = new swagLabLoginPageObjects(driver);
		loginObj.waitTiming(5000);
		loginObj.clickUsernameTextbox();
		loginObj.setTextInUsernameTextbox("standard_user");
		loginObj.clickPasswordTextbox();
		loginObj.setTextInPasswordTextbox("secret_sauce");
		loginObj.clickLoginButton();
	}
	
	@Test
	public void swagLabAddItems() {
		swagLabStandardUserPageObjects addItemsObj = new swagLabStandardUserPageObjects(driver);
		addItemsObj.waitTiming(5000);
		addItemsObj.clickAllAddToCartButtons();
	}
		
	@AfterTest
	public void tearDownTest() {
		driver.close();
		//driver.quit();
	}
}