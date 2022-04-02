package com.org.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.pages.OrangeHomePage;
import com.org.pages.OrangeLoginPage;

public class OrangeHomePageTest extends BaseTest
{
	
	@Test
	public void loginLogoutTest() throws InterruptedException {
		
		//OrangeLoginPage ob=new OrangeLoginPage();
		//OrangeHomePage ohp=ob.enterUserName("admin").enterPassword("admin123").clickLogin();
		//ohp.clickWelcomeLink().clickLogoutLink();
	String title=	new OrangeLoginPage().enterUserName("Admin").enterPassword("admin123").
			         clickLogin()
			         .clickLogoutLink().
			         getTitle();
	
	Assert.assertEquals(title, "OrangeHRM");
	
	}
}
