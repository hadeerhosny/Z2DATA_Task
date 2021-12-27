package Tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearchTestCases extends TestBase{
	
	@Test
	public void googleSearchTest_01() throws InterruptedException, IOException{
		
		/*Search for [TestNG].*/

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("TestNg");
		
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
		
		/*Assert that the text of the fourth result is [TestNG Tutorial].*/
		
		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='v7W49e']/div"));
		for(int i=1;i<myElements.size();i++) {
			
			
			if (i==4) {
				
					driver.findElement(By.xpath("//div[@class='v7W49e']/div"+"["+i+"]"+"/div/div/div/a")).click();
					break;
				
			}
		
	}
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);            
	    File destination = new File(System.getProperty("user.dir")+ 
	        "/OutputScreenshot/Result.png");
	    
	    
	    FileUtils.copyFile(source,destination );
		Thread.sleep(5000);
	
	}
	
}