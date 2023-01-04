package com.crm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	String sheetName = "Contacts";
	
	
	
	public ContactsPageTest() {
		super();	
}
	@BeforeMethod
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login();
		testUtil.switchToframe();
		contactsPage = homePage.clickOnContactsLink();
		
		
	}
	
	
	@Test
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing");
		
	}
	
	@Test (dataProvider = "getCRMTestData")
	public void validateCreateNewContact(String firstName, String lastName) {
		homePage.clickOnContactsLink();
		contactsPage.createNewContact(firstName, lastName);
		
	}
	
	@DataProvider
	public Object[][] getCRMTestData() throws InvalidFormatException {
		Object data[][] = TestUtil.getTestData(sheetName);
	return data;
	
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
