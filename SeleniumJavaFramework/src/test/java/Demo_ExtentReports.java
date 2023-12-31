import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo_ExtentReports {
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	WebDriver driver = null;
	
	@BeforeSuite
	public void setUpTest() {
		
		sparkReporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearchTest() {
		
		ExtentTest test = extent.createTest("ExtentReportsTest1","Google Seach Test Reporting");
		test.log(Status.INFO, "Log message");
		test.info("Info message");
		test.pass("Pass message");
		//test.fail("Fail message");
		test.addScreenCaptureFromPath("screenshot.png");
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ExtentReports");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@AfterSuite
	public void tearDownTest() {
		
		extent.flush();
		driver.close();
		//driver.quit();
	}

}
