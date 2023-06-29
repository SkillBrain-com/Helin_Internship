package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

public class AddClientProceedsPageTest extends BasePage {

    String addNewPaymentWindow = "https://ps.contapp.ro/venituri/factura/creaza?preview=false";
    public AddClientProceedsPage addClient(){

        return new AddClientProceedsPage();
    }

    public AddProceedsPage addProceeds(){
        return new AddProceedsPage();
    }




    @Test(description = "Succesfull new proceed added")
    @Parameters({"cuiOrCif", "registerNumber", "name", "iban", "bankName", "city", "adress", "conctactPersonName", "email", "phone", "website", "nrDocuments", "price", "expText"})
    public void addNewProceed(String cuiOrCif, String registerNumber, String name, String iban, String bankName, String city, String adress, String conctactPersonName, String email, String phone, String website, String nrDocuments, String price, String expText) {
        LoginContaApp loginApp = new LoginContaApp();
        loginApp.loginContaAccount("olaru.iuliana1999@gmail.com", "ovi17071");
        addClient().closeCoockiesAdd();
        addClient().clickContAppPSButton();
        addClient().clickAddProceedsButton();
        addClient().clickClientDroplist();
        addClient().clientDropDownList(1, ".select2-results__option.select2-results__option--selectable").click();
        addClient().addCuiOrCIF(cuiOrCif);
        addClient().addRegisterNumber(registerNumber);
        addClient().clickEntityTypeDroplistButton();
        addClient().clientDropDownList(1, ".select2-results__option.select2-results__option--selectable").click();
        addClient().addNameField(name);
        addClient().clickDeadlineDroplistButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", "14").click();
        addClient().addIbanField(iban);
        addClient().addBankNameField(bankName);
        addClient().clickCountryDroplistButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", " Austria").click();
        addClient().clickCountyDroplistButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", " Tyrol").click();
        addClient().addCityField(city);
        addClient().addAdressField(adress);
        addClient().clickCurrencyButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", " USD").click();
        addClient().addContactPersonField(conctactPersonName);
        addClient().addContactPersonEmailField(email);
        addClient().addContactPersonPhoneField(phone);
        addClient().addContactPersonWebsiteField(website);
        addClient().clickSaveButton();

        addProceeds().clickBankHome();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Bancă principală").click();
        addProceeds().clickActivityPlace();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Sediul profesional").click();
        addProceeds().clickCaenCode();
        addProceeds().droplistIndex(2, ".select2-selection.select2-selection--single").click();
        addProceeds().clickDocuments();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Decont").click();
        addProceeds().addNumberOfDocuments(nrDocuments);
        addProceeds().price(price);
        addProceeds().clickTypeOfAcquisition();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Bunuri").click();
        addProceeds().addExplication(expText);
        addProceeds().clickFiscalCategory();
        addProceeds().droplistIndex(4, ".select2-selection.select2-selection--single").click();
        addProceeds().clickSaveButton();
    }

    @Test(description = "Succesfull new client added")
    @Parameters({"cuiOrCif", "registerNumber", "name", "iban", "bankName", "city", "adress", "conctactPersonName", "email", "phone", "website"})
    public void addNewClient(String cuiOrCif, String registerNumber, String name, String iban, String bankName, String city, String adress, String conctactPersonName, String email, String phone, String website) throws InterruptedException {
        LoginContaApp loginApp = new LoginContaApp();
        loginApp.loginContaAccount("olaru.iuliana1999@gmail.com", "ovi17071");
        addClient().closeCoockiesAdd();
        addClient().clickContAppPSButton();
        addClient().clickAddProceedsButton();
        addClient().clickClientDroplist();
        addClient().clientDropDownList(1, ".select2-results__option.select2-results__option--selectable").click();
        addClient().addCuiOrCIF(cuiOrCif);
        addClient().addRegisterNumber(registerNumber);
        addClient().clickEntityTypeDroplistButton();
        addClient().clientDropDownList(1, ".select2-results__option.select2-results__option--selectable").click();
        addClient().addNameField(name);
        addClient().clickDeadlineDroplistButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", "30").click();
        addClient().addIbanField(iban);
        addClient().addBankNameField(bankName);
        addClient().clickCountryDroplistButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", " Mali").click();
        addClient().clickCountyDroplistButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", " Bamako").click();
        addClient().addCityField(city);
        addClient().addAdressField(adress);
        addClient().clickCurrencyButton();
        addClient().byWordDropList(".select2-results__option.select2-results__option--selectable", " USD").click();
        addClient().addContactPersonField(conctactPersonName);
        addClient().addContactPersonEmailField(email);
        addClient().addContactPersonPhoneField(phone);
        addClient().addContactPersonWebsiteField(website);
        addClient().clickSaveButton();
        addClient().succesConfirmationPopup();
    }


