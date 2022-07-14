package com.sydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

@Test
    public void read_from_excel_file() throws IOException {
    String path = "SampleData.xlsx";

    FileInputStream fileInputStream = new FileInputStream(path);

    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    XSSFSheet sheet = workbook.getSheet("Sheet 1");

    System.out.println(sheet.getRow(3).getCell(0));



}
}
