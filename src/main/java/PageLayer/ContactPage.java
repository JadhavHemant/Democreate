package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass {

		@FindBy(xpath = "//a[@href='/contacts']")
		private WebElement contactlink;

		@FindBy(xpath = "//a[@href='/contacts/new']")
		private WebElement createbutton;

		@FindBy(name = "first_name")
		private WebElement firstname;

		@FindBy(name = "last_name")
		private WebElement lastname;

		@FindBy(xpath = "//label[text()='Email']/following-sibling::div/descendant::input[@name='value']")
		private WebElement email;

		@FindBy(xpath = "//button[text()='Save']")
		private WebElement savebutton;

		// initialize the OR by using PageFactory.initElements() method
		public ContactPage() {
			PageFactory.initElements(driver, this);
		}

		public void createNewContact(String Fname, String Lname, String Email) {
			contactlink.click();
			createbutton.click();
			firstname.sendKeys(Fname);
			lastname.sendKeys(Lname);
			email.sendKeys(Email);
			savebutton.click();
		}

	}
