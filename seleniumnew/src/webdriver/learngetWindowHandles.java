package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learngetWindowHandles 
{
 public static void main(String[] args) throws InterruptedException 
{
	 ChromeDriver drive = new ChromeDriver();
	 drive.manage().window().maximize();
	 
	 drive.get("https://www.shoppersstack.com/products_page/24");
	 Thread.sleep(20000);
	 drive.findElement(By.id("compare")).click();
      Set<String> allindowsId = drive.getWindowHandles();
     System.out.println(allindowsId);
     for(String id:allindowsId)
     {
    	 System.out.println(id);
     }
     
}
}
