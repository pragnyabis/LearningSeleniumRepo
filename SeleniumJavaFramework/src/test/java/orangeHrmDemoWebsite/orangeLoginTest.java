package orangeHrmDemoWebsite;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeLoginTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("file:///C:/Users/DELL/Desktop/OrangeHRM.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void orangeLogin() {
		orangeLoginPageObjects loginObj = new orangeLoginPageObjects(driver);
		loginObj.waitTillTitleIsVisible();
		loginObj.clickUsernameTextbox();
		loginObj.setTextInUsernameTextbox("Admin");
		loginObj.clickPasswordTextbox();
		loginObj.setTextInPasswordTextbox("admin123");
		loginObj.clickLoginButton();
	}
	
	@Test
	public void orangeDasboard() {
		orangeDasboardPageObjects dashboardObj = new orangeDasboardPageObjects(driver);
		dashboardObj.clickAdminMenu();
		}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		//driver.quit();
	}

}
