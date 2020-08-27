package step_definitions; /**
 * Created by risha on 23/08/20
 */

import io.cucumber.java.en.Given;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.HomePageMitra;

public class TestMitra_StepDefinition implements En {
    public WebDriver driver;

    public TestMitra_StepDefinition() {
        Given("mitra initiate automation - Lambda Method", () -> {
            driver = new ChromeDriver();
        });

        When("mitra navigate to Mitra website", () -> {
            String url = "https://mitra.bukalapak.com";
            driver.navigate().to(url);
        });

        Then("mitra validate home page Mitra", () -> {
            new HomePageMitra(driver).validateHomePageMitra.isDisplayed();
        });

        And("mitra quit browser", () -> {
            driver.quit();
        });
    }

    @Given("mitra initiate automation - Annotation Method")
    public void MitraNavigate() {
        driver = new ChromeDriver();
    }
}
