package assignmentssss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class mynthramove {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions move=new Actions(driver);
		move.moveToElement(men).perform();
		
		
		TakesScreenshot screen =(TakesScreenshot)driver;
		File temp = screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/myntracapture.png");
		FileHandler.copy(temp, dest);

	}

}
