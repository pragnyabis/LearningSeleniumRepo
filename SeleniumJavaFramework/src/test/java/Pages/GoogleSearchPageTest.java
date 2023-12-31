package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearchTest();

	}
	
	public static void googleSearchTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("Selenium");
		searchPageObj.clickSearchBox();
		
		driver.close();
	}

}
