package unittesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigrationAnnataion 
{
	@BeforeSuite
	public void beforesuit()
	{
		Reporter.log("BEFORESUIT", true);
	}
	@BeforeTest
	public void beforetest() 
	{
		Reporter.log("BEFORETEST", true);
	}
	@BeforeClass
	public void beforeclass() 
	{
		Reporter.log("BEFORECLASS", true);
	}
	@BeforeMethod
	public void beforemethod() 
	{
		Reporter.log("BEFOREMETHOD", true);
	}
	
   @Test
   public void sample()
   {
	  Reporter.log("Test SAMPLE", true);
   }
   @AfterMethod
   public void aftermethod()
   {
	   Reporter.log("AFTERMETHOD",true);
   }
   @AfterTest
   public void afterclass() 
   {
	   Reporter.log("AFTERCLASS", true);
   }
   @AfterTest
   public void aftertest()
   {
	   Reporter.log("AFTERTEST", true);
   }
   @AfterSuite
   public void aftersuit() 
   {
	   Reporter.log("AFTERSUIT", true);
   }
}
