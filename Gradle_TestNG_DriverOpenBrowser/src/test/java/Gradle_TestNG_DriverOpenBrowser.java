/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gradle_TestNG_DriverOpenBrowser {
    private static WebDriver driver;

    @BeforeMethod
    public static void openBrowser() {
        String url = "https://mitra.bukalapak.com";
        driver = new ChromeDriver();

        driver.navigate().to(url);
    }

    @AfterMethod
    public static void closeBrowser() {
        driver.quit();
    }

    @Test
    public void validateMitra() {
        driver.findElement(By.xpath("//*[contains(text(), 'Menjadi Mitraxxx')]"));
    }
}
