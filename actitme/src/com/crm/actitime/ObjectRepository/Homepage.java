package com.crm.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage 
{
@FindBy(xpath ="//div[.='Tasks']")
 private WebElement tasklinks ;

@FindBy(xpath ="//div[.='Tasks']")
private WebElement userlink ;



}
