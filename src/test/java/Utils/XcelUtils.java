package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XcelUtils {
	
	static XSSFWorkbook workbook;
	static String Path;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		Getrowcount();
		Getrowdata(0,0);
		Getnumericdata(1,1);
	}
	
	public XcelUtils(String excelPath, String SheetName) {

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(SheetName);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int Getrowcount()
{
		int rowcount= sheet.getPhysicalNumberOfRows();
		System.out.println("No. of rows " +rowcount);
		return rowcount;
		
		}

	public static int Getcolcount()
	{
			int colcount= sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of columns " +colcount);
			return colcount;
			
			}

	public static String Getrowdata(int rowNum, int colNum)
	{		
		 String Cdata="";
		 	
		 
		   if(sheet.getRow(rowNum).getCell(colNum).getCellTypeEnum()==CellType.NUMERIC) {
			   Cdata =String.valueOf(sheet.getRow(rowNum).getCell(colNum).getNumericCellValue());  
		   }
		   else {
			   Cdata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		   }
			
		//	System.out.println(Cdata);
			return Cdata;
			
			}

	public static void Getnumericdata(int rowNum, int colNum)
	{
			Double Cdata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(Cdata);
			
			}

}
