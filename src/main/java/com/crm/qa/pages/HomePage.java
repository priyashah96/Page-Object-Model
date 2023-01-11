package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//a[contains(text(), 'contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(), '/contacts/new')]")
	WebElement newcontactsLink;
	
	
	@FindBy(xpath="//a[contains(text(), 'deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(), 'tasks')]")
	WebElement tasksLink;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		}
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactsLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		 newcontactsLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
