package Test;


import java.io.IOException;

import org.testng.annotations.Listeners;
import Pages.AddEmployeePage;
import Pages.LoginPageAndLogoutPage;
import Utilities.ReportManager;


@Listeners(ReportManager.class)
public class AddEmployeeTest extends BaseTest {
	
	public void addEmployee() throws IOException{
		
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		login.enterUsername(getData.getKeyValue("username"));
	    login.enterPassword(getData.getKeyValue("passwordAdmin"));
	    login.loginBtn();
		
		
		AddEmployeePage addemp=new AddEmployeePage(driver);
		addemp.movingToEmployeeModuleAndClickingOnAddEmployee();
		addemp.enterFirstname(getData.getKeyValue("firstname"));
		addemp.enterLastname(getData.getKeyValue("lastname"));
		addemp.enterEmployeeId(testData.getEmpId());
		addemp.enterEmail(testData.getEmail());
		addemp.selectRole(getData.getKeyValue("role"));
		addemp.enterPassword(getData.getKeyValue("passwordEmp"));
		addemp.enterDOB(getData.getKeyValue("dob"));
		addemp.enterDOJ(getData.getKeyValue("doj"));
		addemp.selectQualification(getData.getKeyValue("qualification"));
		addemp.enterDepartment(getData.getKeyValue("dept"));
		addemp.selectGender(getData.getKeyValue("gender"));
		addemp.enterMobileNo(getData.getKeyValue("mobileNo"));
		addemp.selectBloodGroup(getData.getKeyValue("bloodGroup"));
		addemp.enterDesignation(getData.getKeyValue("designation"));
		addemp.enterSalary(getData.getKeyValue("salary"));
		addemp.enterLoaction(getData.getKeyValue("location"));
		addemp.selectToReporting(getData.getKeyValue("reportingTo"));
		addemp.addBtn();
		addemp.validatingSavedMessage();
		
		login.Logout();
		login.LogoutConfirmation();
		
		
	}
		
		
}


