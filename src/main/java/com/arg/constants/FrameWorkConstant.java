package com.arg.constants;

public final class FrameWorkConstant {

	private FrameWorkConstant() {}
	

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources/";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCEPATH + "/config/config.properties";
	private static final String EXCELFILEPATH=RESOURCEPATH+"/exceltestdata/testdata.xls";
	private static final int EXPLICITWAITTIME=10;

	public static String getExcelfilepath() {
		return EXCELFILEPATH;
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static int getExplicitWaitTime() {
		return EXPLICITWAITTIME;
	}

}
