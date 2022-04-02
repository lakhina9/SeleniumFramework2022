package com.org.driver;

import java.util.Objects;
import org.openqa.selenium.chrome.ChromeDriver;

import com.arg.constants.FrameWorkConstant;
import com.org.enums.ConfigProperties;
import com.org.utils.PropertyUtils;

public final class Driver {
	
	private Driver() {}
	//make Webdriver private coz we accessing it inside this class only
	
	
	//private static WebDriver driver;

		
	public static void initDriver() throws Exception {
		// if(driver==null) { //better way or if driver is null then only create it 
		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameWorkConstant.getChromeDriverPath());
			//driver = new ChromeDriver();
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));

		}
	}

	
	  public static void quitDriver() { // if(driver!=null)
		  if(Objects.nonNull(DriverManager.getDriver())) { // *
			DriverManager.getDriver().quit(); //driver = null; or setDriver(null) or // *	  below line 
	        DriverManager.unload(); } } 
	  
	 
}
