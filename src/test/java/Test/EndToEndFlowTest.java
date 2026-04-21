package Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.ReportManager;

@Listeners(ReportManager.class)
public class EndToEndFlowTest extends DeleteEmployeeTest{
	@BeforeTest
	public void Login() throws IOException {
		navigatingTourbuddi();
	}
	
	@BeforeMethod
	public  void addingEmp() throws IOException {
		addEmployee();
	}
	@Test(dependsOnMethods = "AddEmployeeTest")
	public void deleteEmp() throws IOException {
		deleteEmployeeTest();
	}
	
	@AfterClass
	public void browserExit() {
		closeBrowser();
	}
	
	

}
