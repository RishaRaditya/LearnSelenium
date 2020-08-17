/**
 * Created by risha on 17/08/20
 */

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gradle_JUnit_DriverOpenBrowser {

    @Test
    public void driveOpenValidateQuit() {
        String url = "https://mitra.bukalapak.com";
        WebDriver driver = new ChromeDriver();

        driver.navigate().to(url);
        driver.findElement(By.xpath("//*[contains(text(), 'Menjadi Mitra')]"));

        driver.close();
        driver.quit();
    }
}
