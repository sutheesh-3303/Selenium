package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDoubleClick {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		WebElement doublclick = driver.findElement(By.xpath("//button[@id='add']"));
		Actions act=new Actions(driver);
		act.doubleClick(doublclick).perform();
		act.doubleClick(doublclick).perform();
		WebElement mineshclick = driver.findElement(By.xpath("//button[@id='minus']"));
		act.doubleClick(mineshclick).perform();
		

	}

}
