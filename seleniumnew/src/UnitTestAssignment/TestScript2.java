package UnitTestAssignment;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass2
{
   @Test
   public void SortbyBox()
   {
	   HomePage book=new HomePage(driver);
	   book.getBooksLink().click();
	   book.getSortbybox().click();
	   
	   Select selvalue=new Select(book.getSortbybox());
	   selvalue.selectByIndex(1);
	   Reporter.log("Assignment Successflly Tested", true);
   }
}
