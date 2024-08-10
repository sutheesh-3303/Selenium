package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(20000);
		String collection = drive.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
		System.out.println(collection);
	}

}
