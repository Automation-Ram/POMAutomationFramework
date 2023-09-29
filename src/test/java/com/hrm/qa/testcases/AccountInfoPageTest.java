package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.AccountInfoPage;
import com.hrm.qa.pages.DashBoardPage;
import com.hrm.qa.pages.LoginPage;

public class AccountInfoPageTest extends TestBase{
	
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	AccountInfoPage accountInfoPage;
	
	public AccountInfoPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashBoardPage =new DashBoardPage();
		accountInfoPage =new AccountInfoPage();
		dashBoardPage = loginPage.login(prop.getProperty("emailAddress"), prop.getProperty("password"));
	}
	
	@Test()
	public void verifyEditYourAccInfoTest() {
		dashBoardPage.clickOnEditAccountLink();
	}
	
	@Test()
	public void accountInfoPageTitleTest() {
		dashBoardPage.clickOnEditAccountLink();
		String accountInfoTitle = accountInfoPage.validateAccountInfoPageTitle();
		Assert.assertEquals(accountInfoTitle, "My Account Information");
	}
	
	@Test()
	public void clickOnContinueBtnTest()
	{
		dashBoardPage.clickOnEditAccountLink();
		accountInfoPage.clickOnContinueButton();
	}
	
	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}

}
