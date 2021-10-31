package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read {
		
	private static void one() throws IOException  {
		File f=new File("C:\\Users\\Vengatesh\\eclipse-workspace\\Maven\\Data Driven\\Data driven.xlsx");
		FileInputStream fi=new FileInputStream(f) ;
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			String sv = c.getStringCellValue();
			System.out.println(sv);
		}
		else if(ct.equals(CellType.NUMERIC)) {
			double nv = c.getNumericCellValue();
			int n=(int) nv;
			System.out.println(n);
		}
		
		
	}
	private static void all() throws IOException {
		File f=new File("C:\\Users\\Vengatesh\\eclipse-workspace\\Maven\\Data Driven\\Data driven.xlsx");
		FileInputStream fi=new FileInputStream(f) ;
		Workbook w=new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i <physicalNumberOfRows ; i++) 
		{
			Row row = sheet.getRow(i);
			int pnc = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < pnc; j++) {
			
				Cell cell = row.getCell(j);
				CellType ct = cell.getCellType();
				if (ct.equals(CellType.STRING)) {
					String svs = cell.getStringCellValue();
					System.out.print(svs + " | ");
				}
				else if(ct.equals(CellType.NUMERIC)) {
					double nvs = cell.getNumericCellValue();
					int nvn=(int) nvs;
					System.out.print(nvn);
				}
				
			}
			System.out.println();	
		} 
	}
	public static void main(String[] args) throws Throwable{
		one();
		all();
	}

}