    @Test(description = "Add new client just with the minimal information")
    @Parameters({"name", "city", "adress"})
    public void addMinimReqNewClient(String name, String city, String adress) {
        LoginContaApp loginApp = new LoginContaApp();
        loginApp.loginContaAccount("olaru.iuliana1999@gmail.com", "ovi17071");
        addClient().closeCoockiesAdd();
        addClient().clickContAppPSButton();
        addClient().clickAddProceedsButton();
        addClient().clickClientDroplist();
        addClient().clientDropDownList(1, ".select2-results__option.select2-results__option--selectable").click();
        addClient().clickEntityTypeDroplistButton();
        addClient().clientDropDownList(1, ".select2-results__option.select2-results__option--selectable").click();
        addClient().addNameField(name);
        addClient().clickDeadlineDroplistButton();
        addClient().byWOrdDropList(".select2-results__option.select2-results__option--selectable", "7").click();
        addClient().clickCountryDroplistButton();
        addClient().byWOrdDropList(".select2-results__option.select2-results__option--selectable", "Italia").click();

        addClient().clickCountyDroplistButton();
        addClient().byWOrdDropList(".select2-results__option.select2-results__option--selectable", "Basilicata").click();
        addClient().addCityField(city);
        addClient().addAdressField(adress);
        addClient().clickSaveButton();
    }

    @Test(description = "When clicking to add a new payment of an existing client it redirects you on the payment page")
    @Parameters({"text"})
    public void addNewPayment(String text) {
        LoginContaApp loginApp = new LoginContaApp();
        loginApp.loginContaAccount("olaru.iuliana1999@gmail.com", "ovi17071");
        addClient().closeCoockiesAdd();
        addClient().clickContAppPSButton();
        addClient().clickAddProceedsButton();
        addClient().clickClientDroplist();
        addClient().byWordDropList("select2-results__option select2-results__option--selectable", text).click();
        addClient().addNewPayment();
        Assert.assertEquals(driver_local.getCurrentUrl(), addNewPaymentWindow);
    }

    @Test(description = "Error popup for adding a number over the limit")
    @Parameters({"text", "number"})
    public void overLimitErrorPopup(String text, Integer number){
        LoginContaApp loginApp = new LoginContaApp();
        loginApp.loginContaAccount("olaru.iuliana1999@gmail.com", "ovi17071");
        addClient().closeCoockiesAdd();
        addClient().clickContAppPSButton();
        addClient().clickAddProceedsButton();
        addClient().clickClientDroplist();
        addClient().byWordDropList("select2-results__option select2-results__option--selectable", text).click();
        addProceeds().clickBankHome();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Casă principală").click();
        addProceeds().clickImputValue();
        addProceeds().checks(number);
    }

    @Test(description = "Succesfull new proceed added in other proceeds window")
    @Parameters({"nrDocuments", "price", "expText"})
    public void addOtherProceed(String nrDocuments, String price, String expText) {
        LoginContaApp loginApp = new LoginContaApp();
        loginApp.loginContaAccount("olaru.iuliana1999@gmail.com", "ovi17071");
        addClient().closeCoockiesAdd();
        addClient().clickContAppPSButton();
        addClient().clickAddProceedsButton();
        addClient().clickOtherProceeds();
        addProceeds().clickBankHome();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Bancă principală").click();
        addProceeds().clickActivityPlace();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Sediul profesional").click();
        addProceeds().clickCaenCode();
        addProceeds().droplistIndex(2, ".select2-selection.select2-selection--single").click();
        addProceeds().clickDocuments();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Bon fiscal").click();
        addProceeds().addNumberOfDocuments(nrDocuments);
        addProceeds().price(price);
        addProceeds().clickTypeOfAcquisition();
        addProceeds().byWordDropList(".select2-selection.select2-selection--single", " Aporturi").click();
        addProceeds().addExplication(expText);
        addProceeds().clickFiscalCategory();
        addProceeds().droplistIndex(4, ".select2-selection.select2-selection--single").click();
        addProceeds().clickSaveButton();
    }






}
