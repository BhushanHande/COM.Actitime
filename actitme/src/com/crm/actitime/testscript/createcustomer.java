 package com.crm.actitime.testscript;
 import org.testng.Assert;

//extension domain project pacakge 
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.actitime.genericlibraries.ListnerImplementation;
import com.crm.actitime.genericlibraries.baseclass;
@Listeners(ListnerImplementation.class)
public class createcustomer extends baseclass
{
@Test

//	public void createCustomer()
//	{
//		Assert.fail();
//		Reporter.log("create customer",true);
//		
//	}

public void createCustomer()
{
	Homepage hp =Homepage(driver);
	hp.clickOntaskab();
}

}

