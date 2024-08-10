package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivesionpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.get("https://www.agoda.com/en-in/");
		driver.get("https://www.woodenstreet.com/");
		
		Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@role='button']")).click();//p[text()='Close']
//		 driver.findElement(By.xpath("//p[text()='Close']")).click();
		 driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
	}

}
