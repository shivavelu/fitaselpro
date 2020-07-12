package com.fitabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	WebDriver driver;
	
	public AddCustomer(WebDriver rdriver)
	{
		this.driver=rdriver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(css="a[href='addcustomerpage.php']")
	WebElement lnkAddCustomer;
	
	@FindBy(css="input[name='name']")
	WebElement txtCustomerName;
	
	
	@FindBy(css="input[value='m']")
	WebElement rdoMale;
	
	@FindBy(css="input[value='f']")
	WebElement rdoFemale;
	

	@FindBy(css="#dob")
	WebElement dateDob;
	
	
	@FindBy(css="textarea[name='addr']")
	WebElement txtAddress;
	
	
	@FindBy(css="input[name='city']")
	WebElement txtCity;
	
	@FindBy(css="input[name='state']")
	WebElement txtState;
	
	@FindBy(css="input[name='pinno']")
	WebElement txtPinno;
	
	
	@FindBy(css="input[name='telephoneno']")
	WebElement txtTeleNo;
	
	
	@FindBy(css="input[name='emailid']")
	WebElement txtEmail;
	
	@FindBy(css="input[name='password']")
	WebElement txtPassword;
	
	
	@FindBy(css="input[value='Submit']")
	WebElement btnSubmit;
	
	
	public void addCustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void enterCustormerName(String customerName)
	{
		
		txtCustomerName.click();
		txtCustomerName.sendKeys(customerName);
	}
	
	public void genderSelection()
	{
		
		rdoMale.click();
		

	}

	public void enterDOB(String date, String month, String year)
	{
		
		//dateDob.click();
		dateDob.sendKeys(date);
		dateDob.sendKeys(month);
		dateDob.sendKeys(year);
		
	}
	
	public void enterAddress(String address)
	{
		txtAddress.click();
		txtAddress.sendKeys(address);
	}
	
	
	public void enterCity(String city)
	{
		txtCity.click();
		txtCity.sendKeys(city);
	}
	
	public void enterState(String state)
	{
		txtState.click();
		txtState.sendKeys(state);
	}
	
	
	public void enterPin(String pin)
	{
		txtPinno.click();
		txtPinno.sendKeys(pin);
	}
	
	public void enterTeleNO(String mobileNo)
	{
		txtTeleNo.click();
		txtTeleNo.sendKeys(mobileNo);
	}
	
	public void enterEmail(String email)
	{
		txtEmail.click();
		txtEmail.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.click();
		txtPassword.sendKeys(password);
	}
	
	public void submit()
	{
		btnSubmit.click();
	
	}
	
}
