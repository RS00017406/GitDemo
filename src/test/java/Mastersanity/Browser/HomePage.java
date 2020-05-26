package Mastersanity.Browser;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String username, String Password) throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		//one is inheritance
		//creating object to that class and invoke methods of it
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();  
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
	  Object[][] data=new Object[1][2];
	  data[0][0]="nonrestricted";
	  data[0][1]="123456";
	  
	  return data;
	  
	  
	  
	}

}
