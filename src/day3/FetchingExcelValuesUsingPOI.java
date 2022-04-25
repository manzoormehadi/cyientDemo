package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchingExcelValuesUsingPOI {

	public static void main(String[] args) throws IOException {
		File fs = new File("/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/TestData/testData.xls");
		FileInputStream fis = new FileInputStream(fs);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			int colCount=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<colCount;j++) {
				String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}
		}

	}

}
