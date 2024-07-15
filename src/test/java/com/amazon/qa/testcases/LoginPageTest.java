package com.amazon.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.Testbase.TestBase;
import com.amazon.qa.page.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage 	 loginpage ;
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void Setup() {
		initialization();
			//	LoginPageTest loginpagetest =new LoginPageTest
		loginpage =new LoginPage();
		
		
	}
	
	
	@Test
	public void LoginTitleTest() {
String title= loginpage.ValidateLOginTitle();
	
 Assert.assertEquals(title, "Facebook - log in or sign up");
	
	}
	
	
	@Test
	public void loginTest() {
loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		
		//assert.assertFalse(10==10);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
