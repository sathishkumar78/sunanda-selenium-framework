package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Pages.*;
import Utilities.EmployeeIDAndEmail;
import Utilities.GetProperty;
import Utilities.RandomGenerator;
import Utilities.SelectBrowser;

public class BaseTest{
		public static WebDriver driver;
		GetProperty getData=new GetProperty();
	//protected EmployeeIDAndEmail empData; // shared object
		public static LoginPageAndLogoutPage loginpage;
		public static EmployeeIDAndEmail testData;

	    @BeforeSuite
	    public void data() {
	        testData = RandomGenerator.generateEmployeeData();
	    }		
	    @BeforeClass
    	public void navigatingTourbuddi() throws IOException  {
	    	SelectBrowser selectBrowser=new SelectBrowser();
	    	driver=selectBrowser.browser("default");
	    	loginpage=new LoginPageAndLogoutPage(driver);
	    	loginpage.validatingWelcomePage();
	    }
	
		
		@AfterClass
		public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            
        }
		}}
    
