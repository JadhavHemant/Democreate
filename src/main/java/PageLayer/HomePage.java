package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logoCRM1;

	@FindBy(xpath = "//div[@id='main-content']/descendant::div[@class='homepage-container']/preceding-sibling::div/descendant::div[@class='header']")
	private WebElement logoCRM;
	// initialize the OR using PageFactory.initElements() method in constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	

	public boolean checkLogoStatus() {
		return logoCRM1.isDisplayed();
	}

	public String captureHomePageText() {
		return logoCRM1.getText();
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getHomePageUrl() {
		return driver.getCurrentUrl();
	}

}
