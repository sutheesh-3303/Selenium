package webdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign3 
{
	public static void main(String[] args) throws InterruptedException 
	{
    ChromeDriver drive=new ChromeDriver();
    drive.manage().window().maximize();
    
    drive.get("https://www.shoppersstack.com/products_page/24");
    Thread.sleep(20000);
    drive.findElement(By.id("compare")).click();
    Set<String> allwindow = drive.getWindowHandles();
    
    for(String id:allwindow)
    {
    	String url = drive.switchTo().window(id).getCurrentUrl();
    	if(url.contains("ebay"))
    	{
    		drive.manage().window().maximize();
    	}
    	if(url.contains("flipkart"))
    	{
    		drive.close();
    	}
    	
    	Thread.sleep(1000);
    }
   
	}
	
}
