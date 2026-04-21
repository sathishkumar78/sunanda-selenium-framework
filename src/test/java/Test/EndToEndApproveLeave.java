package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AddEmployeePage;
import Pages.ApplyLeavePage;
import Pages.ApproveLeavePage;
import Pages.LoginPageAndLogoutPage;
import Utilities.ReportManager;
@Listeners(ReportManager.class)
public class EndToEndApproveLeave extends BaseTest {
	@Test
	public void endToendTestFlow() throws IOException {
		
		//Login To AdminAccount
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		login.enterUsername(getData.getKeyValue("username"));
	    login.enterPassword(getData.getKeyValue("passwordAdmin"));
	    login.loginBtn();
		
		//Adding Employee
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
		
		
		//Login To Employee account
		login.enterUsername(testData.getEmail());
	    login.enterPassword(getData.getKeyValue("passwordEmp"));
	    login.loginBtn();
	    
	    //Applying Leave
	    ApplyLeavePage applyleave=new ApplyLeavePage(driver);
		applyleave.moveToLeaveMangement();
		applyleave.validatingLeaveToManagement();
		applyleave.applyLeave();
		applyleave.fromDate(getData.getKeyValue("fromdate"));
		applyleave.toDate(getData.getKeyValue("todate"));
		applyleave.subject(getData.getKeyValue("subject"));
		applyleave.reason(getData.getKeyValue("reason"));
		applyleave.leaveRadioBtn();
		applyleave.submitBtn();
		applyleave.leaveappliedValidation();
		
		
		
		//Login AdminAccount
		login.enterUsername(getData.getKeyValue("username"));
	    login.enterPassword(getData.getKeyValue("passwordAdmin"));
	    login.loginBtn();
	    
	    //Approve Leave
	    ApproveLeavePage approveLeave=new ApproveLeavePage(driver);
		approveLeave.moveToLeaveManagement();
		approveLeave.request();
		approveLeave.approveLeave();
		approveLeave.approveLeaveValidating();
		
		
		
		//Login To Employee To Check Approved leave
		login.enterUsername(testData.getEmail());
	    login.enterPassword(getData.getKeyValue("passwordEmp"));
	    login.loginBtn();
	    
	    //Leave Approved Verify
	    applyleave.status();
		applyleave.startDate(getData.getKeyValue("fromdate"));
		applyleave.endDate(getData.getKeyValue("todate"));
		
		
	}

}
