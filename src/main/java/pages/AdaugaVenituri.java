package pages;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class AdaugaVenituri extends BaseTest {

    @FindBy(xpath = "/html/body/main/div/div/div/div[2]/div/div/div/div[1]/form/div[5]/button")
    private WebElement authenticationButtonLink;

    @FindBy(xpath = "//a[normalize-space()='Creeaza un cont!']")
    private WebElement createAccountButtonLink;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;


    @FindBy(xpath = "//label[@for='remember-me']")
    private WebElement rememberMeCheckbox;
    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement inchideCookie;
    @FindBy(xpath = "'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement closeCookieButton;
    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement loginButton;
    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement authenticationButton;
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPs;
    @FindBy(xpath = "//h3[@class='header-title']")
    private WebElement configurare;
    @FindBy(xpath = "//h3[@class='header-title']")
    private WebElement venituri;
    @FindBy(xpath = "//div[normalize-space()='Articole venituri']")
    private WebElement articoleVenituri;
    @FindBy(xpath = "//span[@class='d-none d-sm-inline-block']")
    private WebElement adaugaArticolNou;
    @FindBy(xpath = "//textarea[@id='textarea-name']")
    private WebElement denumireArticol;
    @FindBy(xpath = "//span[@id='select2-select-select-currency-container']")
    private WebElement valuta;
    @FindBy(xpath = "//input[@id='input-sellingPrice']")
    private WebElement pretVanzare;

    @FindBy(xpath = "//span[@id='select2-select-select-articleTypeId-container']")
    private WebElement tipArticol;

    @FindBy(xpath = "//span[@id='select2-select-select-categoryId-container']")
    private WebElement categorieFiscala;

    @FindBy(xpath = "//span[@id='select2-select-select-measurementUnitId-container']")
    private WebElement unitateDeMasura;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement salveaza;




    public void addText(WebElement emailField, String email) {
        addText(emailField, email);
    }


    public void addPassword(String password) {
        addText(passwordField, password);
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

    private void clickCreateAccountButtonLink(String s) {
        clickCreateAccountButtonLink(PageLinksAndText.clickCreateAccountButtonLink.getValue());
    }


    private void clickAuthenticationButtonLink(String s) {
        PageLinksAndText.clickAuthenticationButtonLink.getValue();

    }

    public void clickVenituri() {
        click(venituri);
    }

    public void clickContAppPs() {
        click(contAppPs);
    }

    public void clickArticoleVenituri() {
        click(articoleVenituri);
    }

    public void clickAdaugaArticolNou() {
        click(adaugaArticolNou);
    }

    public void addDenumireArticol() {
        click(denumireArticol);
    }

    public void clickValuta() {
        click(valuta);
    }

    public void clickPretVanzare() {
        click(pretVanzare);
    }

    public void clickTipArticol() {
        click(tipArticol);
    }

    public void clickCategorieFiscala() {
        click(categorieFiscala);
    }

    public void clickUnitateDeMasura() {
        click(unitateDeMasura);
    }

    public void clickSalveaza() {
        click(salveaza);
    }
}
