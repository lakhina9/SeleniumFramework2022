package com.org.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.arg.constants.FrameWorkConstant;

public final class ReadData {
	private ReadData(){}
	
	Map<String,String>map;
	@DataProvider
	public  Object[] getData() throws IOException {
		FileInputStream fis = new FileInputStream(FrameWorkConstant.getExcelfilepath());
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet x=workbook.getSheetAt(0);
		
	    int numOfRows=	x.getLastRowNum();
	    int numOfCell=x.getRow(0).getLastCellNum();
	   	  
	  //  Object[][] data=new Object[numOfRows][numOfCell];
	    Object[] data=new Object[numOfRows];
	    
	    for(int i=0;i<numOfRows;i++) {
	    	map=new HashMap<String, String>();
	    	
	    	for(int j=0;j<x.getRow(i).getLastCellNum();j++) {
	    		
	    		String key=x.getRow(0).getCell(j).getStringCellValue();
	    		String value=x.getRow(i+1).getCell(j).getStringCellValue();
	    		
	    		map.put(key, value);
	    	data[i]=map;
	    	}
	    	
	    }
		return data;
	}


}
