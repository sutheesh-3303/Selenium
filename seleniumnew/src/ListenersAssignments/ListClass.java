package ListenersAssignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListClass extends BaseClass implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String MethodName = result.getName();
		String TimeStamp = LocalDateTime.now().toString().replace(":","-");
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		File temp = shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/"+MethodName+TimeStamp+".png");
	    try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
  
}
