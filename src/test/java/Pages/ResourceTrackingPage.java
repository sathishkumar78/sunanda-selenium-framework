package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumHelperMethod;
import Locators.*;

public class ResourceTrackingPage extends ResourceTrackingLocators{
	WebDriver driver;
	SeleniumHelperMethod utils;
	public ResourceTrackingPage (WebDriver driver){
		this.driver=driver;
		this.utils=new SeleniumHelperMethod(driver);
	}
	public void moveToResourceTracking() throws IOException {
		utils.click(By.xpath(resourceTracking));
	}
	public void addResource() throws IOException {
		utils.click(By.xpath(addresource));
	}
	public void allocatedate(String allocatingDate) throws IOException {
		utils.sendKeys(By.xpath(allocatingdate), allocatingDate);
	}
	public void deviceType(String devicetype) {
		utils.dropDown(By.name(deviceType),devicetype);
	}
	public void serialId(String serialId) throws IOException {
		utils.sendKeys(By.name(serialid), serialId);
	}
	public void model(String Model) throws IOException {
		utils.sendKeys(By.name(model), Model);
	}
	public void submit() throws IOException {
		utils.click(By.xpath(submit_btn));
	}
	public void validatingResourceAllocation() throws IOException {
		utils.valiadation(By.xpath(validateresourceadd),"Resource added Successfully");
	}


}
