package com.functionaltesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Supplier_login_page {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[1]/label/input")
	 private WebElement email;
	 
	 @FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input")
	 private WebElement password;
	
	 @FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
	 private WebElement submit;
	 
	 
	 public Supplier_login_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}

	 public void login2(String name,String password1) throws InterruptedException
	 {
		 email.clear();
		 email.sendKeys(name);
		 password.clear();
		 password.sendKeys(password1);
		 Thread.sleep(3000);
		 submit.click();
	 }


	 
	 
	 
}
