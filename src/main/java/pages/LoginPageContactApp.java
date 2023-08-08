package pages;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPageContactApp extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Ai uitat parola?']")
    public WebElement forgotPasswordLink;
    public String[] expectedAlertMessages = {PageLinksAndText.authenticationErrorMessage.getValue(),
            PageLinksAndText.mandatoryEmailMessage.getValue(),
            PageLinksAndText.mandatoryPasswordMessage.getValue()
    };
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;
    @FindBy(xpath = "'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement closeCookieButton;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;
    @FindBy(id = "remember-me")
    private WebElement rememberMeCheckbox;
    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement loginButton;
    @FindBy(xpath = "//label[@for='email']")
    private WebElement emailAlertMessage;
    @FindBy(xpath = "//label[@for='password']")
    private WebElement passwordAlertMessage;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookieButton;

    public void addEmail(String email) {

        addText(email, emailField);
    }

    public void addPassword(String password) {
        addText(password, passwordField);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickAuthenticationButton() {
        click(authenticationButton);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.clickAuthenticationButtonLink.getValue());
    }

    public void clickAcceptCookie() {
        click(acceptCookieButton);
    }

    public void verifyAlertMessages() {
        if (emailAlertMessage.getText().equals(expectedAlertMessages[1]) && passwordAlertMessage.getText().equals(expectedAlertMessages[2])) {
            Assert.assertEquals(emailAlertMessage.getText(), expectedAlertMessages[1]);
            Assert.assertEquals(passwordAlertMessage.getText(), expectedAlertMessages[2]);
        } else if (emailAlertMessage.getText().equals(expectedAlertMessages[1])) {
            Assert.assertEquals(emailAlertMessage.getText(), expectedAlertMessages[1]);
        } else if (passwordAlertMessage.getText().equals(expectedAlertMessages[2])) {
            Assert.assertEquals(passwordAlertMessage.getText(), expectedAlertMessages[2]);
        } else {
            Assert.assertEquals(emailAlertMessage.getText(), expectedAlertMessages[0]);
        }
    }

    public void clickCloseCookie() {
        clickCloseCookie();
    }
}
