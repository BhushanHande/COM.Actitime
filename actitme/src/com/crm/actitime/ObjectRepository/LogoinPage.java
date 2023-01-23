package com.crm.actitime.ObjectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crm.actitime.genericlibraries.readdatafromproperty;

public class LogoinPage
{
@FindBy(id="username")
private WebElement untbx ;

@FindBy(name="pwd")
private WebElement pwtbx ;

@FindBy(xpath ="//div[.='Login ']")
private WebElement lgnbtn;

public LogoinPage(WebDriver driver)
{
 PageFactory.initElements(driver,this);	
}

public WebElement getUntbx() {
	return untbx;
}

public WebElement getPwtbx() {
	return pwtbx;
}

public WebElement getLgnbtn() {
	return lgnbtn;
}

public void logintoactitime(String un ,String pw)
{
	
//	String un = r.readdatafromproperty("username");
//	String pw = r.readdatafromproperty("password");
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgnbtn.click();
	
}


}


