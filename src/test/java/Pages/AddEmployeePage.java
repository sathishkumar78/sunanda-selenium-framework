package Pages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Locators.*;
import Utilities.*;

public class AddEmployeePage extends AddEmployeeLocators{
		WebDriver driver;
		SeleniumHelperMethod utils;
		public AddEmployeePage(WebDriver driver){
			this.driver=driver;
			this.utils=new SeleniumHelperMethod(driver);
		}
	
	public void movingToEmployeeModuleAndClickingOnAddEmployee() throws IOException {
		utils.click(By.xpath(employeemodule));
		//Adding Employee
		utils.click(By.xpath(addemployeeBtn));
	}
	public void enterFirstname(String firstnameValue) throws IOException {
		utils.sendKeys(By.name(firstname), firstnameValue);
	}
	public void enterLastname(String lastnameValue) throws IOException {
		utils.sendKeys(By.name(lastname), lastnameValue);
	}
	public void enterEmployeeId(String empIdValue) throws IOException {
		utils.sendKeys(By.id(empId), empIdValue);
	}
	public void enterEmail(String emailValue) throws IOException {
		utils.sendKeys(By.name(email), emailValue);
	}
	public void selectRole(String roleValue) {
		utils.dropDown(By.id(role), roleValue);
	}
	public void enterPassword(String PasswordValue) throws IOException {
		utils.sendKeys(By.name(password), PasswordValue);		
	}
	public void enterDOB(String dobValue) throws IOException {
		utils.sendKeys(By.name(dob), dobValue);		
	}
	public void enterDOJ(String dojValue) throws IOException {
		utils.sendKeys(By.name(doj), dojValue);		
	}
	public void selectQualification(String qualificationValue) {
		utils.dropDown(By.id(qualification), qualificationValue);		
	}
	public void enterDepartment(String deptValue) throws IOException {
		utils.sendKeys(By.name(dept), deptValue);
		
	}
	public void selectGender(String genderValue) {
		utils.dropDown(By.id(gender), genderValue);
	}
	public void enterMobileNo(String mobileNoValue) throws IOException {
		utils.sendKeys(By.name(mobileNo), mobileNoValue);		
	}
	public void selectBloodGroup(String bloogGroupValue) {
		utils.dropDown(By.id(bloodgroup), bloogGroupValue);	
	}
	public void enterDesignation(String designationValue) throws IOException {
		utils.sendKeys(By.name(designation), designationValue);		
	}
	public void enterSalary(String salaryValue) throws IOException {
		utils.sendKeys(By.id(salary), salaryValue);
	}
	public void enterLoaction(String locationValue) throws IOException {
		utils.sendKeys(By.name(loaction), locationValue);	
	}
	public void selectToReporting(String reportingToValue) {
		utils.dropDown(By.id(reportingTo), reportingToValue);		
	}
	public void selectCertificates(String certificatesValue) {
		utils.dropDown(By.className(certifiactes), certificatesValue);
		
	}
	public void addBtn() throws IOException {
		utils.click(By.xpath(addBtn));
	}
	public void validatingSavedMessage() throws IOException {
		utils.valiadation(By.xpath(savedsuccessfully),"Saved Successfully");
	}
	
	

}
