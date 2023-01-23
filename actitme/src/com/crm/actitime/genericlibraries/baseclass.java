package com.crm.actitime.genericlibraries;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.actitime.ObjectRepository.LogoinPage;

public class baseclass 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	readdatafromproperty r =new readdatafromproperty();
	
	
	public static  WebDriver driver;
	
	@BeforeSuite
	public void databaseconnection()
	{
		Reporter.log("database is connected " , true );
	}
	
	@AfterSuite
	public void databasedisconnection()
	{
		Reporter.log("database is connected ", true);
	}
	
	@BeforeTest
	
		public void launchbrowser() throws IOException
		{
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			readdatafromproperty r =new readdatafromproperty();
			String url = r.readdatafromproperty("url");
			driver.get(url);
		}
	
	
	
	
	@AfterTest
	public void closebrowser()
	{
	 driver.close();	
	}
   
	
	
	@BeforeMethod
	public void login() throws IOException
	{
		String UN = r.readdatafromproperty("username");
		String PW = r.readdatafromproperty("password");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.xpath("//div[.='Login ']")).click();
		LogoinPage lp =new LogoinPage(driver);
		lp.logintoactitime(UN,PW);
	}
	
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	
	
	
}
