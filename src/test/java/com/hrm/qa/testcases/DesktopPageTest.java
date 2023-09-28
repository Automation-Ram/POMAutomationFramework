package com.hrm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashBoardPage;
import com.hrm.qa.pages.DesktopPage;
import com.hrm.qa.pages.LoginPage;

public class DesktopPageTest extends TestBase {
	

	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	DesktopPage desktopPage;

	public DesktopPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		desktopPage = new DesktopPage();
		dashBoardPage = loginPage.login(prop.getProperty("emailAddress"), prop.getProperty("password"));

	}

	@Test
	public void moveToDesktopLinkTest() {
		desktopPage.moveToDesktoplink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
