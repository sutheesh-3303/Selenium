package assignmentssss;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Sbiyono {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.id("password")).sendKeys("sutheesh");
		WebElement moving = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions move=new Actions(driver);
		move.moveToElement(moving).perform();
		move.clickAndHold().perform();
		File temp = driver.findElement(By.xpath("//input[@id='password']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/sbiShoot.png");
		FileHandler.copy(temp, dest);
		
		
		

		

	}

}
