package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidFileuploadpopup {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\eclip projects\\seleniumnew\\resume\\sutheeshResume.pdf");
		

	}

}
