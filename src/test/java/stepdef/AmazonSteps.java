package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps 
{
	public WebDriver driver;
	public String actTitle=null;
	
	@Given("Open Amazon application")
	public void open_amazon_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	}

	@When("User click on best sellers link")
	public void user_click_on_best_sellers_link() {
	    driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("user captured the actual title of Best sellers")
	public void user_captured_the_actual_title_of_best_sellers() {
	   actTitle=driver.getTitle();
	   System.out.println("Current title is: "+actTitle);
	}

	@Then("Title should be match with best sellers page title")
	public void title_should_be_match_with_best_sellers_page_title() {
	    
		Assert.assertTrue(actTitle.contains("Bestsellers"),"Title is not match");
		System.out.println("Title is matched!");
	}

	@When("User click on Todays deal link")
	public void user_click_on_todays_deal_link() {
	    driver.findElement(By.linkText("Today's Deals")).click();
	}

	@When("user captured the actual title of Todays deal page")
	public void user_captured_the_actual_title_of_todays_deal_page() {
	    actTitle=driver.getTitle();
	    System.out.println("Current page title is: "+actTitle);
	}

	@Then("Title should be match with Todays deal page title")
	public void title_should_be_match_with_todays_deal_page_title() {
	    Assert.assertTrue(actTitle.contains("2023"),"Title not match");
	    System.out.println("Title matched!");
	}

	@When("User click on Mobile link")
	public void user_click_on_mobile_link() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("user captured the actual title of Mobile")
	public void user_captured_the_actual_title_of_mobile() {
		actTitle=driver.getTitle();
	    System.out.println("Current page title is: "+actTitle);
	}

	@Then("Title should be match with Mobile page title")
	public void title_should_be_match_with_mobile_page_title() {
		 Assert.assertTrue(actTitle.contains("Phones"),"Title not match");
		    System.out.println("Title matched!");
	}

	@When("User click on Gift ideas link")
	public void user_click_on_gift_ideas_link() {
	    driver.findElement(By.linkText("Gift Ideas")).click();
	    
	}

	@When("user captured the actual title of Gifr ideas")
	public void user_captured_the_actual_title_of_gifr_ideas() {
		actTitle=driver.getTitle();
	    System.out.println("Current page title is: "+actTitle);
	}

	@Then("Title should be match with Gift ideas page title")
	public void title_should_be_match_with_gift_ideas_page_title() {
		Assert.assertTrue(actTitle.contains("Everyone"),"Title not match");
	    System.out.println("Title matched!");
	}




}
