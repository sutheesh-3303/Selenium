package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authendicationpopup {

	public static void main(String[] args) 
	{
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 		
 		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
