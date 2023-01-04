package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(name= "first_name")
	WebElement firstName;
	
	@FindBy(name= "last_name")
	WebElement lastName;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement saveButton;
	
	
	
	//initializing the page objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
		
	}
	
	public void createNewContact(String ftName, String ltName) {
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveButton.click();
		
		
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
}
