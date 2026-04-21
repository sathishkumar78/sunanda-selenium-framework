package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectBrowser extends GetProperty {
	  public WebDriver driver;
	    GetProperty prop;
	  public WebDriver browser(String browsername) throws IOException {
		  prop = new GetProperty();
	        String url=prop.getKeyValue("url");
	        if (browsername != null && browsername.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();

	        } else if (browsername != null && browsername.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();

	        } else {
	            // Default browser
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--disable-notifications");
	            driver = new ChromeDriver(options);
	        }
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get(url);
	       
           return driver;
	  }
}