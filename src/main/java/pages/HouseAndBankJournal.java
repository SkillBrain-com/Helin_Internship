package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HouseAndBankJournal extends BaseTest {
    @FindBy(xpath="//a[contains(text(),'Jurnal de Casă/Bancă')]")
    private WebElement houseAndBankJournal;
    @FindBy(css ="button[onclick=\"showModal('add-income-transaction')\"]")
    private WebElement addIncome;
    @FindBy(xpath ="(//div[@class='card-body']//span[contains(@role,'presentation')])[2]")
    private WebElement openAddNewClient;
    @FindBy(xpath = "//span[normalize-space()='Client nou']")
    private WebElement selectClient;
    @FindBy(xpath = "(//div[@class='card-body']//span[contains(@role,'presentation')])[3]")
    private WebElement openHouseAndBanks;
    @FindBy(xpath = "//span[contains(text(),'Casă principală')]")
    private WebElement selectHouseAndBanks;
    @FindBy(xpath = "(//div[@class='card-body']//span[contains(@role,'presentation')])[4]")
    private WebElement openActivityLocation;
    @FindBy(xpath = "//span[contains(text(),'Activitate desfășurată la terți')]")
    private WebElement selectActivityLocation;
    @FindBy(xpath = "(//div[@class='card-body']//span[contains(@role,'presentation')])[5]")
    private WebElement openCaenCode;
    @FindBy(xpath = "//span[contains(text(),'Activitate nouă')]")
    private WebElement addNewCaen;
    @FindBy(xpath = "//div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]")
    private WebElement openCaenActivityLocation;
    @FindBy(xpath = "//span[normalize-space()='Sediul profesional']")
    private WebElement selectCaenActivityLocation;
    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]")
    private WebElement openCaenCategory;
    @FindBy(xpath = "//span[contains(text(),'Activități agricole - sistem real')]")
    private WebElement selectCaenCategory;
    @FindBy(xpath = "//input[@id='activity-form-input-documentNumber-']")
    private WebElement caenActivity;
    @FindBy(xpath = "//input[@id='activity-form-input-authorizationNumber-']")
    private WebElement caenAuthorisationNum;
    @FindBy(xpath = "//label[@for='activity-from-start-date-']//i[@class='bi bi-calendar']")
    private WebElement openRegisterDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='2']")
    private WebElement selectRegisterDate;
    @FindBy(xpath = "(//label[contains(@for,'activity-from-end-date-')])[1]")
    private WebElement openSuspendDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='17']")
    private WebElement selectSuspendDate;
    @FindBy(xpath = "//div[@id='create-activity-income--']//button[normalize-space()='Salvează']")
    private WebElement saveCaen;
    @FindBy(xpath = "//li//span[contains(text(),'Activitate desfășurată la terți | 551711')]")
    private WebElement selectCaen;
    @FindBy(xpath = "(//span[normalize-space()='Extras Bancar'])[1]")
    private WebElement openIncomeDoc;
    @FindBy(xpath = "//span[normalize-space()='Bon fiscal']")
    private WebElement selectIncomeDoc;
    @FindBy(xpath = "//div[@class='col-lg-2']//input[@id='input-number']")
    private WebElement documentNum;
    @FindBy(xpath = "//label[contains(@for,'transaction-date-income--')]//i[contains(@class,'bi bi-calendar')]")
    private WebElement openDocDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='20']")
    private WebElement selectDocDate;
    @FindBy(xpath = "//div[@class='col-sm-6 col-lg-3']//input[@id='input-total']")
    private WebElement totalIncome;
    @FindBy(xpath = "//span[@id='select2-select-company-article-types-list-id-income---container']")
    private WebElement openItemType;
    @FindBy(xpath = "//span[normalize-space()='Aporturi']")
    private WebElement selectItemType;
    @FindBy(xpath = "//span[@id='select2-select-company-articles-list-id-income---container']")
    private WebElement openExplication;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement typeExplication;
    @FindBy(xpath = "//span[@id='select2-select-company-categories-list-id-income---container']")
    private WebElement openFiscalCategory;
    @FindBy(xpath = "//span[normalize-space()='Alte venituri neimpozabile']")
    private WebElement selectFiscalCategory;
    @FindBy(xpath = "//input[@id='checkbox-saveArticle']")
    private WebElement saveArticleCheckBox;
    @FindBy(xpath = "//button[contains(text(),'Adaugă încasare')]")
    private WebElement saveArticle;
    @FindBy(xpath = "//span[@id='select2-select-create-customer-lifespan-select-container']")
    private WebElement openDue;
    @FindBy(xpath = "//span[normalize-space()='30']")
    private WebElement selectDue;
    @FindBy(xpath = "(//b[@role='presentation'])[13]")
    private WebElement supplierCountry;
    @FindBy(xpath = "//span[normalize-space()='Arges']")
    private WebElement supplierCountySelect;
    @FindBy(xpath = "(//b[@role='presentation'])[14]")
    private WebElement supplierCounty;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[15]")
    private WebElement supplierCurrency;
    @FindBy(xpath = "//span[normalize-space()='Q TEST SA']")
    private WebElement selectCreatedClient;


    public void addIncome(){
        click(houseAndBankJournal);
        click(addIncome);
    }
    public void selectClient(){
        click(openAddNewClient);
        click(selectClient);
    }
    public void setSelectHouseAndBanks(){
        click(openHouseAndBanks);
        click(selectHouseAndBanks);
    }
    public void setActivityLocation(){
        click(openActivityLocation);
        click(selectActivityLocation);
    }
    public void setAddNewCaen(){
        click(openCaenCode);
        click(addNewCaen);
        click(openCaenActivityLocation);
        click(selectCaenActivityLocation);
        click(openCaenCategory);
        click(selectCaenCategory);

    }
    public void addCaenActivity(String caenActivity, String caenAuthorisationNum){
        addText(caenActivity,this.caenActivity);
        addText(caenAuthorisationNum,this.caenAuthorisationNum);

    }
    public void setCaenDate(){
        click(openRegisterDate);
        click(selectRegisterDate);
        click(openSuspendDate);
        click(selectSuspendDate);
    }
    public void saveNewCaen(){
        click(saveCaen);
    }
    public void selectCaen(){
        click(openCaenCode);
        click(selectCaen);
    }
    public void setIncomeDoc(){
        click(openIncomeDoc);
        click(selectIncomeDoc);
    }
    public void addDocNumAndDate(String documentNum){
        addText(documentNum,this.documentNum);
        click(openDocDate);
        click(selectDocDate);
    }
    public void addTotalIncome(String totalIncome){
        addText(totalIncome,this.totalIncome);
    }
    public void setItemType(){
        click(openItemType);
        click(selectItemType);
    }
    public void addExplication(String explication){
        click(openExplication);
        addText(explication,typeExplication);
    }
    public void setFiscalCategory(){
        click(openFiscalCategory);
        click(selectFiscalCategory);
    }
    public void saveArticle(){
        click(saveArticleCheckBox);
        click(saveArticle);
    }
    public void selectSupplierCountry(){
        click(supplierCountry);
    }

    public void selectSupplierCounty(){
        click(supplierCounty);
        click(supplierCountySelect);
    }
    public void selectSupplierCurrency() {
        click(supplierCurrency);
    }
    public void selectCreatedClient(){
        click(openAddNewClient);
        click(selectCreatedClient);
    }
}
