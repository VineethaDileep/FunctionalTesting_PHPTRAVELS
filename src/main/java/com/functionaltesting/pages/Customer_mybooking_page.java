package com.functionaltesting.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class Customer_mybooking_page {
	
	WebDriver driver;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")
	 private WebElement mybooking_link;
	 @FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/a")
	 private WebElement voucher;
	 public Customer_mybooking_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
		

		public void mybooking_link_click() throws InterruptedException 
		{
			Thread.sleep(3000);
			mybooking_link.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			Thread.sleep(3000);
			
		}
		
		public void view_voucher()throws IOException,InterruptedException 
		{				
			String winHandleBefore = driver.getWindowHandle(); 
			voucher.click();
			Thread.sleep(4000);
			//Switch to new window opened
			for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle);
			}
			driver.close(); //this will close new opened window
			//switch back to main window using this code
			driver.switchTo().window(winHandleBefore);

		}
		
		

}
