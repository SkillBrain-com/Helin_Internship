package pages.AddNewCompanyAndPayment;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AddNewSupplier extends BaseTest {
    @FindBy(xpath="(//input[contains(@placeholder,'Caută după CUI/CIF')])[1]")
    private WebElement fieldCUI;

    @FindBy(xpath = "(//input[@id='input-tradeRegistrationNumber'])[1]")
    private WebElement fieldNrRegCom;

    @FindBy(xpath= "(//span[@id='select2-select-create-customer-org-type-select-container'])[1]")
    private WebElement fieldEntityType;

    @FindBy(xpath= "(//input[@aria-label='Search'])[1]")
    private WebElement fieldAddText;

    @FindBy(xpath="(//span[@class='select2-results'])[1]")
    private WebElement dropDownList;

    @FindBy(xpath="//ul[@class='select2-results__options']//li[1]")
    private WebElement valueFirstElement;

    @FindBy(xpath="(//input[@id='input-name'])[1]")
    private WebElement fieldSupplierName;

    @FindBy(xpath="(//input[@id='input-iban'])[1]")
    private WebElement fieldIban;

    @FindBy(xpath="(//input[@id='input-bankName'])[1]")
    private WebElement fieldBank;

    @FindBy(xpath="(//span[@id='select2-select-create-customer-country-select-container'])[1]")
    private WebElement fieldCountry;

    @FindBy(xpath="(//span[@id='select2-select-create-customer-county-select-container'])[1]")
    private WebElement fieldCounty;
    @FindBy(xpath="(//input[@aria-label='Search'])[1]")
    private WebElement fieldAddCounty;

    @FindBy(xpath="(//input[@id='input-city'])[1]")
    private WebElement fieldCity;

    @FindBy(xpath="(//input[@id='input-address'])[1]")
    private WebElement fieldAdress;

    @FindBy(xpath="(//input[@id='input-contactName'])[1]")
    private WebElement fieldContactPerson;

    @FindBy(xpath="(//input[@id='input-email'])[1]")
    private WebElement fieldEmail;

    @FindBy(xpath="(//input[@id='input-phone'])[1]")
    private WebElement fieldPhone;
    @FindBy(xpath="(//input[@id='input-website'])[1]")
    private WebElement fieldWebSite;
    @FindBy(xpath="(//button[@class='btn btn-sm btn-primary'][contains(text(),'Salvează')])[1]")
    private WebElement buttonSave;

    @FindBy(xpath="(//button[@type='button'][normalize-space()='Închide'])[2]")
    private WebElement buttonClose;

    @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    private WebElement buttonAccept;

    @FindBy(xpath="(//label[contains(text(),'Iban trebuie să fie un număr de cont bancar intern')])[1]")
    private WebElement labelIban;
    public void addCUI(String text) {
        addText(text,fieldCUI);
    }
    public void addNrRegCom(String text) {
        addText(text, fieldNrRegCom);
    }

    public void addSupplierName(String text) {
        addText(text,fieldSupplierName);
    }

    public void clickFieldSupllierType(String text) {
        click(fieldEntityType);
        List<WebElement> lista = driver_local.findElements(By.xpath("(//span[@class='select2-results'])[1]"));
        String temp = lista.get(0).getText();
        String[] arrOfStr = temp.split("\n");
        int i = 1;
        for (String a : arrOfStr) {
            if (a.equals(text)) {
                addText(a,fieldAddText);
                valueFirstElement.click();
                break;
            }
            i++;
        }
    }

    public void addIban(String text){
        addText(text,fieldIban);
    }
    public void addBank(String text){
        addText(text,fieldBank);
    }
    public void addFieldCounty(String text) {
        click(fieldCounty);
        addText(text,fieldAddCounty);
        click(valueFirstElement);
    }
    public void addCity(String text){
        addText(text,fieldCity);
    }
    public void addAdress(String text){
        addText(text,fieldAdress);
    }
    public void addContactPerson(String text){
        addText(text,fieldContactPerson);
    }
    public void addEmail(String text){
        addText(text,fieldEmail);
    }
    public void addPhone(String text){
        addText(text,fieldPhone);
    }
    public void addWebSite(String text){
        addText(text,fieldWebSite);
    }
    public void clickButtonSave(){
        click(buttonSave);
    }
    public void clickButtonClose(){
        click(buttonClose);
    }
    public void clickButtonAccept(){
        click(buttonAccept);
    }
    public String getMessageLabelIban(){
        return getText(labelIban);
    }
}
