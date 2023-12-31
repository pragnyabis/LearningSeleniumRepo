package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Demo_TestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		//driver.quit();
	}

}
