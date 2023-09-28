package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class AccountInfoPage extends TestBase{
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement ContinueButton;
	
	
	
	public AccountInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateAccountInfoPageTitle() {
		return driver.getTitle();
	}
	
	public DashBoardPage clickOnContinueButton()
	{
		ContinueButton.click();
		return new DashBoardPage();
	}

}
