package pages;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class CreateAccountPage extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;
    @FindBy(xpath = "//a[normalize-space()='Creeaza un cont!']")
    private WebElement createacount;
    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement firstemail;
    @FindBy(xpath = "//span[contains(text(),'Continuă')]")
    private WebElement butoncontinua;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement prenume;
    @FindBy(xpath = "//input[@placeholder='Nume']")
    private WebElement nume;
    @FindBy(xpath = "//input[@placeholder='Parola']")
    private WebElement parola;
    @FindBy(xpath = "//input[@placeholder='Confirmă parola']")
    private WebElement confirmaparola;
    @FindBy(xpath = "//div[@class='row']//div[5]//input")
    private WebElement termenisiconditii;

    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement inchideCookie;

    @FindBy(xpath = "//span[normalize-space()='Trimite']")
    private WebElement trimite;

    @FindBy(xpath = "//a[normalize-space()='Creeaza un cont!']")
    public WebElement createAccountButton;

    public void firstemail(String email) {
        addText(email, this.email);
    }

    public void clickContinue() {
        click(butoncontinua);
    }

    public boolean verifyemail(String firstemail) {
        return firstemail.contains(getText(email)) ? true : false;
    }

    public void addfirstname(String prenume) {
        addText(prenume, this.prenume);
    }

    public void addlastname(String nume) {
        addText(nume, this.nume);
    }
    public void clickCloseCookie() {
        click(inchideCookie);}

    public void addpassword(String parola) {
        addText(parola, this.parola);
    }

    public void confirmpassword(String confirmaparola) {
        addText(confirmaparola, this.confirmaparola);
    }

    public void clickTermsandConditions() {
        click(termenisiconditii);
    }

    public void send() {
        click(trimite);
    }

    public void clickAutentification() {
        click(authenticationButton);

    }

    public void clickCreateAccountButton() {
        click(createAccountButton);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.clickCreateAccountButtonLink.getValue(),
                PageLinksAndText.clickCreateAccountButtonText.getValue());
    }
}