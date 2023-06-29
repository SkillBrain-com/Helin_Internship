package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SingleStatement extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;

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
    public WebElement forgotPasswordLink;


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookie;
    @FindBy(xpath = "//a[contains(text(),'Declarația Unică')]")
    private WebElement singleStatementButton;
    @FindBy(css = "[id$=cnp-nif-input]")
    private WebElement inputCNP;

    @FindBy(css = "[id$=name-input]")
    private WebElement inputName;

    @FindBy(css = "[id$=additional-name-input]")
    private WebElement inputAdditionalName;

    @FindBy(css = "[id$=countries-select--container]")
    private WebElement country;
    @FindBy(xpath = "//input[@spellcheck='false']")
    private WebElement searchCountry;
    @FindBy(css = "[id$=headquarter-form-select-county--container]")
    private WebElement county;

    @FindBy(css = "[aria-controls$=headquarter-form-select-county--results]")
    private WebElement searchCounty;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement selectCountyButton;

    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement inputCity;
    @FindBy(css = "[id$=address-input]")
    private WebElement inputAddress;

    @FindBy(css = "[id$=email-input]")
    private WebElement inputEmail;

    @FindBy(css = "[id$=phone-input]")
    private WebElement inputPhoneNumber;

    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Adaugă venit')]")
    private WebElement adaugaVenitButton;

    public void addEmail(String email) {
        addText(email, emailField);
    }

    public void addPassword(String password) {
        addText(password, passwordField);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickAuthenticationButton() {
        click(authenticationButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://account.contapp.ro/login");
    }

    public String[] expectedAlertMessages = {"Datele de autentificare introduse nu se potrivesc cu baza de date.",
            "Campul \"E-mail\" este obligatoriu.",
            "Campul \"Parola\" este obligatoriu."
    };

    public void verifyAlertMessages() {
        if (emailAlertMessage.getText().equals(expectedAlertMessages[1]) && passwordAlertMessage.getText().equals(expectedAlertMessages[2])) {
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


    public void clickAcceptCookie() {
        click(acceptCookie);
    }

    public void clickSingleStatementButton() {
        click(singleStatementButton);
    }


    public void addInputCNP(String inputCNP) {
        addText(inputCNP, this.inputCNP);
    }

    public void addInputName(String inputName) {
        addText(inputName, this.inputName);
    }

    public void addInputAdditionalName(String inputAdditionalName) {
        addText(inputAdditionalName, this.inputAdditionalName);
    }

    public void addCountry() {
        click(country);
    }

    public void addSearchCountry(String searchCountry) {
        addText(searchCountry, this.searchCountry);
    }

    public void addCounty() {
        click(county);
    }


    public void addSearchCounty(String searchCounty) {
        addText(searchCounty, this.searchCounty);
    }

    public void clickSearchCounty() {
        click(selectCountyButton);
    }

    public void addInputCity(String inputCity) {
        addText(inputCity, this.inputCity);
    }

    public void addInputAddress(String inputAddress) {
        addText(inputAddress, this.inputAddress);
    }

    public void addInputEmail(String inputEmail) {
        addText(inputEmail, this.inputEmail);
    }

    public void addInputNumber(String inputPhoneNumber) {
        addText(inputPhoneNumber, this.inputPhoneNumber);
    }

    public void clickSaveButton() {
        click(saveButton);
    }

    public void addAdaugaVenitButton(){
        click(adaugaVenitButton);
    }

}
