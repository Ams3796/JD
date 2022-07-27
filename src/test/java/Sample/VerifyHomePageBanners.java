package Sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLib.BaseClass;
import com.genericLib.DriverUtils;
import com.objectRepo.HomePage;

public class VerifyHomePageBanners extends BaseClass {
	
	HomePage hp;
	DriverUtils utils=new DriverUtils();
	
	@Test
	
	public void verifybanners() throws InterruptedException
	{
		hp=PageFactory.initElements(driver, HomePage.class);
		
		hp.getHomepage_banners().click();
		String text = hp.getLogistics_headertext().getText();
		Assert.assertEquals(text, "LOGISTICS");
		System.out.println(text+" header is present");
		utils.backNavigation(driver);
		

		for(int i=1;i<=25;i++)
		{
			Thread.sleep(6000);
			
			System.out.println("BANNER "+i+" : ");
			
			hp.getHomepage_banners().click();
			
			
			String text1 = hp.getResultpage_bannerheader().getText();
			System.out.println("HEADER : "+text1);
			
			Assert.assertEquals(hp.getFilter_option().isDisplayed(), true);
			System.out.println("FILTER option is displayed");
			
			Assert.assertEquals(hp.getAll_india_option().isDisplayed(), true);
			System.out.println("ALL INDIA option is displayed");
			
			Assert.assertEquals(hp.getBusinesstype_option().isDisplayed(), true);
			System.out.println("BUSINESS TYPE option is dispalyed");
			
			System.out.println("RESULTS NAME : ");
			for(WebElement name : hp.getResultpage_comp_names())
			{
				String text2=name.getText();
				System.out.println(text2);
			}
			
			for(WebElement call : hp.getCall_button())
			{
				Assert.assertEquals(call.isDisplayed(), true);
			}
			System.out.println("Call button is present");
			
			for(WebElement bestprice : hp.getGet_best_price())
			{
				Assert.assertEquals(bestprice.isDisplayed(), true);
			}
			System.out.println("Get Best Price button is present");
			
			utils.backNavigation(driver);
				
		}
		
		

}

}