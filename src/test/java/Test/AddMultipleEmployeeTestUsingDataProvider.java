package Test;



import java.io.IOException;

import Utilities.EmployeeDataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AddEmployeePage;
import Pages.LoginPageAndLogoutPage;
import Utilities.ReportManager;


@Listeners(ReportManager.class)
public class AddMultipleEmployeeTestUsingDataProvider extends BaseTest {

	@Test(dataProvider = "empData",dataProviderClass = EmployeeDataProvider.class)
	public void addEmployee(String firstname,String lastname,String employeeid,String email,String role,String password,String dob,String doj,String qualification,String department,String gender,String mobileno,String bloodgroup,String designation,String salary ,String location,String selectToreporting,String adminusername,String adminpassword) throws IOException{
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		login.enterUsername(adminusername);
	    login.enterPassword(adminpassword);
	    login.loginBtn();
		
	    
		
		AddEmployeePage addemp=new AddEmployeePage(driver);
	
		addemp.movingToEmployeeModuleAndClickingOnAddEmployee();
		addemp.enterFirstname(firstname);
		addemp.enterLastname(lastname);
		addemp.enterEmployeeId(employeeid);
		addemp.enterEmail(email);
		addemp.selectRole(role);
		addemp.enterPassword(password);
		addemp.enterDOB(dob);
		addemp.enterDOJ(doj);
		addemp.selectQualification(qualification);
		addemp.enterDepartment(department);
		addemp.selectGender(gender);
		addemp.enterMobileNo(mobileno);
		addemp.selectBloodGroup(bloodgroup);
		addemp.enterDesignation(designation);
		addemp.enterSalary(salary);
		addemp.enterLoaction(location);
		addemp.selectToReporting(selectToreporting);
		
		//addemp.addBtn();
		//addemp.validatingSavedMessage();
		
	    login.Logout();
		
		
	}
		
		
}


