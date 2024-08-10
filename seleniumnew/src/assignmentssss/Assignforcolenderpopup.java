package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignforcolenderpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		Thread.sleep(3000);
		
		String month="September";
		int year=2024;
		int date=20;
		while (true) 
		{
			try 
			{
				driver.findElement(By.xpath("//span[text()='"+month+"']")).click();
				
				break;
			}
			catch (Exception e) 
			{
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}

	}

}
}
