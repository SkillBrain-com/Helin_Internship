package pages.pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {

    @FindBy(xpath = "//h5[normalize-space()='Welcome Back']")
    private WebElement welcomeBack;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[normalize-space()='here']")
    private WebElement createAccount;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkboxRememberME;

}
