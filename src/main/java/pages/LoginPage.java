package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {

<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 3b52f1c (Tenma ContApp)
=======
>>>>>>> origin/UpdateBaseTest
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
<<<<<<< HEAD
<<<<<<< HEAD
        addText(username, emailAddress);
    }

    public void addUserPassword(String userpassword) {
        addText(userpassword, emailPassword);
=======
=======
>>>>>>> origin/UpdateBaseTest
        addText(emailAddress, username);
    }

    public void addUserPassword(String userpassword) {
        addText(emailPassword, userpassword);
<<<<<<< HEAD
>>>>>>> 3b52f1c (Tenma ContApp)
=======
>>>>>>> origin/UpdateBaseTest
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

<<<<<<< HEAD
<<<<<<< HEAD
        addText(firstName, this.firstName);
        addText(lastName, this.lastName);
        addText(email, this.email);
        addText(password, this.password);
        click(buttonCreateAccount);
    }

=======
=======
>>>>>>> origin/UpdateBaseTest
        addText(this.firstName, firstName);
        addText(this.lastName, lastName);
        addText(this.email, email);
        addText(this.password, password);
        click(buttonCreateAccount);
    }
<<<<<<< HEAD
>>>>>>> 3b52f1c (Tenma ContApp)
=======
>>>>>>> origin/UpdateBaseTest
}
