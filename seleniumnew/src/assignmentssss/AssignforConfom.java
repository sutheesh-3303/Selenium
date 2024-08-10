package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignforConfom {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert getmsg = driver.switchTo().alert();
		System.out.println(getmsg.getText());
		Thread.sleep(2000);
		getmsg.dismiss();
		WebElement returnmsg = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(returnmsg.getText());
		
		

	}

}
