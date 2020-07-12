package com.fitabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	WebDriver driver;
	
	
	public WelcomePage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver,this);
	
	}
	
	
	@FindBy(xpath="//td[contains(text(),'Manger Id')]")
	private WebElement txtMngId;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement lnkLogout;
	
	
	
	
	public boolean isMangerIdpreset()
	{
		
		return txtMngId.isDisplayed();
	}
	
	
	public void clickLogout()
	{
		
		lnkLogout.click();
	}
	
}
