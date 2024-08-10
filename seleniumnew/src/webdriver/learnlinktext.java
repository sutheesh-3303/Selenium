package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnlinktext
{ 
   public static void main(String[] args) throws InterruptedException 
   {
	ChromeDriver drive = new ChromeDriver();
	drive.manage().window().maximize();
	
	drive.get("https://demowebshop.tricentis.com/");
	drive.findElement(By.linkText("Log in")).click();
	Thread.sleep(20000);
	drive.findElement(By.linkText("Register")).click();
} 

}
