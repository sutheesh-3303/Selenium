package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement resultframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(resultframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptmsg = driver.switchTo().alert();
		promptmsg.sendKeys("selenium");
		promptmsg.accept();
		WebElement hidemsg = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
		System.out.println(hidemsg.getText());

	}

}
