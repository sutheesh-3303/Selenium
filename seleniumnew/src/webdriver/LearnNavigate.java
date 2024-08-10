package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigate
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.instagram.com/");
//		driver.navigate().to("https://www.instagram.com/"); it is similar to get method
		driver.navigate().to(new URL("https://www.instagram.com/"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
