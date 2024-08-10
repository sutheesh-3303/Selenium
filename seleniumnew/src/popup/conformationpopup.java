package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert conformationpopup = driver.switchTo().alert();
		String conformmsg = conformationpopup.getText();
		System.out.println(conformmsg);
		Thread.sleep(2000);
		conformationpopup.accept();
		Thread.sleep(2000);
		String confor2mmsg = conformationpopup.getText();
		System.out.println(confor2mmsg);
		conformationpopup.accept();
		

	}

}
