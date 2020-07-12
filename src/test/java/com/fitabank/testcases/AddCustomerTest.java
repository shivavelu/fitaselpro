package com.fitabank.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fitabank.base.BaseTest;
import com.fitabank.pages.AddCustomer;
import com.fitabank.pages.LoginPage;
import com.fitabank.pages.WelcomePage;

public class AddCustomerTest extends BaseTest {
	
	//@Test(priority=1)
	public void validUserlogin() throws InterruptedException
	{
	
		LoginPage lp= new LoginPage(driver);
		WelcomePage wp= new WelcomePage(driver);
		lp.enterUserId(userId);
		lp.enterPassword(password);
		lp.clickLogin();
	    Assert.assertTrue(wp.isMangerIdpreset());
		
	}
	
	@Test(priority=2)
	public void fillFormadduser()
	{
		LoginPage lp= new LoginPage(driver);
		WelcomePage wp= new WelcomePage(driver);
		lp.enterUserId(userId);
		lp.enterPassword(password);
		lp.clickLogin();
		AddCustomer ap= new AddCustomer(driver);
		ap.addCustomer();
		ap.enterCustormerName("userone");
		ap.genderSelection();
		ap.enterDOB("12", "12", "2006");
		ap.enterAddress("link road");
		ap.enterCity("bangalore");
		ap.enterState("karnataka");
		ap.enterPin("560000");
		ap.enterTeleNO("12314561");
		ap.enterEmail("user1@fitabank.com");
		ap.enterPassword("user@123");
		ap.submit();
		
	}

}
