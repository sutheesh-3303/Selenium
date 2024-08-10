package Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ImplementationClass extends Bassclass implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test Script is failed", true);
		TakesScreenshot shot=(TakesScreenshot) driver;
		File temp = shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/Listimg.png");
	    try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
   
}
