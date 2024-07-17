package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(name = "email")
	private WebElement UserName;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement LogInButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void LogInPageFunctionality(String Email, String Pass) {
		UserName.sendKeys(Email);
		Password.sendKeys(Pass);
		LogInButton.click();
	}

}
