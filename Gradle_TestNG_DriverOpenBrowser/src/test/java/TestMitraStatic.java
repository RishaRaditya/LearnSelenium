/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMitraStatic {

    @Test
    protected void testMitra() {
        WebDriver driver = new ChromeDriver();
        String url = "https://mitra.bukalapak.com";

        driver.navigate().to(url);

        HomePageMitraStatic.validateHomePageMitraStatic(driver);

        driver.quit();
    }
}
