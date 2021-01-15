package com.Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLiberary implements AutoConstant
{
	public static String getcellvalue(String path, String sheet, int row, int cell)throws IOException 
	{
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		String cellvalue=	wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return cellvalue;
	}
}

