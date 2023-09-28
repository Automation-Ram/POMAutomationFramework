package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashBoardPage;
import com.hrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashboardPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test()
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Account Login");
	}

	@Test()
	public void nalLogoTest() {
		boolean flag = loginPage.validateNalLogo();
		Assert.assertTrue(flag);

	}

	@Test()
	public void loginTest() {
		dashboardPage = loginPage.login(prop.getProperty("emailAddress"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
