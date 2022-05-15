package com.functionaltesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierDashboard_page {
	
	 WebDriver driver;
		
	 @FindBy(xpath="//*[contains(text(),'Sales overview & summary')]")
	 private WebElement text_search;
	 
	 @FindBy(xpath="//*[@id=\"drawerAccordion\"]/div[1]/div/a[5]")
	 private WebElement tours_link1;
	 
	 @FindBy(xpath="//a[contains(.,'Tours')and@data-bs-target=\"#Tours\"]")
	 private WebElement tours_link2;	 
	 @FindBy(xpath="//a[contains(.,'Manage Tours')]")
	 private WebElement tours_link3;
	 
	 @FindBy(xpath="/html/body/nav/div/div/ul/li[2]/a")
	 private WebElement booking;
	 
	 @FindBy(xpath="//*[@id=\"dropdownMenuProfile\"]/i")
	 private WebElement profile;
	 
	 @FindBy(xpath="/html/body/nav/div/div/div/div[3]/ul/li[4]/a")
	 private WebElement logout;
	 
	 public SupplierDashboard_page(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
	 
	 
	 public void text_searchDashboard()
	 {
		 
		 if(driver.findElement(By.xpath("//*[contains(text(),'Sales overview & summary')]"))!= null)
		 {
			 System.out.println("\"Sales overview & summary-\" Text is present");
		}
		 else
		 {
			 System.out.println("\"Sales overview & summary-\"Text is absent");
		 }
	 }
	 
	 public void chart_view()
	 {
		 JavascriptExecutor ms = (JavascriptExecutor) driver;
		 ms.executeScript("window.scrollBy(0,700)", "");
		
		 if(driver.findElement(By.xpath("//*[@id=\"dashboardBarChart\"]"))!= null)
		 {

			 System.out.println("Revenue Brakdown 2022-Graph is Present");

		 }

			 else{

			 System.out.println("Revenue Brakdown 2022-Graph is Absent"); 

			 }
		
	 }
	 
	 public void tourslink_click() throws InterruptedException
	 {
		 tours_link1.click();
		 Thread.sleep(2000);
		 tours_link2.click();
		 Thread.sleep(2000);
		 tours_link3.click();
		 Thread.sleep(2000);
	 }
	 
	 public void bookinglink_click() throws InterruptedException
	 {
		 booking.click();
		 Thread.sleep(4000);
	 }
	 
	 public void logout_admin() throws InterruptedException
	 {
		 
		Thread.sleep(3000);	
		profile.click();
		Thread.sleep(3000);
		logout.click();
	 }
	 

}
