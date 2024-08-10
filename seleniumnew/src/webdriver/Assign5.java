package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive=new ChromeDriver();
		drive.manage().window().maximize();

		drive.get("https://demowebshop.tricentis.com/");
		String parentId = drive.getWindowHandle();
		Thread.sleep(20000);
		drive.findElement(By.linkText("Facebook")).click();
		Set<String> allwindow = drive.getWindowHandles();

		for(String id:allwindow)
		{
			String url = drive.switchTo().window(id).getCurrentUrl();
			if(url.contains("Facebook"))
			{
				drive.close();
			}
		}
		drive.switchTo().window(parentId);
		String title = drive.getTitle();
		System.out.println(title);


	}

}
