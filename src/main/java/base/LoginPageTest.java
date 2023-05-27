package base;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginPageTest extends BasePage {

    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Test(description = "Happy Test!")
    @Parameters({"username", "password"})
    public void verifyLogin(String username, String password) {

        loginPage().addUserName(username);
        loginPage().addUserPassword(password);
        loginPage().clickLoginButton();
    }

    @Test(description = "Create Account")
    @Parameters({"firstName","lastName", "email","password"})
    public void verifyCreateAccount(String firstName, String lastName, String email, String password){
        loginPage().clickCreateAccount();
        Assert.assertEquals(loginPage().getUrl(),"https://semicolon-task-manager-skillbrains-grxarv6yb-cezarmocanu.vercel.app/signup");
        loginPage().createAccount(firstName, lastName, email,password);

    }


}
