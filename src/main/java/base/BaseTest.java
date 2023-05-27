package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;


public class BaseTest {
    protected WebDriver driver;
    Actions action;
    public BaseTest() {
        driver = BasePage.driverLocal;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    private WebDriverWait waitElement(){
        return new WebDriverWait(driver,15);
    }

    protected WebElement find(WebElement locator) {
        waitElement().until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }

    protected void click(WebElement locator){
        clickAble(locator).click();
    }

    protected WebElement clickAble(WebElement locator) {
        waitElement().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    protected void clear(WebElement locator){
        click(locator);
        if(getOperationSystem().contains("Windows")){
            locator.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        } else if (getOperationSystem().contains("Mac OS X")) {
            locator.sendKeys(Keys.chord(Keys.COMMAND,"a"));
        }
    }

    protected void addText(WebElement locator, String inputText ) {
        clear(locator);
        locator.sendKeys(inputText);
    }

    protected String getPageTitle(){
        return driver.getTitle();
    }

    protected String getUrl(){
        return driver.getCurrentUrl();
    }

    private String getOperationSystem(){
        String operateSystem = System.getProperty("os.name");
        return operateSystem;
    }

}

