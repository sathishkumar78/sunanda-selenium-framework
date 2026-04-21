package Pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Locators.*;

import Utilities.*;
public class EmployeeListPage extends DeleteEmployeeLocators{
	WebDriver driver;
	SeleniumHelperMethod utils;
	public String empid;
	public EmployeeListPage(WebDriver driver){
		this.driver=driver;
		this.utils=new SeleniumHelperMethod(driver);
	}
	public void serachEmployee(String empid) throws IOException {
		this.empid=empid;
		utils.sendKeys(By.xpath(searchemployeeId), empid);
		utils.click(By.xpath(selectemployee));
	}
	public void deleteEmployee() throws IOException {
		utils.click(By.xpath(deleteIcon));
	}
	public void validatingDeleteMessage() throws IOException {
		utils.valiadation(By.xpath(deletevalidating),"Employee Deleted Successfully");
	}

}
