package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign7 
{
   public static void main(String[] args) 
   {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoapp.skillrary.com/");
	  driver.findElement(By.linkText("LOGIN")).click();
      driver.findElement(By.id("email")).sendKeys("admin");
      driver.findElement(By.id("password")).sendKeys("admin");
      driver.findElement(By.id("keepLoggedInCheckBox")).click();
      driver.findElement(By.id("last")).click();
      String register = driver.getCurrentUrl();
      if (register.equals("https://demoapp.skillrary.com/admin/home.php")) 
  	{
  		System.out.println("page shoud be displayed");
  	}else
  	{
  		System.out.println("faild");
  	}
     
   }
}
