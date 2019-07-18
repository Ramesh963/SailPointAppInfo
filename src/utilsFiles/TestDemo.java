package utilsFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public static void getData() throws IOException {

		FileInputStream fis=new FileInputStream("./testdata/sailpointAppInfo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(1).getLastCellNum();
		String [][] testdata=new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columncount;j++) {
				String cellvalue=row.getCell(j).getStringCellValue();
				testdata[i-1][j]=cellvalue;
				//System.out.println(cellvalue);
				System.out.println(testdata);
			}
		}
		
		
	}
}
