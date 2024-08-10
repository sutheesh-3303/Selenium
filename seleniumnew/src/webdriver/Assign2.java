package webdriver;
import java.net.MalformedURLException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2
{
  public static void main(String[] args) throws InterruptedException, MalformedURLException 
  {
	ChromeDriver drive = new ChromeDriver();
	drive.manage().window().maximize();
	
	drive.navigate().to("https://www.flipkart.com/");
	drive.manage().window().setSize(new Dimension(500, 500));
//	 Point position = drive.manage().window().getPosition();
//		System.out.println(position);
//		System.out.println(position.getX());
//		System.out.println(position.getY());
	    drive.manage().window().setPosition(new Point(150, 70));
//	    
//	    Thread.sleep(2000);
//		drive.navigate().back();
//		Thread.sleep(2000);
//		drive.navigate().forward();
	
	
	
  }
}
