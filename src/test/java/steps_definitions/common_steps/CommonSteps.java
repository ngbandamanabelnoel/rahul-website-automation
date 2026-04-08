package steps_definitions.common_steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages_objects.LandingPage;

import java.time.Duration;

public class CommonSteps {

    public WebDriver driver;
    public LandingPage landingPage;

    public WebDriver initializeDriver() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 900)); // run full screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client/");
    }

    public LandingPage launchApplication() {
        driver = this.initializeDriver();
        landingPage = new LandingPage(driver);
        this.goTo();
        return landingPage;
    }

    public void quitTest() {
        driver.quit();
    }
}