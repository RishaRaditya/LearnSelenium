/**
 * Created by risha on 23/08/20
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMitra {
    protected WebDriver driver;

    protected HomePageMitra(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(), 'Menjadi Mitra')]")
    protected WebElement validateHomePageMitra;
}
