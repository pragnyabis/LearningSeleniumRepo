package utils;

public class ExcelUtils_Test {
	
	public static void main(String[] args) {
		
		ExcelUtils excel = new ExcelUtils("/excel/data.xlsx", "Sheet1");
		
		System.out.println(excel.getRowCount());
		System.out.println(excel.getColCount());
		System.out.println(excel.getCellData(0, 0));
		System.out.println(excel.getCellData(0, 1));
	}

}
