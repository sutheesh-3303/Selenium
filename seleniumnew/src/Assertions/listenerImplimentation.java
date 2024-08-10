package Assertions;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listenerImplimentation implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test Script Failuer", true);
	}
    
}
