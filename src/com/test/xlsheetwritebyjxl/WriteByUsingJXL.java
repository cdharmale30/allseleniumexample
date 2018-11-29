package com.test.xlsheetwritebyjxl;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;

public class WriteByUsingJXL  {
	 private static final String EXCEL_FILE_LOCATION = "I:\\All Eclipse Code3\\SeleniumExamples\\xlsheetbyjxl.xls";
	public static void main(String[] args)  throws WriteException{
		// TODO Auto-generated method stub
		   WritableWorkbook myworkbook = null;
		   try {
			   
			   myworkbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));

			   WritableSheet excelSheet= myworkbook.createSheet("Sheet 1", 0);
			  Label label= new Label(0,0,"Test Count") ;
			  excelSheet.addCell(label);
			  
			  Number number = new Number(0,1,1);
			  excelSheet.addCell(number);
			  
			   label= new Label(1,0,"Result") ;
			  excelSheet.addCell(label);
			  
			  
			   label= new Label(1,1,"Passed") ;
			  excelSheet.addCell(label);
			  
			  number = new Number(0,2,2);
			  excelSheet.addCell(number);
			  
			  
			   label= new Label(1,2,"Passed 2") ;
			  excelSheet.addCell(label);
			  
			  myworkbook.write();
			  

	        } catch (IOException e) {
	            e.printStackTrace();
	        
	        } catch (WriteException e) {
	            e.printStackTrace();
	        } finally {
	        	if (myworkbook!=null ) {
	        		
	        		try {
	        			myworkbook.close();
	        		 } catch (IOException e) {
	     	            e.printStackTrace();
	     	    	
	        		}
	        	}
	        }
	}

}