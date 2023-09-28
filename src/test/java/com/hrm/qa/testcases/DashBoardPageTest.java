package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashBoardPage;
import com.hrm.qa.pages.LoginPage;

public class DashBoardPageTest extends TestBase {

	LoginPage loginPage;
	DashBoardPage dashBoardPage;

	public DashBoardPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashBoardPage=loginPage.login(prop.getProperty("emailAddress"), prop.getProperty("password"));

	}

	@Test()
	public void dashboardPageTitleTest() {
		String dashboardTitle = dashBoardPage.validateDashboardPageTitle();
		Assert.assertEquals(dashboardTitle, "My Account");
	}

	@Test()
	public void verifyEditYourAccInfoTest() {
		dashBoardPage.clickOnEditAccountLink();
	}

	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}

}
