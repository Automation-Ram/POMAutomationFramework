package com.hrm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class DesktopPage extends TestBase{
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
	WebElement desktopPage;
	
	@FindBy(xpath = "(//ul[@class='list-unstyled']//li//a)[2]")
	WebElement MacBookPagelink;
	
	public DesktopPage() {
		PageFactory.initElements(driver, this);
	}
	
	public MacBookPage moveToDesktoplink()
	{
		desktopPage.click();
		MacBookPagelink.click();
		return new MacBookPage();
	}					
}


		
				
