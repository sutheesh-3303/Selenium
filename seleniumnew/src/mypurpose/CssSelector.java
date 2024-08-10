package mypurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector
{
  public static void main(String[] args) 
  {
	ChromeDriver drive =new ChromeDriver();
	drive.manage().window().maximize();
	
	drive.get("https://demowebshop.tricentis.com/login");
    drive.findElement(By.cssSelector("//input[@value='Log in']")).click();
  }
}
