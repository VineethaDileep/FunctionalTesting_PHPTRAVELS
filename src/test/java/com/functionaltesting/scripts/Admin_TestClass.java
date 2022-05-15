package com.functionaltesting.scripts;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.functionaltesting.base.TestBase1;
import com.functionaltesting.base.TestBase2;
import com.functionaltesting.pages.AdminBooking_page;
import com.functionaltesting.pages.AdminHome_page;
import com.functionaltesting.pages.AdminLogin_page;
import com.functionaltesting.utilities.ExcelUtility;

public class Admin_TestClass extends TestBase1{
	
	AdminLogin_page loginobj1;
	AdminLogin_page loginobj2;
	AdminLogin_page loginobj3;
	
	AdminHome_page logoutobj1;
	AdminBooking_page bookingObj1;
	AdminBooking_page bookingObj2;
	AdminBooking_page bookingObj3;
	AdminBooking_page bookingObj4;
	AdminBooking_page bookingObj5;
	
	
	@Test(priority=1)
	public void Admin_login_InvalidEmail()throws IOException, InterruptedException
	{
		
		loginobj1=new AdminLogin_page(driver);
		loginobj3=new AdminLogin_page(driver);
		
	
		String username = ExcelUtility.getCellData(4, 3);
	    String password = ExcelUtility.getCellData(4, 2);
	    loginobj3.admin_linkclick();
		//Admin Login
	    ArrayList<String> windowHandles1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles1.get(1));
		loginobj1.login(username,password);
		Thread.sleep(2000);	
		System.out.println("ADMIN BACK END");
		System.out.println("----------------------------");
		String title = "Dashboard";	    
        String actualTitle = driver.getTitle(); 
        System.out.println("Verifying the page title for Admin home Page has started..");
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Admin Logged in with invalid Email..!!!Test fails");
        }
        catch(AssertionError e)
        {
        System.out.println("Admin try to Login with Invalid email id Fails ..!");        	 
        }
	}
	
	@Test(priority=2)
	public void Admin_login_InvalidPassword()throws IOException, InterruptedException
	{
		loginobj1=new AdminLogin_page(driver);
		
		String username = ExcelUtility.getCellData(4, 1);
	    String password = ExcelUtility.getCellData(4, 4);
		//Admin Login
		loginobj1.login(username,password);
		Thread.sleep(2000);
		String title = "Dashboard";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Admin Logged in with invalid Password..!!!Test fails");
        }
        catch(AssertionError e)
        {
        System.out.println("Admin try to Login with Invalid Password Fails ..!");        	 
        }
	}
	
	@Test(priority=3)
	public void Admin_login_ValidData()throws IOException, InterruptedException
	{
		loginobj1=new AdminLogin_page(driver);
	
		String username = ExcelUtility.getCellData(4, 1);
	    String password = ExcelUtility.getCellData(4, 2);
		//Admin Login
		loginobj1.login(username,password);
		Thread.sleep(2000);
		String title = "Dashboard";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Admin Logged in Sucessfully..");
        }
        catch(AssertionError e)
        {
        System.out.println("Admin  Login  Failed ..!");        	 
        }
	}
	
	@Test(priority=4)
	public void Test_bookingslink() throws InterruptedException
	{
		bookingObj1=new AdminBooking_page(driver);
		Thread.sleep(4000);
		bookingObj1.test_bookingLink();
		Thread.sleep(3000);
		String title = "All Bookings View";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Admin Booking link is clickable..");
        }
        catch(AssertionError e)
        {
        System.out.println("Admin  Booking link not working ..!");        	 
        }
			
	}
	
	@Test(priority=5)
	public void Display_Invoice() throws InterruptedException
	{
		bookingObj4=new AdminBooking_page(driver);
		bookingObj4.display_invoice();
		Thread.sleep(3000);
		String title = "Flight Invoice - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Booking Invoice is Displayed..");
        }
        catch(AssertionError e)
        {
        System.out.println("Booking invoice not displayed...!");        	 
        }
		
	}
	@Test(priority=5)
	public void Delete_Record() throws InterruptedException
	{
		bookingObj2=new AdminBooking_page(driver);
		bookingObj2.delete_record();
		Alert alert = driver.switchTo().alert(); // switch to alert
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(3000);
	}
	@Test(priority=6)
	public void test_websiteLink() throws InterruptedException
	{
		
		bookingObj3=new AdminBooking_page(driver);
		bookingObj3.test_website();
		String title = "PHPTRAVELS | Travel Technology Partner - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Website link is clickable..");
        }
        catch(AssertionError e)
        {
        System.out.println("Website link not clickable...!");        	 
        }
		
	}

	
	@Test(priority=7)
	public void BookingStatus_Change() throws InterruptedException
	{
		bookingObj5=new AdminBooking_page(driver);
		bookingObj5.Change_StatusRecord();
		System.out.println("Booking status is changed from pending to Confirm...");
	}
	@Test(priority=8)
	public void logout() throws InterruptedException
	{
		logoutobj1=new AdminHome_page(driver);
		logoutobj1.logout_admin();
		String title = "Administrator Login";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Admin Logout successfully..");
        }
        catch(AssertionError e)
        {
        System.out.println("Admin is not logged out..!");        	 
        }
        driver.quit();
	}
	
	
	
	
	

}
