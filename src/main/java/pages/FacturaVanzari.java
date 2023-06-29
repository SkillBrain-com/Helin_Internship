package pages;


import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FacturaVanzari extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;

    @FindBy(xpath = "//a[normalize-space()='Creeaza un cont!']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

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
    @FindBy(xpath = "//a[normalize-space()='Ai uitat parola?']")
    private WebElement forgotPasswordLink;


    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPs;
    @FindBy(xpath = "//h3[@class='header-title']")
    private WebElement configurare;

    @FindBy(xpath = "//a[@class='btn btn-link btn-toggle align-items-center collapsed active']")
    private WebElement venituri;
    @FindBy(xpath = "//a[normalize-space()='Facturi vanzari']")
    private WebElement facturiVanzari;
    @FindBy(xpath = "<parameter name=\"facturiVanzari\" value=\"facturiVanzari\"/>")
    private WebElement adaugaFacturiVanzari;
    @FindBy(xpath = "//a[contains(text(),'Clienți')]")
    private WebElement clienti;


    @FindBy(xpath = "//span[@id='select2-select-select-customerId-container']")
    private WebElement alegeClient;
    @FindBy(xpath = "//span[@id='select2-select-select-invoiceType-container']")
    private WebElement alegeTip;
    @FindBy(xpath = "//span[@id='select2-select-select-seriesId-container']")
    private WebElement serieFactura;
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement numarFactura;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDataarticle_type_id-container']")
    private WebElement tipArticol;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDataarticle_id-container']")
    private WebElement denumireArticol;

    @FindBy(xpath = "//input[@id='input-articleFormData.quantity']")
    private WebElement cantitate;
    @FindBy(xpath = "//input[@id='input-articleFormData.selling_price']")
    private WebElement pretUnitar;
    @FindBy(xpath = "//input[@id='article-form-data-total-selling-price']")
    private WebElement total;
    @FindBy(xpath = "//span[contains(text(),'Adaugă articol')]")
    private WebElement adaugaArticol;
    @FindBy(xpath = "//button[contains(text(),'Salvează și vezi')]")
    private WebElement salveazaSiVezi;


    @FindBy(xpath = "//a[contains(text(),'Încasări și plăți')]")
    private WebElement incasariSiPlati;
    @FindBy(xpath = "//a[@href='https://ps.contapp.ro/incasari'][contains(text(),'Încasări')]")
    private WebElement incasari;
    @FindBy(xpath = "//a[@href='https://ps.contapp.ro/incasare/creaza']")
    private WebElement adaugaIncasare;
    @FindBy(xpath = "//span[@id='select2-select-transaction-customer-id-income-1---container']")
    private WebElement client;
    @FindBy(xpath = "//label[@for='input-selectedInvoices.50833.selected']")
    private WebElement incasatIntegral;
    @FindBy(xpath = "//input[@id='input-description']")
    private WebElement explicatie;
    @FindBy(xpath = "//button[contains(text(),'Adaugă încasare')]")
    private WebElement adaugaIncasareNoua;
    @FindBy(xpath = " <parameter name=\"adaugaIncasareNoua\" value=\"adaugaIncasareNoua\"/>")
    private WebElement deschide;

    public void addText(WebElement emailField, String email) {
    }

    public void addPassword(String password) {
        addText(passwordField, password);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox);
    }

    public void click(WebElement rememberMeCheckbox) {
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickAuthenticationButton() {
        click(authenticationButton);
        Assert.assertEquals(driver_local.getCurrentUrl(), "https://account.contapp.ro/login");
    }

    public void clickCreateAccountButton() {
        click(createAccountButton);
        Assert.assertEquals(driver_local.getCurrentUrl(), "https://account.contapp.ro/register",
                "The url page  is not the expected one.");
    }

    public void clickcontAppPs() {
        click(contAppPs);
    }

    public void clickconfigurare() {
        click(configurare);
    }

    public void clickvenituri() {
        click(venituri);
    }

    public void clickfacturiVanzari() {
        click(facturiVanzari);
    }

    public void clickadaugaFacturiVanzari() {
        click(adaugaFacturiVanzari);
    }

    public void clickClienti() {
        click(clienti);
    }


    public void alegeClient() {
        click(alegeClient);
    }

    public void alegeTip() {
        click(alegeTip);
    }

    public void serieFactura() {
        click(serieFactura);
    }

    public void numarFactura() {
        click(numarFactura);
    }

    public void tipArticol() {
        click(tipArticol);
    }

    public void denumireArticol() {
        click(denumireArticol);
    }


    public void cantitate() {
        click(cantitate);
    }

    public void pretUnitar() {
        click(pretUnitar);
    }

    public void total() {
        click(total);
    }

    public void adaugaArticol() {
        click(adaugaArticol);
    }

    public void verifyAlertMessages() {
        if (emailAlertMessage.getText().equals(expectedAlertMessages[0]) &&
                passwordAlertMessage.getText().equals(expectedAlertMessages[0])) ; }

    public String[] expectedAlertMessages = {"adauga articol"};

    public void salveazaSiVezi() {
        click(salveazaSiVezi);
    }

    public void incasariSiPlati() {
        click(incasariSiPlati);
    }

    public void Incasari() {
        click(incasari);
    }

    public void adaugaIncasare() {
        click(adaugaIncasare);
    }

    public void addClient() {
        click(client);
    }

    public void valoareIncasata() {
        click(incasatIntegral);
    }

    public void explicatie() {
        click(explicatie);
    }

    public void AdaugaIncasareNoua() {
        click(adaugaIncasareNoua);
    }

    public void deschide() {
        click(deschide);
    }
}
