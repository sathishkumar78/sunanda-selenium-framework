package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.*;
import Utilities.*;
public class LoginPageAndLogoutPage extends LoginAndLogoutLocators {
	WebDriver driver;
	SeleniumHelperMethod utils;
	public LoginPageAndLogoutPage(WebDriver driver) {
		this.driver=driver;
		this.utils=new SeleniumHelperMethod(driver);
	}
	
	public void enterUsername(String email) throws IOException { 
		utils.sendKeys(By.id(username), email);
	}
	public void enterPassword(String password) throws IOException {
		utils.sendKeys(By.id(passwordLogin), password);
	}
	public void loginBtn() throws IOException {
		utils.click(By.xpath(login_Btn));
	}
	public void validatingWelcomePage() {
		String act_text=utils.findElement(By.xpath(welcomMessage)).getText();
		 Assert.assertEquals(act_text, "Welcome to urBuddi");
	}
	public void Logout() throws IOException {
		utils.click(By.className(logout_Btn));
	}
	public void LogoutConfirmation() throws IOException {
		utils.click(By.xpath(logoutConfirmation));
	}
	

}
