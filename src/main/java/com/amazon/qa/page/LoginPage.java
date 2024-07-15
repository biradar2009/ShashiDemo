package com.amazon.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.Testbase.TestBase;

public class LoginPage extends TestBase {

	//Object repositery
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pass;
	
	
	@FindBy(name="login")
	WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement Forgotpassword;
	
	
	@FindBy(xpath="//a[contains(text(),'Create new account')]")
	WebElement Createnewaccount;
	
	
	@FindBy(xpath="//img[contains(@class,'fb_logo _8ilh img')]")
	WebElement Logo;
	
	
	///initiazation of pagefactory
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
///actions on login page
	
	public String  ValidateLOginTitle() {
	return	driver.getTitle();
	}
	
	public boolean ValidateLOginLOgo() {
		return Logo.isDisplayed();
	}
	
	public  void Login(String un,String pas) {
		email.sendKeys(un);
		
		pass.sendKeys(pas);
		
		login.click();
		
		
		///rerutn typepaging land
	}
	
}
