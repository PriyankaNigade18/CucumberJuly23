package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmTest 
{
	public WebDriver driver;
	@Given("Open Hrm application")
	public void open_hrm_application()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		  
	}

	@When("User enter {string} and enter {string}")
	public void user_enter_and_enter(String un, String psw) {

		//username
		driver.findElement(By.name("username")).sendKeys(un);
		
		//password
		driver.findElement(By.name("password")).sendKeys(psw);
		
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		//login
				//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
				
				
				driver.findElement(By.className("oxd-button")).click();
	}

	@Then("Valid User should navigate to dashboard page")
	public void valid_user_should_navigate_to_dashboard_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login fail");
		System.out.println("Login completed!");
	}


}
