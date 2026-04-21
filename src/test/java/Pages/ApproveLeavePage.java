package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumHelperMethod;
import Locators.ApproveLeaveLocators;
public class ApproveLeavePage extends ApproveLeaveLocators {
	WebDriver driver;
	SeleniumHelperMethod utils;
	public ApproveLeavePage(WebDriver driver){
		this.driver=driver;
		this.utils=new SeleniumHelperMethod(driver);
	}
	public void moveToLeaveManagement() throws IOException {
		utils.click(By.xpath(leavemangement));
	}
	public void request() throws IOException {
		utils.click(By.xpath(requests));
	}
	public void approveLeave() throws IOException {
		utils.click(By.xpath(approveLeave_btn));
	}
	public void approveLeaveValidating() throws IOException {
		utils.valiadation(By.xpath(leaveapproveValidating),"Leave Approved");
	}

}
