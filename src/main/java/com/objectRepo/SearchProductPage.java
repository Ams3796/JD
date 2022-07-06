package com.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class SearchProductPage<E> {
	public AndroidDriver<WebElement> driver;
	
	@FindBy(id="com.jdmart.android:id/hint")
	private WebElement search_bar;
	
	@FindBy(id="com.jdmart.android:id/citylay")
	private WebElement city_dropdown;
	
	@FindBy(id="com.jdmart.android:id/search_edit_text_autosuggest")
	private WebElement city_seachbar; 
	
	@FindBy(id="com.jdmart.android:id/super_lay")
	private WebElement city_suggestion;
	
	@FindBy(id="com.jdmart.android:id/search_edit_text_autosuggest")
	private WebElement b2bproduct_searchbar;
	
	@FindBy(xpath="//android.widget.RelativeLayout//android.widget.RelativeLayout[@resource-id='com.jdmart.android:id/auto_lin']")
	private WebElement first_suggestion;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.jdmart.android:id/comp_name']")
	private WebElement suggestion_prod;
	
	@FindBy(id="com.jdmart.android:id/productName")
	private WebElement pdp_prodname;
	
	@FindBy(xpath="//android.widget.LinearLayout[@resource-id='com.jdmart.android:id/super_lay']")
	private WebElement prod_shippingcost;
	
	@FindBy(xpath="//android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab/android.widget.TextView")
	private WebElement jdmart_tabs;
	
	@FindBy(xpath="//android.widget.TextView[@text='Suppliers']")
	private WebElement suppliers_option;
	
	@FindBy(id="com.jdmart.android:id/comp_image_rel")
	private WebElement comp_image;
	
	@FindBy(id="com.jdmart.android:id/address")
	private WebElement comp_address;
	
	public WebElement getSearch_bar() {
		return search_bar;
	}

	public WebElement getCity_dropdown() {
		return city_dropdown;
	}

	public WebElement getCity_seachbar() {
		return city_seachbar;
	}

	public WebElement getCity_suggestion() {
		return city_suggestion;
	}

	public WebElement getB2bproduct_searchbar() {
		return b2bproduct_searchbar;
	}
	
	public WebElement getFirst_suggestion() {
		return first_suggestion;
	}
	
	public WebElement getSuggestion_prod() {
		return suggestion_prod;
	}
	
	public WebElement getPdp_prodname() {
		return pdp_prodname;
	}
	
	public WebElement getProd_shippingcost() {
		return prod_shippingcost;
	}
	

	public WebElement getJdmart_tabs() {
		return jdmart_tabs;
	}
	
	public WebElement getSuppliers_option() {
		return suppliers_option;
	}
	
	public WebElement getComp_image() {
		return comp_image;
	}
	
	public WebElement getComp_address() {
		return comp_address;
	}
	
	
	

}
