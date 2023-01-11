package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login();
	}
	
	@Test
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page title not matched");
		
	}
	  
	@Test
	public void verifyContactsLinkTest() {
		testUtil.switchToframe();
		contactsPage = homePage.clickOnContactsLink();
	}
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
