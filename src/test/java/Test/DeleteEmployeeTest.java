package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.EmployeeListPage;

public class DeleteEmployeeTest extends AddEmployeeTest {
    public void deleteEmployeeTest() throws IOException {
        //Deleting the employee
    	
		EmployeeListPage employeeList=new EmployeeListPage(driver);
        employeeList.serachEmployee(testData.getEmpId());
		employeeList.deleteEmployee();
			
    }
}
