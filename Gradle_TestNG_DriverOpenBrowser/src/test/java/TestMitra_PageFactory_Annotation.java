/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMitra_PageFactory_Annotation {

    @Test
    protected void testMitra() {
        WebDriver driver = new ChromeDriver();
        String url = "https://mitra.bukalapak.com";

        driver.navigate().to(url);

        new HomePageMitra_PageFactory_Annotation(driver).validateHomePageMitra_Annotation.isDisplayed();

        driver.quit();
    }
}
