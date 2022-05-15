package com.functionaltesting.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierHome_page {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"supplier\"]")
	 private WebElement supplierProfile_link;
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[3]/div/ul/li[2]/a")
	 private WebElement login_button;
	
	 
	 public SupplierHome_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 public void login1() throws InterruptedException
	 {
		 supplierProfile_link.click();
		 Thread.sleep(3000);
		 login_button.sendKeys(Keys.ENTER);
		 
	 }

	
	 
	
	 
	 

}
