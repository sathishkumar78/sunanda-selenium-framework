package Test;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AddEmployeePage;
import Pages.LoginPageAndLogoutPage;
import Utilities.ReportManager;
import Utilities.EmployeeDataFromExcel;


@Listeners(ReportManager.class)
public class AddEmployeUsingExcelDataTest extends BaseTest {
	@Test
	public void addEmployee() throws IOException{
		    // Load Excel ONCE
		    EmployeeDataFromExcel empsheet=new EmployeeDataFromExcel("./TestData.xlsx", "EmployeeSheet");
		    LoginPageAndLogoutPage login = new LoginPageAndLogoutPage(driver);
		    login.enterUsername(empsheet.getCellValue(1, 17));
		    login.enterPassword(empsheet.getCellValue(1, 18));
		    login.loginBtn();

		    AddEmployeePage addemp = new AddEmployeePage(driver);
		    for (int i = 1; i <= empsheet.getRowCount(); i++) {
		        int j = 0;
		     // Write test data
		        String email = testData.getEmail();
		        String empId = testData.getEmpId();

		        empsheet.setCellValue(i, j+2, email);
		        empsheet.setCellValue(i, j+3, empId);

		        addemp.movingToEmployeeModuleAndClickingOnAddEmployee();
		        addemp.enterFirstname(empsheet.getCellValue(i, j++));
		        addemp.enterLastname(empsheet.getCellValue(i, j++));
		        addemp.enterEmployeeId(empsheet.getCellValue(i, j++));
		        addemp.enterEmail(empsheet.getCellValue(i, j++));
		        addemp.selectRole(empsheet.getCellValue(i, j++));
		        addemp.enterPassword(empsheet.getCellValue(i, j++));
		        addemp.enterDOB(empsheet.getCellValue(i, j++));
		        addemp.enterDOJ(empsheet.getCellValue(i, j++));
		        addemp.selectQualification(empsheet.getCellValue(i, j++));
		        addemp.enterDepartment(empsheet.getCellValue(i, j++));
		        addemp.selectGender(empsheet.getCellValue(i, j++));
		        addemp.enterMobileNo(empsheet.getCellValue(i, j++));
		        addemp.selectBloodGroup(empsheet.getCellValue(i, j++));
		        addemp.enterDesignation(empsheet.getCellValue(i, j++));
		        addemp.enterSalary(empsheet.getCellValue(i, j++));
		        addemp.enterLoaction(empsheet.getCellValue(i, j++));
		        addemp.selectToReporting(empsheet.getCellValue(i, j++));
		    }

		    // Close file
		    empsheet.close();
		}

	}

		
		



