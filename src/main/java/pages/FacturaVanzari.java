package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FacturaVanzari extends BasePage {
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

    @FindBy(xpath = "//a[@class='btn btn-link btn-toggle align-items-center collapsed active']")
    private WebElement venituri;
    @FindBy(xpath = "//a[normalize-space()='Facturi vanzari']")
    private WebElement facturiVanzari;
    @FindBy(xpath = "//a[contains(text(),'Clienți')]")
    private WebElement clienti;
    @FindBy(xpath = "//span[@class='d-none d-sm-inline-block']")
    private WebElement adauga;
    @FindBy(xpath = "//h6[contains(text(),'Adaugă factura venituri')]")
    private WebElement adaugaFacturaVanzari;
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
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDatacategory_id-container']")
    private WebElement categorieFiscala;
    @FindBy(xpath = "//input[@id='input-articleFormData.quantity']")
    private WebElement cantitate;
    @FindBy(xpath = "//input[@id='input-articleFormData.selling_price']")
    private WebElement pretUnitar;
    @FindBy(xpath = "//input[@id='article-form-data-total-selling-price']")
    private WebElement total;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary w-100']")
    private WebElement adaugaArticol;


    public String[] expectedAlertMessages = {"Datele de autentificare introduse nu se potrivesc cu baza de date.",
            "Campul \"E-mail\" este obligatoriu.",
            "Campul \"Parola\" este obligatoriu."
    };

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
        Assert.assertEquals(driverLocal.getCurrentUrl(), "https://account.contapp.ro/login");
    }

    public void clickCreateAccountButton() {
        click(createAccountButton);
        Assert.assertEquals(driverLocal.getCurrentUrl(), "https://account.contapp.ro/register",
                "The url page  is not the expected one.");
    }

    public void clickvenituri() {
        click(venituri);
    }

    public void clickfacturiVanzari() {
        clickfacturiVanzari();
    }

    public void clickclienti() {
        clickclienti();
    }

    public void clickadauga() {
        clickadauga();
    }

    public void adaugaFacturaVanzari() {
        adaugaFacturaVanzari();
    }

    public void alegeClient() {
        alegeClient();
    }

    public void alegeTip() {
        alegeTip();
    }

    public void serieFactura() {
        serieFactura();
    }

    public void numarFactura() {
        numarFactura();
    }

    public void tipArticol() {
        tipArticol();
    }

    public void denumireArticol() {
        denumireArticol();
    }

    public void categorieFiscala() {
        categorieFiscala();
    }

    public void cantitate() {
        cantitate();
    }

    public void pretUnitar() {
        pretUnitar();
    }

    public void total() {
        total();
    }

    public void adaugaArticol() {
        adaugaArticol();
    }

    public void verifyAlertMessages() {
        if (emailAlertMessage.getText().equals(expectedAlertMessages[0]) && passwordAlertMessage.getText().equals(expectedAlertMessages[0])) {
            System.out.println(emailAlertMessage.getText());
            System.out.println(passwordAlertMessage.getText());
        } else if (emailAlertMessage.getText().equals(expectedAlertMessages[1])) {
            System.out.println(emailAlertMessage.getText());
        } else if (passwordAlertMessage.getText().equals(expectedAlertMessages[2])) {
            System.out.println(passwordAlertMessage.getText());
        } else {
            System.out.println("The alert messages are not the expected ones.");
        }
    }
}
