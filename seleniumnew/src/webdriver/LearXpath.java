package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearXpath
{
   public static void main(String[] args) 
   {
	   ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.get("https://demowebshop.tricentis.com/");
//	   1. drive.findElement(By.xpath("//input[@value='Log in']")).click();
//	    drive.findElement(By.xpath("//input[@value='Register']")).click();
//		drive.findElement(By.xpath("//div[@class=' nav-progressive-attribute']")).click();
		
		
//		2.xpath by text()method2345678987654321234567890-09876543234567890-093234567890-=***************************8*******88888
		
//		 drive.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
//		3.Xpath By contains!@#$%^&*()(*&^%$#@!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@)))
		
//		drive.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();
//		drive.findElement(By.xpath("//span[contains(text(),' Instagram from Meta')]")).click();
		
//		4.dependent & independent!@#$%^&*(*&^%$#@!@#$%^&^%$#@!@#$%^&^%$#@!@#$%^&^%$#@!@#$%^&^%$#@!@#$%^&^%$#@)
		
		drive.findElement(By.xpath("//a[text()='Build your own cheap computer']/../..//input[@value='Add to cart']")).click();
		
		

   }
}
