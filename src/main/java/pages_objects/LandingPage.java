package pages_objects;

import common_pages.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LandingPage extends CommonPage {

    @FindBy(css = ".btn1")
    WebElement registerButtonWebElement;

    @FindBy(id="userEmail")
    WebElement userEmailInputWebElement;

    @FindBy(id="userPassword")
    WebElement userPasswordInputWebElement;

    @FindBy(id="login")
    WebElement loginButtonWebElement;

    By toastMessageBy = By.cssSelector("[class *= 'toast-message']");

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public DashboardPage login(String useremail, String password) {

        this.enterCredentials(useremail, password);
        this.validateCredentials();
        return new DashboardPage(driver);
    }

    public void enterCredentials(String useremail, String password) {
        this.userEmailInputWebElement.sendKeys(useremail);
        this.userPasswordInputWebElement.sendKeys(password);
    }

    public void validateCredentials(){
        loginButtonWebElement.click();
    }

    public String getToastMessageContent(){
        this.waitForElementToAppear(toastMessageBy);
        return driver.findElement(toastMessageBy).getText();
    }

    public String getUrlPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.getCurrentUrl();
    }
}
