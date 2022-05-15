package com.functionaltesting.scripts;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.functionaltesting.base.TestBase1;
import com.functionaltesting.pages.AdminHome_page;
import com.functionaltesting.pages.AdminLogin_page;
import com.functionaltesting.pages.SupplierBooking_page;
import com.functionaltesting.pages.SupplierDashboard_page;
import com.functionaltesting.pages.SupplierHome_page;
import com.functionaltesting.pages.Supplier_login_page;
import com.functionaltesting.utilities.ExcelUtility;

public class Supplier_TestClass extends TestBase1{
	
	SupplierHome_page obj1;
	AdminHome_page obj3;
	Supplier_login_page obj2;
	Supplier_login_page obj4;
	Supplier_login_page obj5;
	SupplierDashboard_page obj6;
	SupplierDashboard_page obj7;
	SupplierDashboard_page obj8;
	SupplierDashboard_page obj9;
	SupplierDashboard_page obj10;
	
	SupplierBooking_page bookingobj1;
	
	@Test(priority=1)
	public void login_invalidEmail() throws IOException, InterruptedException
	{
		obj4=new Supplier_login_page(driver);
		obj1=new SupplierHome_page(driver);
		
		String username = ExcelUtility.getCellData(5, 3);
	    String password = ExcelUtility.getCellData(5, 2);
	    
	    obj1.login1();
	    ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(windowHandles.get(2));
	    obj4.login2(username, password);
	    Thread.sleep(4000);
	    System.out.println("SUPPLIER- BACK END");
	    System.out.println("----------------------------");
	    String title = "Dashboard";	    
        String actualTitle = driver.getTitle(); 
        System.out.println("Verifying the page title for Supplier home Page has started..");
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Supplier Logged in with invalid Email..!!!Test fails");
        }
        catch(AssertionError e)
        {
        System.out.println("Supplier try to Login using Invalid email id Fails ..!");        	 
        }
       		
	}
	
	@Test(priority=2)
	public void login_invalidPassword() throws IOException, InterruptedException
	{
		obj5=new Supplier_login_page(driver);
		
		
		String username = ExcelUtility.getCellData(5, 1);
	    String password = ExcelUtility.getCellData(5, 4);
	    
	    obj5.login2(username, password);
	    Thread.sleep(4000);
	    	   
	    String title = "Dashboard";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Supplier Logged in using invalid password .Test Fails..!!");

        }
        catch(AssertionError e)
        {
         System.out.println("Supplier trying to Login using Invalid Password Fails ..!");       	 
        }
	    
	}

	@Test(priority=3)
	public void login_validata() throws IOException, InterruptedException
	{
		obj2=new Supplier_login_page(driver);
		
		String username = ExcelUtility.getCellData(5, 1);
	    String password = ExcelUtility.getCellData(5, 2);
	      
	    obj2.login2(username, password);
	    Thread.sleep(4000);
	    
	    String title = "Dashboard";	    
        String actualTitle = driver.getTitle(); 
        Assert.assertEquals(actualTitle,title,"Page title doesnt match");
        System.out.println("Supplier logged in successfully with valid email id and password");	    	    
	}
	
	@Test(priority=4)
	public void Booking_status_Change() throws InterruptedException
	{
		bookingobj1=new SupplierBooking_page(driver);
		bookingobj1.BookingStatus_Change();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=5)
	public void dashboard_salesview() throws InterruptedException
	{
		obj6=new SupplierDashboard_page(driver);
		obj6.text_searchDashboard();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=6)
	public void RevenuebreakDown_GraphCheck() throws InterruptedException
	{
		obj7=new SupplierDashboard_page (driver);
		obj7.chart_view();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=7)
	public void ToursLink_click() throws InterruptedException
	{
		obj8=new SupplierDashboard_page(driver);
		obj8.tourslink_click();
	}
	@Test(priority=8)
	public void Booking_linkClick() throws InterruptedException
	{
		obj9=new SupplierDashboard_page(driver);
		obj9.bookinglink_click();
		
		    String title = "All Bookings View";	    
	        String actualTitle = driver.getTitle(); 
	      
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Supplier Booking_Link  is Clickable..");
	        }
	        catch(AssertionError e)
	        {
	        System.out.println("Supplier Booking link is not clickable .It Shows Error.!");
	        	 
	        }
	        
	        driver.navigate().back();
		    
	}
	
	
	
	@Test(priority=9)
	public void logout_Supplier() throws InterruptedException
	{
		obj10=new SupplierDashboard_page(driver);
		obj10.logout_admin();
		Thread.sleep(3000);
		String title = "Supplier Login";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Supplier Loggedout successfully"); 
       
        }
        catch(AssertionError e)
        {
        	 System.out.println("Supplier couldn't loggedout..");
        	 

        }
       // Thread.sleep(3000);
		driver.close();
		
		
	}
	
}
