package com.fitabank.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fitabank.base.BaseTest;
import com.fitabank.pages.LoginPage;
import com.fitabank.pages.WelcomePage;



public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void validUserlogin() throws InterruptedException
	{
	
		LoginPage lp= new LoginPage(driver);
		WelcomePage wp= new WelcomePage(driver);
		lp.enterUserId(userId);
		lp.enterPassword(password);
		lp.clickLogin();
	    Assert.assertTrue(wp.isMangerIdpreset());
		
	}

}