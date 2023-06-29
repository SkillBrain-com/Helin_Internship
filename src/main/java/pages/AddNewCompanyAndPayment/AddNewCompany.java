package pages.AddNewCompanyAndPayment;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AddNewCompany extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement linkContAppPS;

    @FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
    private WebElement iconSettings;

    @FindBy(xpath = "//a[contains(text(),'Firmă nouă')]")
    private WebElement linkNewCompany;

    @FindBy(xpath = "//input[@placeholder='Caută după CUI/CIF']")
    private WebElement fieldCUI;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement fieldNrRegCom;

    @FindBy(xpath= "(//span[@title='---'][normalize-space()='---'])[1]")
    private WebElement fieldEntityType;

    @FindBy(xpath= "//input[@class='select2-search__field']")
    private WebElement fieldAddText;

    @FindBy(xpath="(//span[@dir='ltr'])[2]")
    private WebElement dropDownList;

    @FindBy(xpath="//ul[@class='select2-results__options']//li[1]")
    private WebElement valueFirstElement;

    @FindBy(xpath="//div[2][@class = 'row']//div[1]//input[1]")
    private WebElement fieldCompanyName;

    @FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement fieldData;

    @FindBy(xpath="(//span[@role='presentation'])[3]")
    private WebElement fieldCounty;

    @FindBy(xpath="(//input[@aria-label='Search'])[1]")
    private WebElement fieldAddCounty;

    @FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted'])[1]")
    private WebElement valueFirstElementCty;

    @FindBy(xpath="(//input[@id='input-city'])[1]")
    private WebElement fieldCity;

    @FindBy(xpath = "//main[contains(@sibling,'sidebar-toggle')]//div[4]//div[1]//div[1]//input[1]")
    private WebElement fieldAdress;

    @FindBy(xpath="(//div[contains(@class,'input-group')])[7]//input[1]")
    private WebElement fieldContactPerson;

    @FindBy(xpath="(//div[contains(@class,'input-group')])[8]//input[1]")
    private WebElement fieldWebSite;
    @FindBy(xpath="(//div[contains(@class,'input-group')])[9]//input[1]")
    private WebElement fieldEmail;

    @FindBy(xpath="(//div[contains(@class,'input-group')])[10]//input[1]")
    private WebElement fieldPhone;
    @FindBy(xpath="(//button[contains(text(),'Salvează')])[1]")
    private WebElement buttonSave;

    public void clickLinkContAppPS(){
        click(linkContAppPS);
    }
    public void clickIconSettings(){
        click(iconSettings);
    }
    public void clickLinkNewCompany(){
        click(linkNewCompany);
    }
    public void addCUI(String text) {
        addText(text,fieldCUI);
    }
    public void addNrRegCom(String text) {
        addText(text,fieldNrRegCom);
    }
    public void addEntityType(String text) {
        addText(text,fieldEntityType);
    }
    public void addCompanyName(String text) {
        addText(text,fieldCompanyName);
    }
    public void addDataCalendar(String text) {
        addText(text,fieldData);
    }
    public void addCity(String text) {
        addText(text,fieldCity);
    }
    public void addAdress(String text) {
        addText(text,fieldAdress);
    }
    public void addContactPerson(String text){
       addText(text, fieldContactPerson);
    }
    public void addWebSite(String text){
        addText(text, fieldWebSite);
    }
    public void addEmail(String text){
        addText(text,fieldEmail);
    }
    public void addPhone(String text){
        addText(text,fieldPhone);
    }
    public void clickButtonSave(){
        click(buttonSave);
    }

    public void clickFieldEntityType(String text) {
        click(fieldEntityType);
        List<WebElement> lista = driver_local.findElements(By.xpath("(//span[@class='select2-dropdown select2-dropdown--below'])[1]"));
        String temp = lista.get(0).getText();
        String[] arrOfStr = temp.split("\n");
        int i = 1;
        for (String a : arrOfStr) {
           if (a.equals(text)) {
                addText(a,fieldAddCounty);
                valueFirstElementCty.click();
                break;
            }
            i++;
        }
    }

    public void clickFieldCounty(String text){
        click(fieldCounty);
        List<WebElement> lista = driver_local.findElements(By.xpath("(//ul[contains(@role,'listbox')])[1]"));
        String temp = lista.get(0).getText();
        String[] arrOfStr = temp.split("\n");
        int i = 1;
        for (String a : arrOfStr) {
            if (a.equalsIgnoreCase(text)) {
                addText(a,fieldAddText);
                valueFirstElement.click();
                break;
            }
            i++;
        }
    }
}
