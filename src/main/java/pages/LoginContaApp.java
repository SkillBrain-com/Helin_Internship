package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginContaApp extends BaseTest {

    @FindBy(xpath = "//input[@placeholder='E-mail']")
    private WebElement addEmailAdress;

    @FindBy(xpath = "//input[@placeholder='Parola']")
    private WebElement addPassword;

    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement autentificationButton;

    public void loginContaAccount(String email, String password){
        addText(email, addEmailAdress);
        addText(password, addPassword);
        click(autentificationButton);
    }














}
