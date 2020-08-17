/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageMitra {
    protected WebDriver driver;

    protected HomePageMitra(WebDriver driver) {
        this.driver = driver;
    }

    protected By menjadiMitra = By.xpath("//*[contains(text(), 'Menjadi Mitra')]");

    protected void validateHomePageMitra() {
        driver.findElement(menjadiMitra).isDisplayed();
    }
}
