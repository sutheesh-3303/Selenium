package ListenersAssignments;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestScript extends BaseClass 
{
	@Test
	public  void BookClick() 
	{
      driver.findElement(By.partialLinkText("BOOKS")).click();
      Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Book","BOOKS page is not displayed");
      Reporter.log("Home Page is Displayed",true);
	}
}
	
