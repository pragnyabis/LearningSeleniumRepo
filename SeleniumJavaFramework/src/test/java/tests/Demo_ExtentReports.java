package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo_ExtentReports {
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	WebDriver driver = null;
	
	@BeforeSuite
	public void setUp() {
		
		sparkReporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void googleSearchTest1() {
		
		ExtentTest test = extent.createTest("ExtentReportsTest1","TestNG Search Test Reporting");
		test.log(Status.INFO, "Log message");
		test.info("Info message");
		
		driver.get("https://google.com");
		test.pass("Successfully navigated to Google Search Page");
		
		driver.findElement(By.name("q")).sendKeys("TestNG");
		test.pass("Pass message");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pass message");
		
		//test.fail("Fail message", MediaEntityBuilder.createScreenCaptureFromPath("screenshot1.png").build());
		//test.addScreenCaptureFromPath("screenshot1.png");
	}
	
	@Test
	public void googleSearchTest2() {
		
		ExtentTest test = extent.createTest("ExtentReportsTest2","ExtentReports Search Test Reporting");
		test.log(Status.INFO, "Log message");
		test.info("Info message");
		
		driver.get("https://google.com");
		test.pass("Successfully navigated to Google Search Page");
		
		driver.findElement(By.name("q")).sendKeys("ExtentReports");
		test.pass("Pass message");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pass message");
		
		test.fail("Fail message", MediaEntityBuilder.createScreenCaptureFromPath("screenshot2.png").build());
		test.addScreenCaptureFromPath("screenshot2.png");
	}
	

	@Test
	public void googleSearchTest3() {
		
		ExtentTest test = extent.createTest("ExtentReportsTest3","Selenium Search Test Reporting");
		test.log(Status.INFO, "Log message");
		test.info("Info message");
		
		driver.get("https://google.com");
		test.pass("Successfully navigated to Google Search Page");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		test.pass("Pass message");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pass message");
		
		test.fail("Fail message", MediaEntityBuilder.createScreenCaptureFromPath("screenshot3.png").build());
		test.addScreenCaptureFromPath("screenshot3.png");
	}
	
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		//driver.quit();
	}
	
	@AfterSuite
	public void tearDown() {
		
		extent.flush();
	}

}
