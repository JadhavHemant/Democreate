package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	private static LoginPage loginpage;

	@Parameters({"browsername"})
	@BeforeTest
	public void setUp(String browsername) {
		BaseClass.initialization(browsername);
	}

	@Test
	public void validateLoginFunctionality() {
		// capture username and password from properties file.
		String Email = prop.getProperty("USERNAME");
		String Pass = prop.getProperty("PASSWORD");

		// create object of LoginPage class
		loginpage = new LoginPage();
		// call associated method from LoginPage class.
		loginpage.LogInPageFunctionality(Email, Pass);
	}
	
	
	@AfterTest
	public void tearDown()
	{
//		driver.quit();
	}

}
