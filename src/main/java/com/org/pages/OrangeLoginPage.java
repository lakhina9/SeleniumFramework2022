package com.org.pages;
import org.openqa.selenium.By;
import com.org.driver.DriverManager;
import com.org.enums.WaitStrategy;

public final class OrangeLoginPage extends BasePage{
	
	
	private final By textboxUsername=By.id("txtUsername");
	private final By textboxPassword=By.xpath("//input[@id='txtPassword' and @type='password'] ");
	private final By buttonLogin=By.id("btnLogin");
	
	
	
	public OrangeLoginPage enterUserName(String userName) {
		//DriverManager.getDriver().findElement(textboxUsername).sendKeys(userName);
		//return new OrangeLoginPage
		sendKeys(textboxUsername,userName,WaitStrategy.PRESENCE);
		return this;
		
	}

	public OrangeLoginPage enterPassword(String password) {
		//DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
		sendKeys(textboxPassword,password,WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHomePage clickLogin() {
		//DriverManager.getDriver().findElement(buttonLogin).click();
		click(buttonLogin,WaitStrategy.PRESENCE);
		return new OrangeHomePage();
	}

	public String getTitle() {
		//return DriverManager.getDriver().getTitle();
		return getPageTitle();

}
	
	
	
}
