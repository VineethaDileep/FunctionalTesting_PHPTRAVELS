package com.functionaltesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SupplierBooking_page {

	
	 WebDriver driver;
		
	
	 @FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[2]/div[2]/a/div/div/div/div[1]/div[1]")
	 private WebElement PendingBooking_count;
	 @FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[2]/div[1]/a/div/div/div/div[1]/div[1]")
	 private WebElement ConfirmBooking_count;
	 
	 @FindBy(xpath="//*[@id=\"layoutDrawer_content\"]/main/div/div[2]/div[2]/a/div/div/div/div[1]/div[2]")
	 private WebElement Pending_bookings;
	 @FindBy(xpath="/html/body/nav/div/a/div")
	 private WebElement Dashboard;
	 

	 public SupplierBooking_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}

	public void BookingStatus_Change() throws InterruptedException
	 {
		 String Txt1=PendingBooking_count.getText();
		 System.out.println("Pending Booking number Before Changing the status:"+ Txt1);
		 
		 String Txt2=ConfirmBooking_count.getText();
		 System.out.println("Confirmed Booking number Before Changing the status:"+ Txt2);
		 
		 Pending_bookings.click();
		 Thread.sleep(3000);
		 JavascriptExecutor ks = (JavascriptExecutor) driver;
		 ks.executeScript("window.scrollBy(0,500)", "");
		 //Change_status.click();
		 Select status = new Select(driver.findElement(By.id("booking_status")));
		 status.selectByVisibleText("Confirmed");
		 Thread.sleep(3000);
		 Dashboard.click();
		 
		 String Txt3=PendingBooking_count.getText();
		 System.out.println("Pending Booking number After Changing the status:"+ Txt3);
		 
		 String Txt4=ConfirmBooking_count.getText();
		 System.out.println("Confirmed Booking number After Changing the status:"+ Txt4);
		 
		 int num1=Integer.parseInt(Txt2); 
		 int num2=Integer.parseInt(Txt4); 
		 
		 
		 if(num1>num2)
		 {
			 System.out.println("Confirmed Bookings count increased by 1.Booking status change is successful"); 
		 }
		 
		
		 
		 
	 }
	 
}
