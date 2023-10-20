package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserFactory;

public class HooksDemo 
{
	public WebDriver driver;
	
	@Before
	public void setup()
	{
		System.out.println("Application with browser will launch");
		
		//driver=new ChromeDriver();
		BrowserFactory br=new BrowserFactory();
		driver=br.setBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	
	@After
	public void tearDown()
	{
		System.out.println("Application with browser get closed");
		driver.close();
	}
}
