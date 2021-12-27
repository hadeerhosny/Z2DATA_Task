package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearchTestCases extends TestBase{
	
	@Test
	public void googleSearchTest_01(){
		
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
}
	
}