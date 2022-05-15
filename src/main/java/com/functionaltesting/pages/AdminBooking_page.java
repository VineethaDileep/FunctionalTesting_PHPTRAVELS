package com.functionaltesting.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminBooking_page {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@href=\"https://www.phptravels.net/api/admin/bookings\"]")
	 private WebElement home_link;
	 @FindBy(xpath="//*[@href=\"https://www.phptravels.net/api/admin/bookings\"]")
	 private WebElement booking;
	 @FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[14]/a")
	 private WebElement invoice;
	 
	 @FindBy(xpath="//*[@id=\"data\"]/tbody/tr[2]/td[15]/button")
	 private WebElement delete;
	 
	 @FindBy(xpath="//*[@id=\"booking_status\"]/option[2]")
	 private WebElement change_status;
	 
	 @FindBy(xpath="/html/body/nav/div/div/ul/li[1]/a")
	 private WebElement website;
	 
	 @FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[1]/a/div/div/div/div[1]/div[1]")
	 private WebElement ConfirmBooking_count;
	 
	 @FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[2]/a/div/div/div/div[1]/div[1]")
	 private WebElement PendingBooking_count;
	 
	 
	 
	
	 public AdminBooking_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 public void test_bookingLink() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 booking.click();
		 JavascriptExecutor ks = (JavascriptExecutor) driver;
		 ks.executeScript("window.scrollBy(0,600)", "");
		 
	 }
	 
	 public void display_invoice() throws InterruptedException
	 {
		 String MainWindow=driver.getWindowHandle();
		 invoice.sendKeys(Keys.ENTER);
		 Thread.sleep(4000);
		 driver.switchTo().window(MainWindow);
		 Thread.sleep(3000);
	 }
	 
	 public void delete_record() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 delete.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
	 }
	 
	 public void Change_StatusRecord() throws InterruptedException
	 {
		 String Txt1=PendingBooking_count.getText();
		 System.out.println("Pending Booking number Before Changing the status:"+ Txt1);
		 
		 String Txt2=ConfirmBooking_count.getText();
		 System.out.println("Confirmed Booking number Before Changing the status:"+ Txt2);
		 
		 change_status.click();
		 Thread.sleep(2000);
		 
		 String Txt3=PendingBooking_count.getText();
		 System.out.println("Pending Booking number After Changing the status:"+ Txt3);
		 
		 String Txt4=ConfirmBooking_count.getText();
		 System.out.println("Confirmed Booking number After Changing the status:"+ Txt4);
		 
		 
	 }
	 
	 public void test_website() throws InterruptedException
	 {
		 String MainWindow=driver.getWindowHandle();
		 website.click();
		 Thread.sleep(5000);
		 driver.switchTo().window(MainWindow);
		 Thread.sleep(5000);
	 }
	 
	
	 

}
