package com.genericLib;

import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseClass {
	
	public AndroidDriver<AndroidElement> driver;
	ReadData_PropertyFile prop=new ReadData_PropertyFile();
	
	
	@BeforeClass
	public void setUp() throws IOException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName",prop.readProp("deviceName"));
		dc.setCapability("automationName",prop.readProp("automationName"));
		dc.setCapability("platformName",prop.readProp("platformName"));
		dc.setCapability("platformVersion",prop.readProp("platformVersion"));
		dc.setCapability("UDID",prop.readProp("UDID"));
		//dc.setCapability("app", "C:\\Users\\User\\Downloads\\justdial-7-5-8 (1).apk");
		dc.setCapability("appPackage",prop.readProp("appPackage"));
		dc.setCapability("appActivity",prop.readProp("appActivity"));
		dc.setCapability("noReset",prop.readProp("noReset"));
		dc.setCapability("autoGrantPermissions",prop.readProp("autoGrantPermissions"));
		
	    URL url=new URL("http://127.0.0.1:4723/wd/hub");
	    driver=new AndroidDriver<AndroidElement>(url,dc);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Started");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Closed");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
