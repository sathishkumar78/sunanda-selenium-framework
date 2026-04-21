package Utilities;

import org.openqa.selenium.*;

public class ScreenshotUtililty {
    public static String captureBase64(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
