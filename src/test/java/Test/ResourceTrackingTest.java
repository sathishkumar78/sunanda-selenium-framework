package Test;
import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPageAndLogoutPage;
import Pages.ResourceTrackingPage;
import Utilities.ReportManager;
@Listeners(ReportManager.class)
public class ResourceTrackingTest extends BaseTest{
	@BeforeMethod
	public void Login() throws IOException {
		
		LoginPageAndLogoutPage login=new LoginPageAndLogoutPage(driver);
		login.enterUsername(getData.getKeyValue("username"));
	    login.enterPassword(getData.getKeyValue("passwordAdmin"));
	    login.loginBtn();
	}
	@Test
	public void addResource() throws IOException {
		ResourceTrackingPage resourceTracking=new ResourceTrackingPage(driver);
		resourceTracking.moveToResourceTracking();
		resourceTracking.addResource();
		resourceTracking.allocatedate(getData.getKeyValue("allocatedDate"));
		resourceTracking.deviceType(getData.getKeyValue("devicetype"));
		resourceTracking.serialId(getData.getKeyValue("serialId"));
		resourceTracking.model(getData.getKeyValue("model"));
		resourceTracking.submit();
		resourceTracking.validatingResourceAllocation();
	}

}
