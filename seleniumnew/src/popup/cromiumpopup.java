package popup;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cromiumpopup {

	public static void main(String[] args) 
	{
		ChromeOptions settings=new ChromeOptions();
//		settings.addArguments("--disable-notifications");
		settings.addArguments("--incognito");
		settings.addArguments("--start-fullscreen");
		 
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.redbus.in/");
		

	}

}
