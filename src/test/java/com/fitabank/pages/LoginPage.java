package com.fitabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='uid']")
	private WebElement txtUserId;
	
	@FindBy(css="input[name='password']")
	private WebElement txtPassword;
	
	
	@FindBy(css="input[name='btnLogin']")
	private WebElement btnLogin;
	
	
	public void enterUserId(String username)
	{
		
		txtUserId.sendKeys(username);
	}

	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	public void clickLogin()
	{
		
	   btnLogin.click();	
	}
	
}
