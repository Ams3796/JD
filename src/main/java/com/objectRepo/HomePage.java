package com.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {

	AndroidDriver<WebElement> driver;

	@FindBy(id = "com.jdmart.android:id/ScrollingPagerIndicator")
	private WebElement homepage_banners;

	public WebElement getHomepage_banners() {
		return homepage_banners;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='LOGISTICS']")
	private WebElement logistics_headertext;

	public WebElement getLogistics_headertext() {
		return logistics_headertext;
	}
	
	@FindBy(id="com.jdmart.android:id/searchtext")
	private WebElement resultpage_bannerheader;

	public WebElement getResultpage_bannerheader() {
		return resultpage_bannerheader;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.jdmart.android:id/comp_name']")
	private List<WebElement> resultpage_comp_names;

	public List<WebElement> getResultpage_comp_names() {
		return resultpage_comp_names;
	}
	

	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.jdmart.android:id/calllaychild1']")
	private List<WebElement> call_button;

	public List<WebElement> getCall_button() {
		return call_button;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.jdmart.android:id/calllaychild2']")
	private List<WebElement> get_best_price;

	public List<WebElement> getGet_best_price() {
		return get_best_price;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Filter']")
	private WebElement filter_option;

	public WebElement getFilter_option() {
		return filter_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='All India']")
	private WebElement all_india_option;

	public WebElement getAll_india_option() {
		return all_india_option;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Business Type']")
	private WebElement businesstype_option;

	public WebElement getBusinesstype_option() {
		return businesstype_option;
	}

}
