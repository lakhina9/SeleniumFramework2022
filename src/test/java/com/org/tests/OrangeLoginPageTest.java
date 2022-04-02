package com.org.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.org.pages.OrangeLoginPage;
import com.org.utils.ReadData;

public final class OrangeLoginPageTest extends BaseTest {

	private OrangeLoginPageTest() {
	}

	//static dataprovider
/*	@Test(dataProvider = "LoginTestDataProvider")
	public void test2(String userName, String password) {
		OrangeLoginPage ob = new OrangeLoginPage();
		// ob.enterUserName("admin");
		// ob.enterPassword("admin123");
		// ob.clickLogin();

		// after returning object of OrangeLoginPage in page class ->method chaining.
		ob.enterUserName(userName).enterPassword(userName).clickLogin();
	}

	@DataProvider(name = "LoginTestDataProvider", parallel = true)
	public Object[][] getData() {
		return new Object[][] { { "Admin", "admin123" }, { "invaildUser", "invaildPassword" } };
	};

	*/
	
	//reading data thru excel file
	@Test(dataProvider = "getData",dataProviderClass=ReadData.class)
	public void test2(Map<String,String> map) {
		OrangeLoginPage ob = new OrangeLoginPage();
		// ob.enterUserName("admin");
		// ob.enterPassword("admin123");
		// ob.clickLogin();
		// after returning object of OrangeLoginPage in page class ->method chaining.
		ob.enterUserName(map.get("Name")).enterPassword(map.get("Password")).clickLogin();
	}
}
