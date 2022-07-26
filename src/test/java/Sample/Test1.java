package Sample;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLib.BaseClass;
import com.genericLib.DriverUtils;
import com.genericLib.ReadData_PropertyFile;
import com.objectRepo.SearchProductPage;

import io.appium.java_client.android.AndroidElement;

public class Test1 extends BaseClass {
	DriverUtils utils=new DriverUtils();
	ReadData_PropertyFile prop=new ReadData_PropertyFile();
	SearchProductPage spp;
	@Test
    public void searchproduct() throws InterruptedException, IOException
	{
		spp=PageFactory.initElements(driver, SearchProductPage.class);
		
		spp.getSearch_bar().click();
    	spp.getCity_dropdown().click();
		spp.getCity_seachbar().sendKeys(prop.readProp("City"));
		spp.getCity_suggestion().click();
		spp.getB2bproduct_searchbar().sendKeys(prop.readProp("ProdName"));
		spp.getFirst_suggestion().click();
		
		for(int i=1;i<=4;i++)
		{
    		AndroidElement pro_suggest = (AndroidElement) driver.findElementByXPath("(//android.widget.TextView[@resource-id='com.jdmart.android:id/comp_name'])["+i+"]");
			String pro_name = pro_suggest.getText();
			System.out.println("Suggestion "+i+" - "+pro_name+"");
		}
		
		spp.getSuggestion_prod().click();
		String text = spp.getPdp_prodname().getText();
		System.out.println("Product name : "+text);
		utils.swipeByPercentage(driver, 0.5, 0.8, 0.5, 0.2);
		String compname_page1 = spp.getSuggestion_prod().getText();
		System.out.println(compname_page1);
		spp.getSuggestion_prod().click();
		String compname_page2 = spp.getSuggestion_prod().getText();
		System.out.println(compname_page2);
		Assert.assertEquals(compname_page1, compname_page2);
		
		for(int i=1;i<=3;i++)
		{
			AndroidElement tab = (AndroidElement) driver.findElementByXPath("(//android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab/android.widget.TextView)["+i+"]");
			String tabname = tab.getText();
			System.out.println("Tab "+i+" - "+tabname+"");
		}
		
		for(int i=1;i<=3;i++)
		{
			utils.backNavigation(driver);
		}
		
		spp.getSuppliers_option().click();
		spp.getFirst_suggestion().click();
		
		for(int i=1;i<=4;i++)
		{
			AndroidElement pro_suggest = (AndroidElement) driver.findElementByXPath("(//android.widget.TextView[@resource-id='com.jdmart.android:id/comp_name'])["+i+"]");
			String pro_name = pro_suggest.getText();
			System.out.println("Suggestion "+i+" - "+pro_name+"");
		}
		
		spp.getSuggestion_prod().click();
		Assert.assertTrue(spp.getComp_image().isDisplayed());
		String comp_name = spp.getSuggestion_prod().getText();
		System.out.println("Company Name : "+comp_name+"");
		String comp_address = spp.getComp_address().getText();
		System.out.println("Company Address : "+comp_address+"");
		}
	}
