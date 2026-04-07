package SeleniumFramework.RahulWebSiteAutomation.pages.abstractPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class CommonDashboardPage extends CommonPage {

    @FindBy(xpath="//button[routerlink='/dashboard/']")
    protected WebElement homeButtonWebElement;

    @FindBy(xpath="//button[routerlink='/dashboard/myorders']")
    protected WebElement ordersButtonWebElement;

    @FindBy(xpath="//button[routerlink='/dashboard/cart']")
    protected WebElement cartButtonWebElement;

    @FindBy(xpath="//button[normalize-space()='Sign Out']")
    protected WebElement signoutButtonWebElement;


    public CommonDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
