/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageMitraStatic {
    protected static WebDriver driver;

    protected HomePageMitraStatic(WebDriver driver) {
        HomePageMitraStatic.driver = driver;
    }

    protected static By menjadiMitra = By.xpath("//*[contains(text(), 'Menjadi Mitra')]");

    protected static void validateHomePageMitraStatic(WebDriver driver) {
        driver.findElement(menjadiMitra).isDisplayed();
    }
}
