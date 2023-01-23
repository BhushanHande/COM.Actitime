package com.crm.actitime.genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readdatafromproperty
{
public String readdatafromproperty (String Key) throws IOException
{
	FileInputStream fis =new FileInputStream("./testdata/commondata.property");
	Properties p =new Properties();
	p.load(fis);
	String value = p.getProperty(Key);
	return value ;
}
}
