package com.org.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.org.driver.DriverManager;

public class HomePageTest extends BaseTest {

		
	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Test Mini bytes Automation", Keys.ENTER);
		String actualTitle=DriverManager.getDriver().getTitle();
		Assert.assertEquals(actualTitle, "Test Mini bytes Automation - Google Search");
		Assert.assertTrue(actualTitle.contains("Google Search"));
		Assert.assertTrue(actualTitle.matches("\\w.*"+"Google Search"));
		Assert.assertTrue(actualTitle.length()>10);
		
		List<WebElement> x=DriverManager.getDriver().findElements(By.xpath("//a/h3"));
  		Assert.assertTrue(x.size()>5);
  		
  		boolean flag=false;
  		for(WebElement et:x) {
  			if(et.getText().equalsIgnoreCase("Test Mini bytes"));
  		flag=true;
  		break;
  		
  		}

	Assert.assertTrue(flag, "Title not found");
	
	}
}