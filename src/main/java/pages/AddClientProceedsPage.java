package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class AddClientProceedsPage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPSButton;

    @FindBy(xpath = "//a[@href='https://ps.contapp.ro/incasare/creaza']")
    private WebElement addProceedsButton;

    @FindBy(xpath = "//button[normalize-space()='Incasari clienti']")
    private WebElement clientProceeds;

    @FindBy(xpath = "//button[normalize-space()='Incasari diverse']")
    private WebElement otherProceeds;

    @FindBy(xpath = "(//div[contains(@class,'select2-parent')])[2]")
    private WebElement clientDroplistButton;

    @FindBy(xpath = "(//li[contains(@role,'option')])[2]")
    private WebElement newClientButton;

    @FindBy(xpath = "//input[@placeholder='Caută după CUI/CIF']")
    private WebElement cuiOrCifField;

    @FindBy(xpath = "//input[@id='input-tradeRegistrationNumber']")
    private WebElement registerNumberField;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[10]")
    private WebElement entityTypeDroplistButton;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement nameField;

    @FindBy(xpath = "(//span[@role='combobox'])[11]")
    private WebElement deadlineDroplistButton;

    @FindBy(xpath = "//input[@id='input-iban']")
    private WebElement ibanField;

    @FindBy(xpath = "//input[@id='input-bankName']")
    private WebElement bankNameField;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[12]")
    private WebElement countryDroplistButton;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[13]")
    private WebElement countyDroplistButton;

    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@id='input-address']")
    private WebElement adressField;

    @FindBy(xpath = "(//span[@role='combobox'])[14]")
    private WebElement currencyButton;

    @FindBy(xpath = "//input[@id='input-contactName']")
    private WebElement contactPersonField;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement contactPersonEmailField;

    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement contactPersonPhoneField;

    @FindBy(xpath = "//input[@id='input-website']")
    private WebElement contactPersonWebsiteField;

    @FindBy(xpath = "//button[contains(@class,'btn btn-sm btn-primary')][contains(text(),'Salvează')]")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Închide'])[2]")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[@class='otFlat bottom ot-wo-title vertical-align-content']")
    private WebElement cookiesAdd;

    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement closeCoockiesAddButton;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    private WebElement confirmationPopup;

    @FindBy(xpath = "//div[@class='card   ']")
    private WebElement paymentCard;

    @FindBy(xpath = "//div[@class='col-12 text-center']//a")
    private WebElement paymentButton;

    private WebDriverWait waitPage(){
        return  new WebDriverWait(driver,15);
    }

    public void closeCoockiesAdd(){
        find(cookiesAdd);
        click(closeCoockiesAddButton);
    }

    public void clickContAppPSButton(){
        click(contAppPSButton);
    }

    public void succesConfirmationPopup(){
        waitPage().until(ExpectedConditions.visibilityOf(confirmationPopup));
    }

    public void clickAddProceedsButton(){
        click(addProceedsButton);
    }
    public void clickClientDroplist(){
        click(clientDroplistButton);
    }
    public WebElement clientDropDownList(int index, String selector){
        List<WebElement> clients = driver_local.findElements(By.cssSelector(selector));
        WebElement firstClient = clients.get(index);
        return firstClient;
    }

    public WebElement byWordDropList(String selector, String text){
        waitPage();
        List<WebElement> fields = driver_local.findElements(By.cssSelector(selector));
        WebElement fieldName = driver_local.findElement(By.xpath("//*[text()='" + text + "']"));
        return fieldName;

    }

    public WebElement byWOrdDropList(String selector, String text){
        waitPage();
        listofElements(driver_local.findElements(By.cssSelector(selector)), text);
        WebElement fieldName = driver_local.findElement(By.xpath("//*[text()='" + text + "']"));
        return fieldName;
    }

    public void clickNewClient(){
        click(newClientButton);
    }

    public void addCuiOrCIF(String cuiOrCif){
        addText(cuiOrCif, cuiOrCifField);
    }

    public void addRegisterNumber(String registerNumber){
        addText(registerNumber, registerNumberField);
    }


    public void clickEntityTypeDroplistButton(){
        click(entityTypeDroplistButton);
    }

    public void addNameField(String name){
        addText(name, nameField);
    }

    public void clickDeadlineDroplistButton(){
        click(deadlineDroplistButton);
    }

    public void addIbanField(String iban){
        addText(iban, ibanField);
    }

    public void addBankNameField(String bankName){
        addText(bankName, bankNameField);
    }

    public void clickCountryDroplistButton(){
        click(countryDroplistButton);
    }

    public void clickCountyDroplistButton()  {
        click(countyDroplistButton);
        waitPage();
    }

    public void addCityField(String city){
        addText(city, cityField);
    }

    public void addAdressField(String adress){
        addText(adress, adressField);
    }

    public void clickCurrencyButton(){
        click(currencyButton);
    }

    public void addContactPersonField(String personContactName){
        addText(personContactName, contactPersonField);
    }

    public void addContactPersonEmailField(String email){
        addText(email, contactPersonEmailField);
    }

    public void addContactPersonPhoneField(String phone){
        addText(phone, contactPersonPhoneField);
    }

    public void addContactPersonWebsiteField(String website){
        addText(website, contactPersonWebsiteField);
    }

    public void clickSaveButton(){
        click(saveButton);
    }

    public void clickCancelButton(){
        click(cancelButton);
    }

    public void clickClientProceeds(){
        click(clientProceeds);
    }

    public void clickOtherProceeds(){
        click(otherProceeds);
    }

    public void addNewPayment() {
        waitPage().until(ExpectedConditions.visibilityOf(paymentCard));
        click(paymentButton);
    }



}
