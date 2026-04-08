package abstract_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class CommonPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    protected void waitForElementsToAppear(By findBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findBy));
    }

    protected void waitForElementToAppear(By findBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    protected void waitForElementToDesappear(By findBy) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
    }

    protected void waitForWebElementToAppear(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
