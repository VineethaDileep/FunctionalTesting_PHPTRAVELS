package com.functionaltesting.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_addfunds_page {
	
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a")
	 private WebElement addfunds;

	 @FindBy(xpath="/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[1]/div/div[2]/div/ul/label/label/label/label/div/div/div[1]/input")
	 private WebElement payment;
	 @FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button")
	 private WebElement PayNow_obj_button;
	 
	 
	 @FindBy(xpath="/html/body/div/div/div/div/div[1]")
	 private WebElement paypal_link;
	 @FindBy(xpath="/html/body/div/div[2]/div[2]")
	 private WebElement back_to_invoice;
	
	 
	 @FindBy(xpath="/html/body/div/div[2]/div[1]/a")
	 private WebElement Popup;
	 
	 
	 
	 public Customer_addfunds_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	
	public void addfunds_link() throws InterruptedException
	 {
		
		 Thread.sleep(3000);
		 addfunds.click();
		
	 }

	
	public void payment_link() throws InterruptedException
	{
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,450)", "");
		 Thread.sleep(3000);
		 payment.click();
		 Thread.sleep(3000);
		 PayNow_obj_button.click();
		 Thread.sleep(3000);
		
	}
	
	public void Paypal_linkclick() throws InterruptedException
	{
		 paypal_link.click();	
		 Thread.sleep(2000);
		
	}

	
	
	
}
