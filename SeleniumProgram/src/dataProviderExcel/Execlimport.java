package dataProviderExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Execlimport {
	
	
	public XSSFWorkbook wb;
    public 	XSSFSheet sh;
    public File test;
	public FileInputStream fis;
	public XSSFCell Cell;
    public 	XSSFRow Row1;
	 public  Execlimport(String path,String sheetname) throws Exception
	{
			
		 test=new File(path);
		
		 fis=new FileInputStream(test);
			
		 wb = new XSSFWorkbook(fis);
		 sh =wb.getSheet(sheetname);
		
     	}
	 
	
	 
	 public int getrow(int rownum)
	 {
		 
		Row1 = sh.getRow(rownum);
		int row1=Row1.getRowNum();
		return row1 ;
	 }
	 public String getData(int row,int coloum)
		{
			//sh=wb.getSheet(sheetname);
			String data=sh.getRow(row).getCell(coloum).getStringCellValue();
			return data;
		 
		 
	/*	 try{

				Cell = sh.getRow(row).getCell(coloum);

				
					String CellData = Cell.getStringCellValue();

					return CellData;

				}catch (Exception e){

				System.out.println("Exception is:"+e.getMessage());

				throw (e);

				}		
*/		}
		
		
	 public int getRowCount(String  sheetname)
	 {
		
	      sh=wb.getSheet(sheetname);
	      int rowscount=sh.getLastRowNum();
		  return rowscount;
		 
		 
	 }
} 

//hi i am sandeep 

