package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.driver.DriverManager;
import com.org.enums.WaitStrategy;

public class OrangeHomePage extends BasePage {

	//all your page classes methods should have return type sometype
	private final By linkWelcome = By.id("welcome");
	private final By linkLogout = By.xpath("//a[text()='Logout']");

	public OrangeHomePage clickWelcomeLink() throws InterruptedException {
		Thread.sleep(3000);
		//DriverManager.getDriver().findElement(linkWelcome).click();
		click(linkWelcome,WaitStrategy.CLICKABLE);
		return this;

	}

	public OrangeLoginPage clickLogoutLink() {
		WebDriverWait wait= new WebDriverWait(DriverManager.getDriver(),30);
		wait.until(ExpectedConditions.elementToBeClickable(linkLogout));
		
		//DriverManager.getDriver().findElement(linkLogout).click();
		click(linkLogout,WaitStrategy.CLICKABLE);
		return new OrangeLoginPage();

	}


}