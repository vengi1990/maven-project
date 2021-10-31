package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
private static  void write() throws IOException {
	File f=new File("C:\\Users\\Vengatesh\\Desktop\\Data driven.xlsx");
	FileInputStream fi=new FileInputStream(f) ;
	Workbook w=new XSSFWorkbook(fi);
	Sheet cs = w.createSheet("new1");
	w.getSheet("new1").createRow(0).createCell(0).setCellValue("username");
	w.getSheet("new1").getRow(0).createCell(1).setCellValue("password");
	w.getSheet("new1").createRow(1).createCell(0).setCellValue("vengatesh");
	w.getSheet("new1").getRow(1).createCell(1).setCellValue("123456");
	w.getSheet("new1").createRow(2).createCell(0).setCellValue("java");
	w.getSheet("new1").getRow(2).createCell(1).setCellValue("123456");
	FileOutputStream os=new FileOutputStream(f);
	w.write(os);
	w.close();
	System.out.println("done");

}
public static void main(String[] args) throws Throwable {
	write();
}
}
