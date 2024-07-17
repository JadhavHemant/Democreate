package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;

public class ContactPageTest extends BaseClass {
	private static ContactPage contactpages;

	@Test(priority = 1)
	public void validateNewContact() {
		contactpages = new ContactPage();
		contactpages.createNewContact("Rahul", "Patil", "rahul@gmail.com");
	}

}
