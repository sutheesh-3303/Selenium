package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertboxassign {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		WebElement resultframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(resultframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertpopup = driver.switchTo().alert();
		String popupmsg = alertpopup.getText();
		System.out.println(popupmsg);
		Thread.sleep(2000);
		alertpopup.accept();

	}

}
