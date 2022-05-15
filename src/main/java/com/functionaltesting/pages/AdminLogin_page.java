package com.functionaltesting.pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin_page {
	
	

	 WebDriver driver;
	 
	
	 @FindBy(xpath="/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[1]/label/input")
	 private WebElement email;
	 
	
	 @FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input")
	 private WebElement password;
	
	 @FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
	 private WebElement submit;
	
	 @FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
	 private WebElement Backto_home;
	 
	 @FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[4]/div/div/div[2]/div/div/div[1]/div/a")
	 private WebElement Admin_link;
	 
	 
	 public AdminLogin_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 public void admin_linkclick()
	 {
		 Admin_link.sendKeys(Keys.ENTER);	
	 }
	 public void login(String name,String password1) throws InterruptedException
	 {
		 
		 email.clear();
		 email.sendKeys(name);
		 password.clear();
		 password.sendKeys(password1);
		 Thread.sleep(3000);
		 submit.click();
	 }
	 
	
	 
	

}
