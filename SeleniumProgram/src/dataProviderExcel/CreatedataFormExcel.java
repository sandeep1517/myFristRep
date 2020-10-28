package dataProviderExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileList;

public class CreatedataFormExcel {

	public static void main(String[] args) throws Exception 
	{
	
		File src=new File("C:\\Users\\dude\\workspace\\SeleniumProgram\\src\\com\\facebook\\testdata\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("san");
		
		sh.getRow(0).createCell(4).setCellValue("Voting Id");
		

		sh.getRow(1).createCell(4).setCellValue("9195195");


		sh.getRow(2).createCell(4).setCellValue("8481254");
		
		FileOutputStream fout=new FileOutputStream(src);

		wb.write(fout);
		
		System.out.println("Successfully Data Filling.....");
		wb.close();
		
		
	}

}
