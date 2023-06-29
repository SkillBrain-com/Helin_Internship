package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SingleStatement;


public class SingleStatementTest extends BasePage {

    public SingleStatement singleStatement() {
        return new SingleStatement();
    }

    @Test(description = "Test!")
    @Parameters({"username", "password", "CNP", "name", "additionalName", "country", "county", "city", "address", "email", "phoneNumber"})
    public void singleStatementTest(String username, String password, String CNP, String name, String additionalName, String country, String county, String city, String address, String email, String phoneNumber) {

        singleStatement().clickAuthenticationButton();
        singleStatement().addEmail(username);
        singleStatement().addPassword(password);
        singleStatement().clickRememberMeCheckbox();
        singleStatement().clickLoginButton();
        singleStatement().clickSingleStatementButton();
        singleStatement().clickAcceptCookie();
        singleStatement().addInputCNP(CNP);
        singleStatement().addInputName(name);
        singleStatement().addInputAdditionalName(additionalName);
        singleStatement().addCountry();
        singleStatement().addSearchCountry(country);
        singleStatement().addCountry();
        singleStatement().addCounty();
        singleStatement().addSearchCounty(county);
        singleStatement().clickSearchCounty();
        singleStatement().addInputCity(city);
        singleStatement().addInputAddress(address);
        singleStatement().addInputEmail(email);
        singleStatement().addInputNumber(phoneNumber);
        singleStatement().clickSaveButton();
        singleStatement().addAdaugaVenitButton();


    }
}
