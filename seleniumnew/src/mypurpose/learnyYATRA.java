package mypurpose;
import org.openqa.selenium.firefox.FirefoxDriver;

public class learnyYATRA 
{
	public static void main(String[] args)
	{
		FirefoxDriver drive=new FirefoxDriver();
		drive.manage().window().maximize();
		
		drive.get("https://www.yatra.com/");
	}

}
