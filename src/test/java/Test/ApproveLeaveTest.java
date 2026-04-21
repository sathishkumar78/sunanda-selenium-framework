package Test;

import java.io.IOException;

import Pages.ApproveLeavePage;
import Pages.LoginPageAndLogoutPage;

public class ApproveLeaveTest  extends BaseTest{
	
	public void approveLeave() throws IOException {
		
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		login.enterUsername(getData.getKeyValue("username"));
	    login.enterPassword(getData.getKeyValue("passwordAdmin"));
	    login.loginBtn();
		
		ApproveLeavePage approveLeave=new ApproveLeavePage(driver);
		approveLeave.moveToLeaveManagement();
		approveLeave.request();
		approveLeave.approveLeave();
		approveLeave.approveLeaveValidating();
		
		login.Logout();
		login.LogoutConfirmation();
	}
	

}
