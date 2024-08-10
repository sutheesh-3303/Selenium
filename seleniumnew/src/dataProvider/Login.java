package dataProvider;

import org.testng.annotations.DataProvider;

public class Login 
{
	@DataProvider
	public String[][] DataSender()
	{
		String[][] data=
		{
				{"mr-sutheesh","sutheesh234"},
				{"vikeyviky","vicky234"},
				{"endhuja2345","endhu345"}
	    };
		return data;
	}	
}
