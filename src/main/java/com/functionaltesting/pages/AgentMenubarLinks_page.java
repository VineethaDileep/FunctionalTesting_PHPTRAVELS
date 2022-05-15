package com.functionaltesting.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgentMenubarLinks_page {
	
	 WebDriver driver;
	 WebDriverWait wait;

	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a")
	 private WebElement home_link;
	 
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")
	 private WebElement hotel_link;
	 
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	 private WebElement flight_link;
	 
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a")
	 private WebElement tours_link;
	 
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a")
	 private WebElement visa_link;
	 
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")
	 private WebElement blog_link;
	 
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[7]/a")
	 private WebElement offers_link;
	 
	 @FindBy(xpath="//*[@id=\"select2-hotels_city-container\"]")
	 private WebElement search_hotel_first;
	 
	 @FindBy(xpath="//*[contains(@class, 'select2-search__field')]")
	 private WebElement search_hotel_second;
	 
	 @FindBy(xpath="//*[@id=\"select2-hotels_city-results\"]")
	 private WebElement search_hotel_third;
	 
	 
	 @FindBy(xpath="//*[@id=\"submit\"]")
	 private WebElement search_button;
	 
	 @FindBy(xpath="//button[contains(.,'Account')]")
	 private WebElement profile_icon;
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[3]/div/ul/li[5]/a")
	 private WebElement logout;
	 
	 @FindBy(xpath="//*[@id=\"currency\"]")
	 private WebElement currency_type;
	 @FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[2]/div/ul/li[7]/a")
	 private WebElement target_currency_type;
	 
	 
		 
	 public AgentMenubarLinks_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 public void Home_link_click() throws InterruptedException
	 {
		 home_link.click();
		 JavascriptExecutor ks = (JavascriptExecutor) driver;
		 ks.executeScript("window.scrollBy(0,300)", "");
		 Thread.sleep(3000);
	 }
	 
	 public void Flight_link_click() throws InterruptedException
	 {
		 flight_link.click();
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)", "");
		 Thread.sleep(3000); 
	 }
	 
	 public void Tours_link_click() throws InterruptedException
	 {
		 tours_link.click();
		 JavascriptExecutor ms = (JavascriptExecutor) driver;
		 ms.executeScript("window.scrollBy(0,700)", "");
		 Thread.sleep(3000); 
	 }
	 
	 public void Visa_link_click() throws InterruptedException
	 {
		     visa_link.click();
			 Thread.sleep(3000); 
	 }
	 
	 
	 public void Blog_link_click() throws InterruptedException
	 {
		 
		 blog_link.click();
		 Thread.sleep(3000);
	 }
	 
	 public void Offers_link_click() throws InterruptedException
	 {
		 offers_link.click();
		
		 Thread.sleep(3000); 
	 }
	
	 
	 public void searchHotel(String city)throws InterruptedException
	 {
		 hotel_link.click();
		 Thread.sleep(3000);	 
		 search_hotel_first.click();
		 Thread.sleep(2000);
		 search_hotel_second.sendKeys("Dubai");
		 Thread.sleep(4000); 
		 search_hotel_third.click();
		 Thread.sleep(3000);
		 search_button.click();
		 Thread.sleep(3000);
		 
		 
	 }
	 
	 public void currency_update() throws InterruptedException
	 {
		 currency_type.click();
		 Thread.sleep(3000);
		 target_currency_type.click();
		 Thread.sleep(3000);	 

	 }


	public void logout_user() throws InterruptedException
	{
		profile_icon.click();
		Thread.sleep(3000);
		logout.click();
		Thread.sleep(3000);		
	}

	
	 
	 
	 

}
