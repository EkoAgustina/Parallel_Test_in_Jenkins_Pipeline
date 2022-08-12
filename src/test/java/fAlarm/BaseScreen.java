package fAlarm;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseScreen {
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait                wait;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    protected String waitAndClick(By by) { wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
        return null;
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    protected boolean findElement(By by){
        driver.findElement(by);
        return false;
    }

    protected void hideKeyboard() { driver.navigate().back(); }

    protected List<WebElement> waitAndFindElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected WebElement waitAndFindElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected String getText(By by) {
        return waitAndFindElement(by).getText();
    }
    protected String GT(By by){
        return waitAndFindElement(by).getText();
    }

    protected void sendKey(By by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }
}
