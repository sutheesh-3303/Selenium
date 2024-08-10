package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo
{ 
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id :allwindowIds)
		{
			String ref = driver.switchTo().window(id).getCurrentUrl();
			if(ref.contains("flipkart"))
			{
			    driver.manage().window().setPosition(new Point(150, 150));
			}
			
			
			
		}
		
		
		}

}
