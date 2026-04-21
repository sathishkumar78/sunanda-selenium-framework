package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends GetProperty{
	
	public int waitSeconds() throws IOException {
		String waitTime=getKeyValue("long");
		int waitSecondsTime=Integer.parseInt(waitTime);
		return waitSecondsTime;

	}
	
	public void waitUntilVisble(WebDriver driver,WebElement element) throws IOException{
	        int seconds=waitSeconds();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(element));

		}
	public void waitUntilClickable(WebDriver driver,WebElement element) throws IOException {
		int seconds=waitSeconds();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	

}