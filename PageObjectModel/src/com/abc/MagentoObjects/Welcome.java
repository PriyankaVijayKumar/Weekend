package com.abc.MagentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	WebDriver driver;
	@FindBy(linkText="My Account")
	WebElement myacct;
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyaccount()
	{
		myacct.click();
	}

	


}
