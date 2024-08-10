package Listeners;

import org.openqa.selenium.By;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ImplementationClass.class)
public class TestScript extends Bassclass 
{
    @Test
    public void login() 
    {
		 
		  driver.get("https://demowebshop.tricentis.com/");
     	  driver.findElement(By.linkText("Log in")).click();
     	  Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login page is not displayed");
     	  Reporter.log("Login page is Displayed", true);
     	  driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
     	  driver.findElement(By.id("Password")).sendKeys("abhis@1");
     	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
          Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not displayed");
          Reporter.log("Home Page is Displayed",true);
     	  
    }
}
