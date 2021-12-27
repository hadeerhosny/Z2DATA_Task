package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class TestBase {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void intitiateTestCases() {
		
		/*Open google chrome.*/
		
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		/*Navigate to [https://www.google.com/ncr].*/
		
		driver.get("https://www.google.com/ncr");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterSuite
	public void finalizeTest() {
		
		/*Close google chrome.*/
		driver.quit();
		
	}
}
