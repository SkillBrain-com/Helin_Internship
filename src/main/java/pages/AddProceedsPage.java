package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.SimpleTimeZone;

public class AddProceedsPage extends BaseTest {
    @FindBy(xpath = "//span[contains(@title,'Bancă principală')]")
    private WebElement bankHome;

    @FindBy(css = ".select2-selection__rendered[title$='Sediul profesional']")
    private WebElement activityPlace;

    @FindBy(xpath = "//body/main[contains(@sibling,'sidebar-toggle')]/div/div/div/div/div/div/div/div/div/div/div[4]/div[1]/div[1]/span[1]/span[1]/span[1]")
    private WebElement caenCode;

    @FindBy(xpath = "body > main:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1) > span:nth-child(1)")
    private WebElement documents;

    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement numberOfTheDocument;

    @FindBy(xpath = "//input[@id='transaction-date-income--']")
    private WebElement dateOfCashing;

    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement cashingInRon;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]")
    private WebElement typeOfAcquisition;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]")
    private WebElement explication;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]")
    private WebElement fiscalCategory;

    @FindBy(xpath = "//input[@id='checkbox-saveArticle']")
    private WebElement saveTheCashing;

    @FindBy(xpath = "(//button[contains(text(),'Adaugă încasare')])[1]")
    private WebElement addTheAcquisition;

    @FindBy(xpath = "//div[@class='toast toast-warning']")
    private WebElement imputErrorPopup;

    private WebDriverWait waitPage(){
        return  new WebDriverWait(driver,15);
    }

    public WebElement droplistIndex(int index, String selector){
        List<WebElement> elements = driver_local.findElements(By.cssSelector(selector));
        WebElement element = elements.get(index);
        return element;
    }

    public WebElement byWordDropList(String selector, String text){
        List<WebElement> fields = driver_local.findElements(By.cssSelector(selector));
        WebElement fieldName = driver_local.findElement(By.xpath("//*[text()='" + text + "']"));
        return fieldName;

    }

    public void clickBankHome(){
        click(bankHome);
    }

    public void clickActivityPlace(){
        click(activityPlace);
    }

    public void clickCaenCode(){
        click(caenCode);
    }

    public void clickDocuments(){
        click(documents);
    }

    public void clickTypeOfAcquisition(){
        click(typeOfAcquisition);
    }

    public void clickFiscalCategory(){
        click(fiscalCategory);
    }
    public void addNumberOfDocuments(String nrDoc){
        addText(nrDoc, numberOfTheDocument);
    }

    public void price(String priceRon){
        addText(priceRon, cashingInRon);
    }

    public void addExplication(String exp){
        addText(exp, explication);
    }

    public void clickSaveRegistration(){
        click(saveTheCashing);
    }

    public void clickSaveButton(){
        click(addTheAcquisition);
    }

    public void clickImputValue(){
        click(cashingInRon);
    }


    public void checks(Integer value){
        cashingInRon.sendKeys(value.toString());
        click(documents);
        if (value > 5000){
            waitPage().until(ExpectedConditions.visibilityOf(imputErrorPopup));
            System.out.println("The error popup appeared");
        } else {
            System.out.println("Test has failed");
        }
    }


}
