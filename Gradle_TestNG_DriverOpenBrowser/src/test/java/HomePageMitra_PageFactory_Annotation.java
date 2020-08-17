/**
 * Created by risha on 17/08/20
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMitra_PageFactory_Annotation {
    protected WebDriver driver;

    protected HomePageMitra_PageFactory_Annotation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(), 'Menjadi Mitra')]")
    protected WebElement validateHomePageMitra_Annotation;
}
