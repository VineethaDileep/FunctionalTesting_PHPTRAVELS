package com.functionaltesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHome_page {

	
	 WebDriver driver;
	
	 @FindBy(xpath="//*[@id=\"dropdownMenuProfile\"]")
	 private WebElement profile;
	 @FindBy(xpath="//*[@href=\"https://www.phptravels.net/api/admin/logout\"]")
	 private WebElement logout;
	 
	
	
	
	 
	 
	 public AdminHome_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 public void logout_admin() throws InterruptedException
	 {
		 Thread.sleep(3000);
			
		profile.click();
		Thread.sleep(3000);
		logout.click();
	 }
	 
	 
}
