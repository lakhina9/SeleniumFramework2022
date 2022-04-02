package com.org.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.driver.DriverManager;
import com.org.enums.WaitStrategy;

public class ExplicitWaitFactory {

	public static WebElement performExplicitWait(By by, WaitStrategy waitStrategy){
		WebElement elemnet=null;
		
		if (waitStrategy==WaitStrategy.CLICKABLE)
			elemnet=new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(by));
				
		else if (waitStrategy==WaitStrategy.PRESENCE)
			elemnet=	new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(by));
	
		else if (waitStrategy==WaitStrategy.VISIBLE)
			elemnet=	new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated(by));
	
		else if(waitStrategy==WaitStrategy.VISIBLE)
			DriverManager.getDriver().findElement(by);
		return elemnet;
	}

}

