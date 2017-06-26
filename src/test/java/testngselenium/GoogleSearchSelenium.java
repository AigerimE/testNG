package testngselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchSelenium {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String driverType){
		switch(driverType){
		case "chrome": 
			System.setProperty("webdriver.chrome.driver", "/Users/esenali/Desktop/Cybertek/BrowserDrivers/chromedriver");
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/esenali/Desktop/Cybertek/BrowserDrivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		
		default:
			break;
		}
	}
	
	@Test
  public void search() throws InterruptedException {
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium jobs" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement results = driver.findElement(By.xpath("//div[@id='resultStats']"));
		System.out.println(results.getText());
  }
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(1000);
		driver.quit();
	}
}











