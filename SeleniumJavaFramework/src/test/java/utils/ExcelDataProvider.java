package utils;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		testData("/excel/data.xlsx", "Sheet1");
	}

	
	public static void testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = ExcelUtils.getRowCount();
		int colCount = excel.getColCount();
		
		//System.out.println(rowCount);
		//System.out.println(colCount);
		
		for(int i = 1; i < rowCount; ++i) {
			for(int j = 0; i < colCount; ++j) {
				
				String cellData = excel.getCellData(i, j);
				System.out.println(cellData + "| ");
			}
			System.out.println();
		}
		
		
	}
	
}
