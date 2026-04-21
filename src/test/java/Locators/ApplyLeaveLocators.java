package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ApplyLeaveLocators {
	public String moveToLeaveManagement="//p[text()='Leave Management']";
	public String validatingLeaveManagementModule="//p[text()='Dashboard']/../../../../../../div/div/p\"";
	public String applyLeavebtn="//button[text()='Apply Leave']";
	public String fromdate="fromDate";//id
	public String todate="toDate";//id
	public String subject="subject";//name
	public String reason="reason";//name
	public String submitBtn="//button[@type='submit']";//xpath  
	public String leaveRadiobtn="leave";//id   
	public String leaveappliedValidation="//div[text()='Leave Applied Successfully']";//xpath 
	public String status="//div[text()='Approved']";
	public String startdateValidating="//div[@col-id='startDate']";
	public String enddateValidating="//div[@col-id=endDate]";
}

