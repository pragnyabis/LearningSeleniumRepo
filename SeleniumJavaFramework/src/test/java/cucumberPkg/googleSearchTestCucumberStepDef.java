package cucumberPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchTestCucumberStepDef {
	
	WebDriver driver = null;
	
	@Given("I open a browser")
	public void i_open_a_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Given("I land on Google page")
	public void i_land_on_google_page() {
		driver.get("https://google.com");	
	}
	
	@When("^I type the (.*) in Search Bar$")
	public void i_type_in_search_bar(String searchValue) {
		driver.findElement(By.name("q")).sendKeys(searchValue);
	}
	
	@When("hit Enter key")
	public void hit_enter_key() {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	@Then("^I verify the (.*) of result page$")
	public void i_verify_the_result_page(String status) {
		WebElement ele = driver.findElement(By.xpath("//*[.='All']"));
		String isResultPageDisplayed = ele.isDisplayed() ? "pass" : "fail";
		//System.out.println(isResultPageDisplayed);
		Assert.assertTrue(isResultPageDisplayed.equalsIgnoreCase(status));
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		driver.close();
	}

}
