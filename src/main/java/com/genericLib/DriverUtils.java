package com.genericLib;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DriverUtils {
	Dimension dimension;

	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(AutoConstant.implicitwait, TimeUnit.SECONDS);
	}

	public boolean isAppInstalled(AndroidDriver<WebElement> driver, String appPackage) {
		return driver.isAppInstalled(appPackage);
	}

	public void uninstall_App(AndroidDriver<WebElement> driver, String appPackage) {
		driver.removeApp(appPackage);
	}
	
	public void backNavigation(AndroidDriver<AndroidElement> driver)
	{
		driver.navigate().back();
	}

	public void bottomToTopSwipe(AndroidDriver<?> driver) {
		dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);

		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.2);

		TouchAction<?> action = new TouchAction(driver);
		action.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	public void topToBottomSwipe(AndroidDriver<?> driver) {
		dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.2);

		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.8);
		TouchAction<?> act = new TouchAction(driver);
		act.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	public void swipeByPercentage(AndroidDriver<?> driver, double x1, double y1, double x2, double y2) {
		dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * x1);
		int start_y = (int) (dimension.height * y1);

		int end_x = (int) (dimension.width * x2);
		int end_y = (int) (dimension.height * y2);

		TouchAction<?> action = new TouchAction(driver);
		action.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}
	
	public void scrollToElement(AndroidDriver<?> driver,String text)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).new UiSelector().textContains(\"" + text + "\").instance(0))");
	}
	
	public void hidekeyboard(AndroidDriver<?> driver)
	{
		driver.hideKeyboard();
	}
	
	public void taByCoordinates(AndroidDriver<?> driver,int x, int y, long seconds)
    {
    	TouchAction<?> action = new TouchAction(driver);
				action.press(PointOption.point(x, y))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))
				.release()
				.perform();
	}

}
