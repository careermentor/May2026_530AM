package firstpkg;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandling_Excel
{

	public static void read_excel_data() throws Exception
	{
		
		//for loop
		
		//for(int i=1;i<11; i++)
		//	System.out.println(i);
		
		
		FileInputStream fis = new FileInputStream("./testdata/exceldata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("data");
		
		int nr = sh1.getPhysicalNumberOfRows(); //2
		
		for(int i=0;i<nr; i++) //i=0, 0<4
		{
			XSSFRow row = sh1.getRow(i); //i=1
			
			int nc = row.getPhysicalNumberOfCells(); //i=1, nc=2
			
			for(int j=0; j<nc; j++)//0<2,1<2, 
			{
				XSSFCell col = row.getCell(j);  //i=0, j=0, j=1, j=2
				
				if(col.getCellType() == CellType.STRING)
				{
					System.out.println(col.getStringCellValue());
				}
				
				else if(col.getCellType() == CellType.BOOLEAN)
				{
					System.out.println(col.getBooleanCellValue());
				}
				
				else if(col.getCellType() == CellType.NUMERIC)
				{
					
					if(DateUtil.isCellDateFormatted(col))
					{
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						System.out.println(sdf.format(col.getDateCellValue()));
					}
					
					else 
					{
						System.out.println(col.getNumericCellValue());
					}
					
				}
				
				
				
			}
			
			System.out.println("---------------------");
			
		}
		
		/*
		//first row
		XSSFRow row1 = sh1.getRow(0);  
		
		XSSFCell col1 = row1.getCell(0);  //first column
		System.out.println(col1.getStringCellValue());
		
		XSSFCell col2 = row1.getCell(1);  //second column
		System.out.println(col2.getNumericCellValue());
		
	//	col2.getBooleanCellValue();
	//	col2.getDateCellValue();
		
		//second row
		XSSFRow row2 = sh1.getRow(1);  
		
		XSSFCell col21 = row2.getCell(0); //col A
		System.out.println(col21.getStringCellValue());
		
		XSSFCell col22 = row2.getCell(1);
		System.out.println(col22.getStringCellValue());
		
		XSSFCell col23 = row2.getCell(2);
		System.out.println(col23.getStringCellValue());
		
		*/
	}
	
	public static void main(String[] args) throws Exception {
		read_excel_data();
	}
	
}
