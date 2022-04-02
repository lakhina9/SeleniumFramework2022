package com.org.pages;

import org.openqa.selenium.By;
import com.org.driver.DriverManager;
import com.org.enums.WaitStrategy;
import com.org.factories.ExplicitWaitFactory;

public class BasePage {

	protected void click(By by, WaitStrategy waitStrategy) {
		
		ExplicitWaitFactory.performExplicitWait(by, waitStrategy).click();
		//finding elemnet 2 times
		//DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by, String key, WaitStrategy waitStrategy) {
		
		ExplicitWaitFactory.performExplicitWait(by, waitStrategy).sendKeys(key);
		//DriverManager.getDriver().findElement(by).sendKeys(key);
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	/*public void WaitforElemntToBePresent(){
	
}
*/
	
}