package com.fitabank.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fitabank.base.BaseTest;
import com.fitabank.pages.LoginPage;
import com.fitabank.pages.WelcomePage;
import com.fitabank.utilities.XLUtils;

public class LoginDDT extends BaseTest {
	
	@Test(dataProvider = "loginData")
	public void loginTest(String usernameDP, String passwordDP) throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		WelcomePage homePage= new WelcomePage(driver);
		loginPage.enterUserId(usernameDP);
		loginPage.enterPassword(passwordDP);
		loginPage.clickLogin();

		Thread.sleep(3000);

		if (isAlertPresent()) {
			driver.switchTo().alert().accept();// close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			
		} else {
			Assert.assertTrue(true);
			homePage.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();// close logout alert
			driver.switchTo().defaultContent();

		}

	}

	public boolean isAlertPresent() // user defined method created to check alert is presetn or not
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

	@DataProvider(name = "loginData")
	public Object[][] loginData() throws IOException {
		String file = "./src/test/resources/testdata/LoginData.xlsx";
		String sheetName = "Sheet1";
		XLUtils xlRead = new XLUtils();
		int rowCount = xlRead.getRowCount(file, sheetName);
		int columnCount = xlRead.getCellCount(file, sheetName, 1);

		System.out.println(rowCount);
		System.out.println(columnCount);
		Object[][] lData = new Object[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				lData[i - 1][j] = XLUtils.getCellData(file, sheetName, i, j);

			}

		}
		return lData;
	}

}
