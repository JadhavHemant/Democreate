package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass {
	private static HomePage homepage;

	@Test(priority = 1)
	public void validateHomePageLogo() {

		// create object of HomePage class
		homepage = new HomePage();
		boolean actualLogoStatus = homepage.checkLogoStatus();
		Assert.assertTrue(actualLogoStatus);
	}

	@Test(priority = 2)
	public void validateHomePageText() {
		String actualText = homepage.captureHomePageText();
		Assert.assertEquals(actualText, "Deals Summary");
	}

	@Test(priority = 3)
	public void validateHomePageTitle() {
		Assert.assertEquals(homepage.getHomePageTitle(), "Cogmento CRM");
	}

	@Test(priority = 4)
	public void validateHomePageUrl() {
		boolean actualResult = homepage.getHomePageUrl().contains("cogmento");
		Assert.assertEquals(actualResult, true);
	}

}
