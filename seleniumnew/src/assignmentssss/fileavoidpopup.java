package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileavoidpopup {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.freshersworld.com/user/register");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\eclip projects\\seleniumnew\\resume\\sutheeshResume.pdf");
		

	}

}
