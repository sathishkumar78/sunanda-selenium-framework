package Test;

import java.io.IOException;

import Pages.ApplyLeavePage;
import Pages.LoginPageAndLogoutPage;

public class ApplyLeaveTest extends BaseTest {
	
		public void applyLeave() throws IOException {
		
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		login.enterUsername(testData.getEmail());
	    login.enterPassword(getData.getKeyValue("passwordEmp"));
	    login.loginBtn();
	    
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
		
		login.Logout();
		login.LogoutConfirmation();
		
		}
	
		public void verifyApprovedLeave() throws IOException {
		ApplyLeavePage verifyapplyLeavePage=new ApplyLeavePage(driver);
		verifyapplyLeavePage.status();
		verifyapplyLeavePage.startDate(getData.getKeyValue("fromdate"));
		verifyapplyLeavePage.endDate(getData.getKeyValue("todate"));
		
		}
		

}
