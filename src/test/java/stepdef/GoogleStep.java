package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleStep {
	public WebDriver driver;

	@Given("Open Google application")
	public void open_google_application() {
		System.out.println("Google Application open");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");

	}

	@When("User get the current page title")
	public void user_get_the_current_page_title() {
		System.out.println("Title is: " + driver.getTitle());
		System.out.println("Title is captured");
	}

	@Then("Title should be Google")
	public void title_should_be_google() {

		Assert.assertTrue(driver.getTitle().contains("Google"), "Title is not matched");
		System.out.println("Title matched!");
		System.out.println("Title validation done");
	}

	@When("User enter valid keyword in search box")
	public void user_enter_valid_keyword_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Java");
	}

	@Then("User should get valid result")
	public void user_should_get_valid_result()
	{
		System.out.println("Search Result is:");
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}

}
