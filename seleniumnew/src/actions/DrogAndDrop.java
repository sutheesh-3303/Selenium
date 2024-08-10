package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act= new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		act.dragAndDrop(img1, trash).perform();
		Thread.sleep(2000);
		WebElement gallary = driver.findElement(By.xpath("//ul[@id='gallery']"));
		act.dragAndDrop(img1, gallary).perform();
		
		

	}

}
