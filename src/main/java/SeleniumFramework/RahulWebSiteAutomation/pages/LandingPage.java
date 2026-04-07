package SeleniumFramework.RahulWebSiteAutomation.pages;

import SeleniumFramework.RahulWebSiteAutomation.pages.abstractPages.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends CommonPage {

    @FindBy(css = ".btn1")
    WebElement registerButtonWebElement;

    @FindBy(id="userEmail")
    WebElement userEmailInputWebElement;

    @FindBy(id="userPassword")
    WebElement userPasswordInputWebElement;

    @FindBy(id="login")
    WebElement loginButtonWebElement;

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
