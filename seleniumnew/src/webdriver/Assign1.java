package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		
		driver.manage().window().setSize(new Dimension(500, 500));
		driver.manage().window().setPosition(new Point(150, 70));
		
		Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
 		driver.navigate().forward();
				
	}
}
