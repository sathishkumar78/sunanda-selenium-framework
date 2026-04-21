package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import Pages.LoginPageAndLogoutPage;

public class LoginUsingExcelTest extends BaseTest{
	@Test
	public void loginTODifferentUsers() throws IOException {
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		FileInputStream fis=new FileInputStream("./LoginData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet data=book.getSheet("login");
		for(int i=1;i<3;i++) {
		System.out.println(data.getRow(i).getCell(0).getStringCellValue());
		System.out.println(data.getRow(i).getCell(1).getStringCellValue());
		login.enterUsername(data.getRow(i).getCell(0).getStringCellValue());
	    login.enterPassword(data.getRow(i).getCell(1).getStringCellValue());
	    login.loginBtn();
	    
		}
	
	}
}
