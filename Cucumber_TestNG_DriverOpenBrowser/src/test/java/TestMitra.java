/**
 * Created by risha on 23/08/20
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_object.HomePageMitra;

public class TestMitra {

    @Test
    protected void testMitra() {
        WebDriver driver = new ChromeDriver();
        String url = "https://mitra.bukalapak.com";

        driver.navigate().to(url);

        new HomePageMitra(driver).validateHomePageMitra.isDisplayed();

        driver.quit();
    }
}
