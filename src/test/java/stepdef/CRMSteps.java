package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class CRMSteps 
{
	public WebDriver driver;
	@Given("Open Crm application")
	public void open_crm_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://automationplayground.com/crm/");
	}

	@When("User click on SignIn Link")
	public void user_click_on_sign_in_link() 
	{
	    driver.findElement(By.linkText("Sign In")).click();
	    System.out.println("Clicked on Link");
	}

	@Then("SignIn page should be open")
	public void sign_in_page_should_be_open() {
	    Assert.assertTrue(driver.getTitle().contains("Login"),"Page not open");
	    System.out.println("SignIn Page is Open");
	}

	@Given("Open SignIn page")
	public void open_sign_in_page() {
		driver.findElement(By.linkText("Sign In")).click();
	}

	@When("User enter valid emailId {string}  and valid password {string}")
	public void user_enter_valid_email_id_and_valid_password(String email, String psw) {
	    driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(psw);
	    
	}

	@When("User click on Submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should be able login into crm application")
	public void user_should_be_able_login_into_crm_application() {
	    Assert.assertTrue(driver.getTitle().equals("Customers"),"Login fail");
	    System.out.println("Login Successfull!");
	}




}
