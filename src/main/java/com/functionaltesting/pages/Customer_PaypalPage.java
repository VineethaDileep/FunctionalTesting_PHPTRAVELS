package com.functionaltesting.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Customer_PaypalPage {
	
	
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"email\"]")
	 private WebElement email;
	 @FindBy(xpath="//*[@id=\"btnNext\"]")
	 private WebElement next;
	 
	 @FindBy(xpath="//*[@id=\"password\"]")
	 private WebElement password;
	 @FindBy(xpath="//*[@id=\"btnLogin\"]")
	 private WebElement login;
	 @FindBy(xpath="//button[contains(.,'Pay Now')]")
	 private WebElement Paynow1;
	 
	 
	 
	 public Customer_PaypalPage(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 public void login_paypal(String Email_value,String password_value) throws InterruptedException
	 {		 
		 Thread.sleep(3000);
		 email.click();
		 email.sendKeys(Email_value);
		 Thread.sleep(2000);
		 next.click();
		 Thread.sleep(3000);
		 password.click();
		 password.sendKeys(password_value);
		 Thread.sleep(3000);
		 login.click();
		 Thread.sleep(3000);
		 Paynow1.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
	 }
	 
	 
	}
