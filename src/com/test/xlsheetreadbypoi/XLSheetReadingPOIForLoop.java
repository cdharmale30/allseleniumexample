package com.test.xlsheetreadbypoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;

public class XLSheetReadingPOIForLoop {

	public static void main(String[] args) throws Exception{
	      
	        	 
			File src = new File("C:\\Users\\chetan\\Downloads\\poiread.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);

			int rows = sh1.getLastRowNum()+1;
			System.out.println("the No of rows is:" + rows);
			XSSFRow  row = sh1.getRow(0);
			int col= row.getLastCellNum();
			System.out.println("The L=No of Colomn are"+col);

			for (int i = 0; i <= rows-1; i++) {
				for (int j=0;j<=col-1;j++) {
					
				
				String data0 = sh1.getRow(i).getCell(j).getStringCellValue();
                System.out.println("The Row Coumt "+i+"and colom is "+j+" is "+data0);
                
                String data1 = sh1.getRow(i).getCell(j).getStringCellValue();
                System.out.println("The Col Coumt "+i+ "and colom is "+j+ " is "+data1);
                
                String data2= sh1.getRow(i).getCell(j).getStringCellValue();
                System.out.println("The Col Coumt "+i+ "and colom is "+j+ " is "+data2);
                String data3= sh1.getRow(i).getCell(j).getStringCellValue();
                System.out.println("The Col Coumt "+i+ "and colom is "+j+ " is "+data3);
			} 
				 
			}	  
			}
}