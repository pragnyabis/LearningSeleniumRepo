package utils;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		testData("/excel/data.xlsx", "Sheet1");
	}

	
	public static void testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		for(int i = 0; i < rowCount; i++) {
			for(int j = 0; i < colCount-1; j++) {
				
				String cellData = excel.getCellData(i, j);
				System.out.print(cellData + "| ");
			}
			System.out.println();
		}
		
		
	}
	
}
