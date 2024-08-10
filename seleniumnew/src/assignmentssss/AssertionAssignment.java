package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionAssignment 
{
   @Test
   public void Loginpage()
   {
	   WebDriver driver= new ChromeDriver();
   	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   	
       driver.get("https://www.instagram.com/accounts/login/?next=%2Flogin%2F&source=desktop_nav");
       Assert.assertEquals(driver.getTitle(), "Login • Instagram","Login Page is not Display");
       Reporter.log("Login Page is Displyed", true);
   }
}
