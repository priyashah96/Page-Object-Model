package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory or Object repository
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'login')]")
	WebElement LoginButton;
	
	//@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	//WebElement SignUp;
	
	//@FindBy(xpath="//img[contains(@class, 'img-responsive')]")
	//WebElement crmlogo;
	
	
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	//Actions:
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	//public boolean validateCRMImage() {
		//return crmlogo.isDisplayed();
	//}
	

	public HomePage clickOnLoginButtonLink() {
		LoginButton.click();
		
		return new HomePage();
		
	}

	public HomePage login() {
		email.sendKeys("priya.shah4996@gmail.com");
		password.sendKeys("Hapy@2005");
		LoginButton.click();
		
		return new HomePage();
		
		
	}

	
	
	
}
