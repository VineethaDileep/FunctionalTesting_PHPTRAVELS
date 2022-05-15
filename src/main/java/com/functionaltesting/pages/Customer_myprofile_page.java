package com.functionaltesting.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_myprofile_page {
	
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
	 private WebElement myprofile_link;
	 @FindBy(xpath="//*[@type=\"text\"][@name=\"address1\"]")
	 private WebElement address_line;
	 @FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	 private WebElement update_address_button;
	 
	 public Customer_myprofile_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 public void myprofile_link_click(String address) throws InterruptedException 
		{
			
			//to perform Scroll on application using Selenium
			myprofile_link.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)", "");
			Thread.sleep(4000);
			address_line.clear();
			address_line.sendKeys(address);
			Thread.sleep(3000);
			update_address_button.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			JavascriptExecutor ks = (JavascriptExecutor) driver;
			ks.executeScript("window.scrollBy(0,550)", "");
						
		}
}
