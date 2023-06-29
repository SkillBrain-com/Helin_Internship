package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AddNewCompanyAndPayment.AddNewCompany;
import pages.BasePage;
import pages.LoginPageContactApp;

public class AddNewCompanyTest extends BasePage {
    public AddNewCompany addNewCompany() {
        return new AddNewCompany();
    }
    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }
    @Test(description = "Happy Test!")

    @Parameters({"email","password","textCUI","textNrRegCom","textEntityType","textCompanyName", "textData","textCounty","textCity","textAdress","textContactPerson","textWebSite","textEmail","textPhone"})
    public void test(String email, String password, String textCUI, String textNrRegCom, String textEntityType, String textCompanyName, String textData, String textCounty, String textCity, String textAdress, String textContactPerson, String textWebSite, String textEmail, String textPhone) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        addNewCompany().clickLinkContAppPS();
        addNewCompany().clickIconSettings();
        addNewCompany().clickLinkNewCompany();
        addNewCompany().addCUI(textCUI);
        addNewCompany().addNrRegCom(textNrRegCom);
        addNewCompany().addCompanyName(textCompanyName);
        addNewCompany().clickFieldEntityType(textEntityType);
        addNewCompany().addDataCalendar(textData);
        addNewCompany().clickFieldCounty(textCounty);
        addNewCompany().addCity(textCity);
        addNewCompany().addAdress(textAdress);
        addNewCompany().addContactPerson(textContactPerson);
        addNewCompany().addWebSite(textWebSite);
        addNewCompany().addEmail(textEmail);
        addNewCompany().addPhone(textPhone);
        addNewCompany().clickButtonSave();
    }
}
