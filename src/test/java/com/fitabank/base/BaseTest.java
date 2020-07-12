package com.fitabank.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fitabank.utilities.ReadProp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	ReadProp prop= new ReadProp();
	
	public String userId= prop.getUserName();
	public String password=prop.getPassword();
	
	public WebDriver driver;
	
	
	@Parameters({"browser"})
    @BeforeClass
	public void setUp(String browser)
	{
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get(prop.getUrl());
		
	}
    
    
    
    //@AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
	

}
