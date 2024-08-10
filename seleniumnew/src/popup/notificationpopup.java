package popup;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class notificationpopup {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.redbus.in/");

	}

}
