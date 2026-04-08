package pages_objects;

import abstract_pages.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonPage {

    @FindBy(id="firstName")
    WebElement firstNameInputWebElement;

    @FindBy(id="lastName")
    WebElement lastNameInputWebElement;

    @FindBy(id="userEmail")
    WebElement userEmailInputWebElement;

    @FindBy(id="userMobile")
    WebElement userMobileInputWebElement;

    @FindBy(id="userPassword")
    WebElement userPasswordInputWebElement;

    @FindBy(id="confirmPassword")
    WebElement confirmPasswordInputWebElement;

    @FindBy(id="login")
    WebElement registerButtonWebElement;

    By occupationLocator = By.cssSelector(".custom-select.ng-untouched.ng-pristine.ng-valid");
    By maleGenderLocator = By.cssSelector("input[value='Male']");
    By femaleGenderLocator = By.cssSelector("input[value='Female']");


    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
