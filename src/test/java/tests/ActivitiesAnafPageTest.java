package tests;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ActivitiesAnafPage;
import pages.BasePage;
import pages.LoginPageContactApp;


public class ActivitiesAnafPageTest extends BasePage {
    public ActivitiesAnafPage activitiesAnafPage() {
        return new ActivitiesAnafPage();
    }

    public LoginPageContactApp login() {
        return new LoginPageContactApp();
    }

    @Test(description = "Testare ActivitatiAnaf")
    @Parameters({"email", "pass", "textCampCautare"})
    public void ActivitiesAnafPageTest(String email, String pass, String textCampCautare) {
        login().clickCloseCookie();
        login().clickAuthenticationButton();
        login().addEmail(email);
        login().addPassword(pass);
        login().clickRememberMeCheckbox();
        login().clickLoginButton();
        activitiesAnafPage().clickButonDocumentatie();
        activitiesAnafPage().getSearchResult(textCampCautare);
        activitiesAnafPage().verifMessage();



    }
}