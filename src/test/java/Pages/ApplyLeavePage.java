package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Locators.ApplyLeaveLocators;
import Utilities.SeleniumHelperMethod;

public class ApplyLeavePage extends ApplyLeaveLocators {
	WebDriver driver;
	SeleniumHelperMethod utils;
	public ApplyLeavePage(WebDriver driver){
		this.driver=driver;
		this.utils=new SeleniumHelperMethod(driver);
	}
	public void moveToLeaveMangement() throws IOException {
		utils.click(By.xpath(moveToLeaveManagement));
	}
	public void validatingLeaveToManagement() throws IOException {
		utils.valiadation(By.xpath(validatingLeaveManagementModule),"Leave Management");
	}
	public void applyLeave() throws IOException {
		utils.click(By.xpath(applyLeavebtn));
	}
	public void fromDate(String Fromdate) throws IOException {
		utils.sendKeys(By.id(fromdate), Fromdate);
	}
	public void toDate(String Todate) throws IOException {
		utils.sendKeys(By.id(todate), Todate);
	}
	public void subject(String Subject) throws IOException {
		utils.sendKeys(By.name(subject),Subject);
	}
	public void reason(String Reason) throws IOException {
		utils.sendKeys(By.name(reason), Reason);
	}
	public void leaveRadioBtn() throws IOException {
		utils.click(By.id(leaveRadiobtn));
	}
	public void submitBtn() throws IOException{
		utils.click(By.xpath(submitBtn));
	}
	public void leaveappliedValidation() throws IOException {
		utils.valiadation(By.xpath(leaveappliedValidation), "Leave Applied Successfully");
	}
	public void status() throws IOException {
		utils.valiadation(By.xpath(status), "Approved");
	}
	public void startDate(String startdatevalidate) throws IOException {
		utils.valiadation(By.xpath(startdateValidating), startdatevalidate);
	}
	public void endDate(String endDateValidate) throws IOException
	{
		utils.valiadation(By.xpath(enddateValidating), endDateValidate);
	}


}
