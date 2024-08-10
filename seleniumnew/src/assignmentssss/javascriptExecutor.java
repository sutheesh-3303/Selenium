package assignmentssss;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[@id='java8-doc-download']")).click();
		Thread.sleep(2000);
		
		
		switchtowindow(driver,"javase-jdk8-doc-downloads.html");
		driver.findElement(By.linkText("jdk-8u411-docs-all.zip")).click();
		Thread.sleep(2000);
		WebElement clickdownlode = driver.findElement(By.linkText("Download jdk-8u411-docs-all.zip"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clickdownlode);
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		driver.findElement(By.xpath("//button[@aria-label='close modal']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Java SE Development Kit 8 Documentation License Agreement")).click();
		Thread.sleep(2000);
		
		
		switchtowindow(driver,"licenses/javase8speclicense.html");
		driver.findElement(By.xpath("//button[@aria-label='close country selector']")).click();
		List<WebElement> heading = driver.findElements(By.tagName("strong"));
		for(WebElement capture:heading)
		{
			System.out.println(capture.getText());
		}
		
	}
	public static void switchtowindow(WebDriver driver,String expurl)
	{
		Set<String> handingwindows = driver.getWindowHandles();
		for(String id:handingwindows)
		{
			String URL = driver.switchTo().window(id).getCurrentUrl();
			if(URL.contains(expurl))
			{
				break;
			}
		}
	

	}

}
