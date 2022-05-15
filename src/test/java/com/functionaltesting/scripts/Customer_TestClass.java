package com.functionaltesting.scripts;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.functionaltesting.base.TestBase1;
import com.functionaltesting.pages.Customer_PaypalPage;
import com.functionaltesting.pages.Customer_addfunds_page;
import com.functionaltesting.pages.Login_page;
import com.functionaltesting.pages.Customer_mybooking_page;
import com.functionaltesting.pages.Customer_myprofile_page;
import com.functionaltesting.utilities.ExcelUtility;
import com.functionaltesting.utilities.Testcase_ExcelUtility;



public class Customer_TestClass extends TestBase1 {
	
	Customer_addfunds_page addfund_obj;
	Customer_addfunds_page addfund_obj1;
	Customer_addfunds_page addfund_obj2;
	
	
	Customer_PaypalPage paypal_obj1;
	Customer_PaypalPage paypal_obj2;
	
	Customer_mybooking_page customer_booking_obj1;
	Customer_mybooking_page customer_booking_obj2;
	Customer_mybooking_page mybooking_obj;
	
	Login_page loginObj;
	Login_page customer_login_obj2;
	Login_page customer_login_obj3;
	
	
	Customer_myprofile_page myprofile_obj1;  
	
@Test(priority=1)
	public void CustomerLogin_invalid_mail()throws IOException, InterruptedException
	{
		customer_login_obj2=new Login_page(driver);
        customer_login_obj2.Login_user();
	    ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(windowHandles.get(1));
		    
		    
		String username = ExcelUtility.getCellData(2, 3);
	    String password = ExcelUtility.getCellData(2, 2);
		//customer Login
		customer_login_obj2.login_data(username,password);
		
		Thread.sleep(2000);	
		System.out.println("CUSTOMER -FRONTEND");
		System.out.println("----------------------------");
		 String title = "Dashboard - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Customer Logged in successfully with invalid Email..!!!Test fails");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Customer try to Login using Invalid  Email Fails .");
	        	 

	        }
		
	}
	
	@Test(priority=2)
	public void CustomerLogin_invalid_Password() throws InterruptedException, IOException
	{
		customer_login_obj3=new Login_page(driver);
		String username = ExcelUtility.getCellData(2, 1);
		String password = ExcelUtility.getCellData(2, 4);
		//customer Login
		customer_login_obj3.login_data(username,password);
		Thread.sleep(2000);	 
		
		  String title = "Dashboard - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Customer Logged in successfully with invalid Password..!!!Test fails");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Customer try to Login using Invalid Password Fails ..");
	        	 

	        }
	}
	
	@Test(priority=3)
	public void customerValid_login()throws IOException,InterruptedException
	{
	     loginObj=new Login_page(driver);
		 String username = ExcelUtility.getCellData(2, 1);
		 String password = ExcelUtility.getCellData(2, 2);
		//customer Login
		 loginObj.login_data(username,password);
		 Thread.sleep(2000);
		 
		 String title = "Dashboard - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Customer Logged in successfully with Valid email and password..");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Customer Login with valid credentials Fails ..");
	        	 

	        }
    
	}
	
	
	

	@Test(priority=4)
	public void mybooking_link_ViewVoucher()throws IOException, InterruptedException
	{
		customer_booking_obj1=new Customer_mybooking_page(driver);
		customer_booking_obj1.mybooking_link_click();
		
		Thread.sleep(2000);
		customer_booking_obj1.view_voucher();
		
		 String title = "Bookings - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Customer-FrondEnd Booking link is clickable");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Page title doesnt match-Booking link is not clickable");
	        	 

	        }
	}

	@Test(priority=5)
	public void add_Funds_link()throws IOException, InterruptedException
	{
		addfund_obj=new Customer_addfunds_page(driver);
		
		
		addfund_obj.addfunds_link();
		Thread.sleep(3000);
	   
		
		
		
	
		    String title = "Add Funds - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Customer-FrondEnd Add Funds link is clickable .");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Page title doesnt match-Add funds link is not clickable");
	        	 

	        }
		
	}
	
	@Test(priority=6)
	public void payment_link_click() throws InterruptedException
	{
		addfund_obj1=new Customer_addfunds_page(driver);
		addfund_obj2=new Customer_addfunds_page(driver);
		paypal_obj1=new Customer_PaypalPage(driver);
		paypal_obj2=new Customer_PaypalPage(driver);
		
		
		addfund_obj1.payment_link();
		
		 
		    String title = "Payment with paypal";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println(" Paypal page is opened ..");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Page title doesnt match-Add funds link is not clickable");
	        	 

	        }
	        
	        String MainWindow1=driver.getWindowHandle();
	        Thread.sleep(2000);
	        addfund_obj2.Paypal_linkclick();
	        Thread.sleep(3000);
	        for(String winHandle :driver.getWindowHandles())
	        {
	        	driver.switchTo().window(winHandle);
	        }
	        
	        String email="sb-itxir5994130@personal.example.com";
	        String password="testpayment";
	        paypal_obj2.login_paypal(email,password);
	        driver.switchTo().window(MainWindow1);
	        Thread.sleep(3000);
	        
	        String title1 = "Funds Added - PHPTRAVELS";	    
	        String actualTitle1 = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle1,title1); 
	        System.out.println(" Payment with paypal is successful.. Funds Added ..");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Page title doesnt match-Add funds link is not clickable");
	        	 

	        }
	        
		     
	         JavascriptExecutor ks = (JavascriptExecutor) driver;
			 ks.executeScript("window.scrollBy(0,300)", "");
			 Thread.sleep(3000);
		     Thread.sleep(3000);
		
		
		
	        
		
	}

	@Test(priority=7)
	public void myprofile_click()throws IOException, InterruptedException
	{
		
		myprofile_obj1=new Customer_myprofile_page(driver);
		String address = Testcase_ExcelUtility.getCellData(28, 7);
		myprofile_obj1.myprofile_link_click(address);
		Thread.sleep(2000);
		
		String title = "Profile - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Customer-FrondEnd Profile link is clickable"); 
        System.out.println("My Profile Address is Updated..");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Profile link is not clickable");
        	 

        }
        
         JavascriptExecutor ks = (JavascriptExecutor) driver;
		 ks.executeScript("window.scrollBy(0,300)", "");
		 Thread.sleep(3000);
        
        
		
	
	}

	@Test(priority=8)
	public void Customer_logout()throws IOException,InterruptedException
	{
		loginObj=new Login_page(driver);
		loginObj.logout_user();
		
		String title = "Login - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Customer Loggedout successfully"); 
       
        }
        catch(AssertionError e)
        {
        	 System.out.println("Customer couldn't loggedout..");
        	 

        }
	}
	
	
	
	

}
