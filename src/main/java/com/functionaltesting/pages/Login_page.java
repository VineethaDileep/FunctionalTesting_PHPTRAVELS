package com.functionaltesting.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/a[2]")
	 private WebElement login;
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
	 private WebElement email;
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
	 private WebElement password;
	 @FindBy(xpath="//*[@type=\"submit\"]")
	 private WebElement login_button_customer;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")
	 private WebElement logout_button_customer;
	 @FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small")
	 private WebElement customer_mainlink;
	 
	
	
	public Login_page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	

	public void Login_user() throws InterruptedException 
	{
		customer_mainlink.click();
		Thread.sleep(4000);
		
	}
	
	


	public void login_data(String username, String password2) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		email.sendKeys(username);
		password.sendKeys(password2);
		Thread.sleep(3000);
		login_button_customer.sendKeys(Keys.ENTER);	
	}
	
	public void logout_user() throws InterruptedException
	{
		Thread.sleep(3000);
		logout_button_customer.click();
		Thread.sleep(3000);
		
	}


	
	


	
}
