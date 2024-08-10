package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowhandlepopup {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
	     driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		
		switchtowindow(driver,"amazon");
		System.out.println(driver.getTitle());
		driver.close();
		
		switchtowindow(driver,"shoppersstack");
//		driver.close();
	}
	public static void switchtowindow(WebDriver driver,String expurl)
	{
		Set<String> childwindows = driver.getWindowHandles();
		for(String id:childwindows)
		{
			String URL = driver.switchTo().window(id).getCurrentUrl();
			if(URL.contains(expurl))
			{
				break;
			}
		}
	}

}
