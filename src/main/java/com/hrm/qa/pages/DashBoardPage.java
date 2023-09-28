package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class DashBoardPage extends TestBase {

	@FindBy(xpath = "((//ul[@class='list-unstyled'])[8]//li//a)[1]")
	WebElement editAccountLink;
	
	

	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateDashboardPageTitle() {
		return driver.getTitle();
	}

	public AccountInfoPage clickOnEditAccountLink() {
		editAccountLink.click();
		return new AccountInfoPage();
	}

}
