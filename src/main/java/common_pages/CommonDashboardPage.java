package abstract_pages;

import pages_objects.CartPage;
import pages_objects.DashboardPage;
import pages_objects.LandingPage;
import pages_objects.OrdersPage;
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

    protected DashboardPage goToHome(){
        homeButtonWebElement.click();
        return new DashboardPage(driver);
    }

    protected OrdersPage goToOrders(){
        ordersButtonWebElement.click();
        return new OrdersPage(driver);
    }

    protected CartPage goToCart(){
        cartButtonWebElement.click();
        return new CartPage(driver);
    }

    protected LandingPage signout(){
        signoutButtonWebElement.click();
        return new LandingPage(driver);
    }
}
