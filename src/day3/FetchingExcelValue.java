package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FetchingExcelValue {

	public static void main(String[] args) throws BiffException, IOException {
		File fs = new File("/home/manzoormehadi/StackRoute/Training Workspace/GlobalLogic/TestData/testData.xls");
		FileInputStream fis = new FileInputStream(fs);
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		String cellData=sheet.getCell(0, 1).getContents();
		System.out.println(cellData);
		
		int rowcount=sheet.getRows();
		int colCount=sheet.getColumns();
		
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData1=sheet.getCell(j, i).getContents();
				System.out.println(cellData1);
			}
		}
		
		System.out.println("***********username*********************");
		for(int i=0;i<rowcount;i++) {
			String username=sheet.getCell(0, i).getContents();
			System.out.println(username);
		}
		
		System.out.println("************password********************");
		for(int i=0;i<rowcount;i++) {
			String password=sheet.getCell(1, i).getContents();
			System.out.println(password);
		}
	}

}
