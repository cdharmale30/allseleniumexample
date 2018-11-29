
package com.test.xlsheetread.jxl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class XLSheetReadByJXL {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("Book1.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet(0);

		int col = sh.getColumns();
		int rows = sh.getRows();
		System.out.println(col);
		System.out.println(rows);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				Cell cell = sh.getCell(j, i);
				System.out.println(cell.getContents());
				System.out.println(" ");

			}
			System.out.println(" ");
		}
	}
}