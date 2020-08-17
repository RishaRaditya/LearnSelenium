/**
 * Created by risha on 17/08/20
 */

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_JUnit_DriverOpenBrowser {

    @Test
    public void startSite() {
        String url = "https://www.facebook.com";
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String title = driver.getTitle();
        System.out.println("The title of " + url + " is: " + title);

        driver.quit();
    }
}
