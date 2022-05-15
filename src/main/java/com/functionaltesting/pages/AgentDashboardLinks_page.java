package com.functionaltesting.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentDashboardLinks_page {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")
	 private WebElement mybooking_link;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a")
	 private WebElement addfunds;
	 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
	 private WebElement myprofile_link;
	 
	 public AgentDashboardLinks_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 public void MyBooking_link_click() throws InterruptedException
	 {
		 mybooking_link.click();
		 JavascriptExecutor ks = (JavascriptExecutor) driver;
		 ks.executeScript("window.scrollBy(0,300)", "");
		 Thread.sleep(3000);
	 }
	 
	 public void Addfunds_link_click() throws InterruptedException
	 {
		 addfunds.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(3000);
	 }
	 
	 public void Myprofile_link_click() throws InterruptedException
	 {
		 myprofile_link.click();
		 JavascriptExecutor ps = (JavascriptExecutor) driver;
		 ps.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(3000); 
	 }
	
	 
}
