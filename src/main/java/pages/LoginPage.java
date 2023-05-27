package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement emailPassword;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//body//div//p[2]")
    private WebElement createAccount;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Create account')]")
    private WebElement buttonCreateAccount;

    public void addUserName(String username) {
        addText(emailAddress, username);
    }

    public void addUserPassword(String userpassword) {
        addText(emailPassword, userpassword);
    }

    public void clickLoginButton() {
        click(buttonLogin);
    }

    public void clickCreateAccount(){
        click(createAccount);
    }
    public void createAccount(String firstName,
                                   String lastName,
                                   String email,
                                   String password) {

        addText(this.firstName, firstName);
        addText(this.lastName, lastName);
        addText(this.email, email);
        addText(this.password, password);
        click(buttonCreateAccount);
    }
}
