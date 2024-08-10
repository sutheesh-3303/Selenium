package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnManage 
{
	public static void main(String[] args) 
	{
		ChromeDriver drive= new ChromeDriver();
		drive.manage().window().fullscreen();
		
		drive.get("https://www.amazon.in/");
		
	}
	

}
