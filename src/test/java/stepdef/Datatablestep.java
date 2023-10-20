package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooks.HooksDemo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utility.BrowserFactory;

public class Datatablestep 
{
	WebDriver driver=BrowserFactory.getDriver();
	
	
	//public WebDriver driver;
	@Given("Open orangehrm application")
	public void open_orangehrm_application() {
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password(DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<List<String>> alldata=data.cells();
		
		driver.findElement(By.name("username")).sendKeys(alldata.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(alldata.get(0).get(1));
		
		
	}

	@When("User click on button")
	public void user_click_on_button() {
		driver.findElement(By.className("oxd-button")).click();
	}

	@Then("User should be able to login and should be able to navigate to dashboard")
	public void user_should_be_able_to_login_and_should_be_able_to_navigate_to_dashboard() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login fail");
		System.out.println("Login completed!");
	}




}
