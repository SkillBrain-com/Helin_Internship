package pages.AddNewCompanyAndPayment;

import base.BaseTest;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class AddNewActivity extends BaseTest {

    @FindBy(xpath="(//span[contains(@role,'combobox')])[5]")
    private WebElement fieldActivityPlace;

    @FindBy(xpath="(//input[@aria-label='Search'])[1]")
    private WebElement fieldAddActivityPlace;

    @FindBy(xpath="//span[@class='select2-results']//ul[1]//li[3]")
    private WebElement valueActivityPlace;

    @FindBy(xpath=" //span[@id='select2-select-transaction-activity-id-expense---container']")
    private WebElement fieldCodCaen;

    @FindBy(xpath="(//span[@role='combobox'])[5]")
    private WebElement fieldAddCodCaen;

    @FindBy(xpath="(//ul[@role='listbox'])[1]//li[2]")
    private WebElement buttonAddNewActivity;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[11]")
    private WebElement fieldCategoryIncome;

    @FindBy(xpath="//span[@class='select2-results']//ul[1]//li[9]")
    private WebElement valueCategoryIncome;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]")
    private WebElement fieldSourceIncome;

    @FindBy(xpath="//span[@class='select2-results']//ul[1]//li[2]")
    private WebElement valueSourceIncome;

    @FindBy(xpath="(//input[@id='activity-form-input-authorizationNumber-'])[1]")
    private WebElement fieldAuthorisationNbr;

    @FindBy(xpath ="//input[@id='activity-from-start-date-']")
    private WebElement fieldRegistrationDate;

    @FindBy(xpath="(//div[@class='justify-content-start modal-footer'])[3]//button[1]")
    private WebElement buttonSave;

    @FindBy(xpath="(//div[@class='justify-content-start modal-footer'])[3]//button[2]")
    private WebElement buttonClose;

    public void clickFieldActivityPlace(){
        click(fieldActivityPlace);
    }

    public void clickButtonNewActivity(){
        click(buttonAddNewActivity);
    }

    public void clickFieldCategoryIncome(){
        click(fieldCategoryIncome);
    }

    public void clickValueCategoryIncome(){
        click(valueCategoryIncome);
    }

    public void clickFieldSourceIncome(){
        click(fieldSourceIncome);
    }

    public void clickValueSourceIncome(){
        click(valueSourceIncome);
    }

    public void addAuthorisationNbr(String text){
        addText(text, fieldAuthorisationNbr);
    }

    public void addRegistrationDate(String text)
    {
        addText(text, fieldRegistrationDate);
    }
    public void clickButtonSave(){

        click(buttonSave);
    }

    public void clickButtonClose(){

        click(buttonClose);
    }

    public String getTextFieldCodCaen(){
      return getText(fieldCodCaen);
    }

}
