package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			projectPath = System.getProperty("user.dir");
			
			//HSSFWorkbook workbook = new HSSFWorkbook("file location"); --- for older excel versions
			
			workbook = new XSSFWorkbook(projectPath + excelPath);
			sheet = workbook.getSheet(sheetName);
		
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		getRowCount();
		
	}	
	
	
	public static int getRowCount() {
			
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("No. of Rows: " + rowCount);	
		
		return rowCount;
	}
	
	public static int getColCount() {
		
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("No. of Columns: " + colCount);	
		
		return colCount;
	}
	
public static String getCellData(int rowNum, int colNum) {
		
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("Cell[" + rowNum + "][" + colNum + "] = " + cellData);
		
		return cellData;
	}

}
