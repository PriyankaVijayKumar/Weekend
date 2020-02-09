package com.abc.MagentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(id="send2")
	WebElement login;
	
		
		public Login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void enterEmail()
		{
			email.sendKeys("nithya.27.v@gmail.com");
		}
		public void enterpassword()
		
		{
			pass.sendKeys("Welcome@123");
		}
		public void clickOnLogin()
		{
			login.click();
		}
		



}
