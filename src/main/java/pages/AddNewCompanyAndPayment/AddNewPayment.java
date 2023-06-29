package pages.AddNewCompanyAndPayment;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddNewPayment extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement linkContAppPS;
    @FindBy(xpath="(//a[contains(text(),'Încasări și plăți')])[1]")
    private WebElement linkIncomePay;
    @FindBy(xpath="(//a[contains(text(),'Plăți')])[1]")
    private WebElement linkPay;
    @FindBy(xpath = "(//a[@class='btn btn-light'])[1]")
    private WebElement buttonAddPay;
    @FindBy(xpath = "(//button[normalize-space()='Plati furnizori'])[1]")
    private WebElement buttonSupplierPay;
    @FindBy(xpath = "(//button[normalize-space()='Plati diverse'])[1]")
    private WebElement buttonOtherPay;
    @FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//span[1]//span[1]//span[1]")
    private WebElement fieldSupplier;
    @FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
    private WebElement buttonAddSupplier;
    @FindBy(xpath="//input[@class='select2-search__field']")
    private WebElement fieldFindSupplier;
    @FindBy(xpath="//span[@class='select2-results']//ul[1]//li[3]")
    private WebElement valueSupplier;
    @FindBy(xpath="(//span[@class='select2-dropdown select2-dropdown--below'])[1]")
    private WebElement dropDownSupplier;
    @FindBy(xpath="//input[@id='input-number']")
    private WebElement fieldInputNbr;
    @FindBy(xpath="//input[@id='input-total']")
    private WebElement fieldInputTotal;
    @FindBy(xpath=" //div[@class='hstack gap-3 gap-lg-4']//button[1]")
    private WebElement buttonSavePay;
    @FindBy(xpath="//div[@class='col-lg-6']//span[@class='select2-selection select2-selection--single']")
    private WebElement fieldExplanation;
    @FindBy(xpath="//div[@class='col-lg-6']//input[@aria-label='Search']")
    private WebElement fieldAddExplanation;

    public void clickLinkContAppPS(){
        click(linkContAppPS);
    }
    public void clickLinkIncomePay(){
        click(linkIncomePay);
    }
    public void clickLinkPay() {
        click(linkPay);
    }
    public void clickButtonAddPay() {
        click(buttonAddPay);
    }
    public void clickButtonSupplierPay() {

        click(buttonSupplierPay);
    }
    public void clickButtonOtherPay() {
        click(buttonOtherPay);
    }
    public void clickFieldSupplier(){
        click(fieldSupplier);
    }
    public void clickButtonAddSupplier(){
        click(buttonAddSupplier);
    }
    public void addFieldSupplier(String text) {
        click(fieldFindSupplier);
        addText(text,fieldFindSupplier);
        click(valueSupplier);
    }
    public boolean checkSupplier(String text){
        click(fieldSupplier);
        List<WebElement> lista = driver_local.findElements(By.xpath("(//span[@class='select2-dropdown select2-dropdown--below'])[1]"));
        String temp = lista.get(0).getText();
        if(temp.contains(text)) {
            click(fieldFindSupplier);
            click(valueSupplier);
            return true;
        }
        else
            return false;
    }
    public void addFieldInputNbr(String text){
        addText(text, fieldInputNbr);
    }
    public void addFieldInputTotal(String text){
        addText(text, fieldInputTotal);
        fieldInputTotal.click();
    }
    public void clickSavePay(){
        //scrollToViewElement(buttonSavePay);
        movetoElement();
        click(buttonSavePay);
    }
    public void clickFieldExplanation(){
        click(fieldExplanation);
    }
    public void addExplanation(String text){
        movetoElement();
        //scrollToViewElement(buttonSavePay);
        click(fieldExplanation);
        addText(text, fieldAddExplanation);
        click(fieldAddExplanation);
    }
    public void scroll(){
        //scrolltoElement();
        movetoElement();
    }
}
