package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class TestDataXsls {

	@DataProvider(name="testdata")
	public String[][] getData(Method m) throws EncryptedDocumentException, IOException
	{
		String excelsheetname=m.getName();
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheetname=wb.getSheet(excelsheetname);
		
		int totalRows=sheetname.getLastRowNum();
		System.out.println("totalRows "+totalRows);
		Row rowcell=sheetname.getRow(0);
		int totalcols=rowcell.getLastCellNum();
		System.out.println("totalRows "+totalcols);
		
		DataFormatter dataformatter=new DataFormatter();
		String testData[][]=new String [totalRows][totalcols];
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalcols;j++)
			{
				testData[i-1][j]=dataformatter.formatCellValue(sheetname.getRow(i).getCell(j));
				
				System.out.println(testData[i-1][j]);
			}
			System.out.println(" ");
		}
		
		return testData;
		
	}

}
