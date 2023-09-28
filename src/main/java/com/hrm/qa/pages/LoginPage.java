package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "input-email")
	WebElement emailAddress;

	@FindBy(id = "input-password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;

	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement nalLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateNalLogo() {
		return nalLogo.isDisplayed();

	}

	public DashBoardPage login(String ea, String pwd) {
		emailAddress.sendKeys(ea);
		password.sendKeys(pwd);
		login.click();
		return new DashBoardPage();

	}

}
