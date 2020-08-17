/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class Gradle_TestNG_DriverOpenBrowser_Marketplace {
    private static WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public static void openBrowser(@Optional("chrome") String browser) {
        String url = "https://www.bukalapak.com";

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }

        driver.navigate().to(url);
    }

    @AfterMethod
    public static void closeBrowser() {
        driver.quit();
    }

    @Test
    public void validateMarketplace() {
        driver.findElement(By.xpath("//*[contains(text(), 'Diskon tiap hari')]"));
    }
}
