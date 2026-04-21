package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class EmployeeDataProvider {
	@DataProvider(name = "empData")
	public Object[][] getExcelData() throws Exception {

	    FileInputStream fis = new FileInputStream("./TestData.xlsx");
	    Workbook book = WorkbookFactory.create(fis);
	    Sheet sheet = book.getSheet("EmployeeSheet");

	    int rowCount = sheet.getLastRowNum();
	    int colCount = sheet.getRow(0).getLastCellNum();

	    DataFormatter formatter = new DataFormatter();

	    Object[][] data = new Object[rowCount][colCount];

	    for (int i = 1; i <= rowCount; i++) {

	        for (int j = 0; j < colCount; j++) {
	            data[i - 1][j] =
	                formatter.formatCellValue(sheet.getRow(i).getCell(j));
	        }

	        // 🔥 Override with RANDOM values
	        EmployeeIDAndEmail emp = RandomGenerator.generateEmployeeData();

	        data[i - 1][2] = emp.getEmpId();
	        data[i - 1][3] = emp.getEmail();
	    }

	    book.close();
	    fis.close();

	    return data;
	}

}
