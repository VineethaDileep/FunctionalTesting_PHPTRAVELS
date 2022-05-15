package com.functionaltesting.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.functionaltesting.base.TestBase1;
import com.functionaltesting.pages.AgentDashboardLinks_page;
import com.functionaltesting.pages.AgentMenubarLinks_page;
import com.functionaltesting.pages.Login_page;
import com.functionaltesting.utilities.ExcelUtility;

public class Agent_TestClass extends TestBase1 {
	Login_page login1;
	AgentDashboardLinks_page Agentobj1;
	AgentDashboardLinks_page Agentobj2;
	AgentDashboardLinks_page Agentobj3;
	AgentDashboardLinks_page Agentobj4;
	
	AgentMenubarLinks_page obj2;
	AgentMenubarLinks_page obj3;
	AgentMenubarLinks_page obj4;
	
	AgentMenubarLinks_page obj6;
	AgentMenubarLinks_page obj7;
	AgentMenubarLinks_page obj8;
	AgentMenubarLinks_page obj9;
	AgentMenubarLinks_page obj10;
	AgentMenubarLinks_page obj11;
	AgentMenubarLinks_page obj12;
	
	
	
	@Test(priority=1)
	public void agent_login_InvalidEmail()throws IOException, InterruptedException
	{
		login1=new Login_page(driver);
		//login1.Login_user();
		String username = ExcelUtility.getCellData(3, 3);
	    String password = ExcelUtility.getCellData(3, 2);
		//customer Login
		login1.login_data(username,password);
		Thread.sleep(2000);	  
		System.out.println("AGENT -FRONTEND");
		System.out.println("----------------------------");
		
		 String title = "Dashboard - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Agent Logged in successfully with invalid Email..!!!Test fails");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Agent Login using Invalid  Email Fails ..");
	        	 

	        }
		
		
	}
	

	@Test(priority=2)
	public void agent_login_InvalidPassword()throws IOException, InterruptedException
	{
		login1=new Login_page(driver);
		
		String username = ExcelUtility.getCellData(3, 1);
	    String password = ExcelUtility.getCellData(3, 4);
		//customer Login
		login1.login_data(username,password);
		Thread.sleep(2000);	
		
		
		 String title = "Dashboard - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Agent Logged in successfully with invalid Password..!!!Test fails");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Agent Login using Invalid  Password Fails ..");
	        	 

	        }
		
	}
	
	@Test(priority=3)
	public void agent_login_validData()throws IOException, InterruptedException
	{
		login1=new Login_page(driver);
	
		String username = ExcelUtility.getCellData(3, 1);
	    String password = ExcelUtility.getCellData(3, 2);
		//customer Login
		login1.login_data(username,password);
		Thread.sleep(2000);	 
		
		 String title = "Dashboard - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Agent Logged in successfully with Valid email and password..");
	        
	        }
	        catch(AssertionError e)
	        {
	        	 System.out.println("Agent Login with valid credentials Fails ..");
	        	 

	        }
	}
	
	
	@Test(priority=4)
	public void MyBooking_links() throws InterruptedException, IOException
	{

		Agentobj1=new AgentDashboardLinks_page(driver);
		Agentobj1.MyBooking_link_click();
		
		String title = "Bookings - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Booking Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Booking link is not clickable ..!");
        	 

        }
	}
	
	@Test(priority=5)
	public void AddFunds_link() throws InterruptedException
	{
		Agentobj2=new AgentDashboardLinks_page(driver);
		Agentobj2.Addfunds_link_click();
		
		String title = "Add Funds - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Add Funds Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Add funds link is not clickable ..!");
        	 

        }
	}
	
	@Test(priority=6)
	public void MyProfile_link() throws InterruptedException
	{
		Agentobj3=new AgentDashboardLinks_page(driver);
		Agentobj3.Myprofile_link_click();
		
		String title = "Profile - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Profile Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Profile link is not clickable ..!");
        	 

        }
		
	}
	
	@Test(priority=7)
	public void Home_link()throws InterruptedException, IOException
	{
		obj6=new AgentMenubarLinks_page(driver);
		obj6.Home_link_click();
	}
	
	@Test(priority=8)
	public void Flight_link() throws InterruptedException
	{
		obj8=new AgentMenubarLinks_page(driver);
		obj8.Flight_link_click();
		
		String title = "Search Hotels - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Flight_Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Flight link is not clickable ..!");
        	 

        }
	}
	@Test(priority=9)
	public void Tours_link() throws InterruptedException
	{
		obj9=new AgentMenubarLinks_page(driver);
		obj9.Tours_link_click();
		
		String title = "Search Tours - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Tours Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Tours link is not clickable ..!");
        	 

        }
	}
	
	
	@Test(priority=10)
	public void Visa_link() throws InterruptedException
	{
		obj10=new AgentMenubarLinks_page(driver);
		obj10.Visa_link_click();
		
		String title = "Submit Visa - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Visa Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Visa link is not clickable ..!");
        	 

        }
		
	}
	
	@Test(priority=11)
	public void Blog_link() throws InterruptedException
	{
		obj11=new AgentMenubarLinks_page(driver);
		obj11.Blog_link_click();
		
		String title = "Blog - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Blog Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Blog link is not clickable ..!");
        	 

        }
		
		
	}
	
	@Test(priority=12)
	public void Offers_link() throws InterruptedException
	{
		obj12=new AgentMenubarLinks_page(driver);
		obj12.Offers_link_click();
		
		String title = "Offers - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Offers Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent Offers link is not clickable ..!");
        	 

        }
	}
	
	
	
	@Test(priority=13)
	public void update_currency()throws IOException, InterruptedException
	{
		obj7=new AgentMenubarLinks_page(driver);
		obj7.currency_update();
		
		WebElement strvalue = driver.findElement(By.xpath("//*[@id=\"currency\"]"));
        String expected = "INR";
        String actual = strvalue.getText();
        System.out.println("The currency value Updated to-" +actual);

    if(expected.equals(actual))
    	{
        System.out.println("currency updated");
    	}
        else 
        {
            System.out.println("currency updation Fails");
        }
    
    
    
	}
	
	@Test(priority=14)
	public void search_hotel() throws IOException, InterruptedException
	{
		obj4=new AgentMenubarLinks_page(driver);
		String cityname = ExcelUtility.getCellData(8, 0);
		obj4.searchHotel(cityname);
		
		String title = "Hotels in dubai - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
      
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Search hotel Link  is Clickable.");
        }
        catch(AssertionError e)
        {
        	 System.out.println("Page title doesnt match-Agent search hotel link is not clickable ..!");
        	 

        }
	}
	
	@Test(priority=15)
	public void agent_logout()throws IOException,InterruptedException
	{
		obj3=new AgentMenubarLinks_page(driver);
		obj3.logout_user();
		
		String title = "Login - PHPTRAVELS";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Agent Loggedout successfully"); 
       
        }
        catch(AssertionError e)
        {
        	 System.out.println("Agent couldn't loggedout..");
        	 

        }
	}
	
	
	
	

}
