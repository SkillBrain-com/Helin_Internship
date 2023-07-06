package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SingleStatementAddIncome extends BaseTest {
    @FindBy(xpath = "//button[@class='btn btn-light btn-xs'][normalize-space()='Deschide']")
    private List<WebElement> listOfOpenButtons;
    @FindBy(xpath = "//div[contains(@role,'dialog')]//button[contains(@aria-label,'Close')")
    private WebElement closeButton;
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
    @FindBy(xpath = "//*[contains(text(),'Adaugă venit')]")
    private WebElement adaugaVenitButton;
    @FindBy(xpath = "//input[@id='input-summary.father_name']")
    private WebElement inputSummaryFatherName;
    @FindBy(xpath = "//input[@id='input-summary.iban']")
    private WebElement inputIbanAccount;

    @FindBy(xpath = "//input[@id='input-summary.employed']")
    private WebElement inputButtonEmployed;

    @FindBy(xpath = "//input[@id='input-summary.retired']")
    private WebElement inputButtonRetired;
    @FindBy(xpath = "//input[@id='input-summary.custom_health_insurance']")
    private WebElement inputButtonLawyer;
    @FindBy(xpath = "//input[@id='input-summary.handicapped']")
    private WebElement disabilityButton;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement disabilityFrom;

    @FindBy(xpath = "//td[@class='day'][normalize-space()='3']")
    private WebElement choiceDateFrom;

    @FindBy(xpath = "//td[@class='day'][normalize-space()='18']")
    private WebElement choiceToDate;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    private WebElement disabilityToDate;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[4]/div/div[1]/div/div[1]/button")
    private WebElement incomeButton;

    @FindBy(xpath = "//*[@id='add-income-modal']/div/div/div[2]/div/div[1]/div[2]/div/div/span/span[1]/span")
    private WebElement incomeCategory;
    @FindBy(xpath = "//*[@id='add-income-modal']/div/div/div[2]/div/div[1]/div[2]/div/div/span[2]/span/span[1]/input")
    private WebElement whichCategory;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement chosenCategory;
    @FindBy(xpath = "//input[@id='input-income.description']")
    private WebElement incomeDescription;
    @FindBy(xpath = "//input[@id='radio-organization-individual']")
    private WebElement organizationFormIndividual;
    @FindBy(xpath = "//input[@id='radio-organization-association']")
    private WebElement organizationFormAsociation;
    @FindBy(xpath = "//input[@id='input-income.documentNumber']")
    private WebElement documentNumber;
    @FindBy(xpath = "(//i[@class='bi bi-calendar'])[3]")
    private WebElement documentDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='8']")
    private WebElement chosenDocumentDate;
    @FindBy(xpath = "//input[@id='input-income.estimation.real.grossIncome']")
    private WebElement incomeBrutEstimated;
    @FindBy(xpath = "//input[@id='input-income.estimation.real.deductibleExpenses']")
    private WebElement estimatedDeductibleCosts;

    @FindBy(xpath = "//*[@id='add-income-modal']/div/div/div[3]/button[1]")
    private WebElement EstimatedIncomeSaveButton;
    @FindBy(xpath = "//input[@id='input-summary.estimated.correction']")
    private WebElement summaryEstimatedCorection;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[4]/div/div[3]/div/div[1]/div[3]/div/div/div/div/button")
    private WebElement openSummaryEstimatedCorection;
    @FindBy(xpath = "//div[@id='j2VYqNjUVmqmecfnCQOL-income']//button[contains(@type,'button')][normalize-space()='Închide']")
    private WebElement closeSummaryEstimatedCorection;

    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[6]/div/div[1]/div/div[1]/button")
    private WebElement incomeRealized;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[8]/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/span/span[1]/span")
    private WebElement incomeCategoryRealized;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[8]/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/span[2]/span/span[1]/input")
    private WebElement whichTypeOfIncomeCategoryRealized;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement chosenTypeOfIncomeCategoryRealized;
    @FindBy(xpath = "//input[@id='input-income.description']")
    private WebElement descriptionIncomeRealized;
    @FindBy(xpath = "//input[@id='input-income.address']")
    private WebElement addressIncomeRealized;
    @FindBy(xpath = "//input[@id='input-income.accomplishment.real.grossIncome']")
    private WebElement brutIncomeRealized;
    @FindBy(xpath = "//input[@id='input-income.accomplishment.real.deductibleExpenses']")
    private WebElement deductibleExpensesIncomeRealized;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[8]/div/div/div/div/div[3]/button[1]")
    private WebElement saveButtonIncomeRealized;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[5]/div[2]/div/div/div/div[2]/input")
    private WebElement rectificationButtonIncomeRealized;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[6]/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/div[1]/button[2]")
    private WebElement deleteButton;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[6]/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/div[2]/div[2]/div/div/div/div[2]/button[1]")
    private WebElement deleteDeclaration;


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

    public void clickAcceptCookie() {
        click(acceptCookie);
    }

    public void clickSingleStatementButton() {
        click(singleStatementButton);
    }

    public void addAdaugaVenitButton() {
        click(adaugaVenitButton);
    }


    public void addInputSummaryFatherName(String inputSummaryFatherName) {
        addText(inputSummaryFatherName, this.inputSummaryFatherName);
    }

    public void addInputIbanAccount(String inputIbanAccount) {
        addText(inputIbanAccount, this.inputIbanAccount);
    }

    public void addInputButtonEmployed() {
        click(inputButtonEmployed);
    }

    public void addInputButtonRetired() {
        click(inputButtonRetired);
    }

    public void addInputButtonLawyer() {
        click(inputButtonLawyer);
    }

    public void addDisabilityButton() {

        click(disabilityButton);
    }

    public void addDisabilityButtonFrom(int x, int y) {
        javascriptExecutor(x, y);
        click(disabilityFrom);


    }

    public void addChoiceDateFrom() {
        click(choiceDateFrom);
    }

    public void addDisabilityButtonToDate() {
        click(disabilityToDate);
    }

    public void addChoiceToDate() {
        click(choiceToDate);
    }


    public void addIncomeButton() {
        click(incomeButton);
    }

    public void addIncomeCategory() {
        click(incomeCategory);
    }

    public void addWhichCategory(String whichCategory) {
        addText(whichCategory, this.whichCategory);

    }

    public void addChosenCategory() {
        click(chosenCategory);
    }

    public void addIncomeDescriptioin(String incomeDescription) {
        addText(incomeDescription, this.incomeDescription);

    }

    public void addOrganizationFormIndividual() {
        click(organizationFormIndividual);
    }

    public void addOrganizationFormAsociation() {
        click(organizationFormAsociation);
    }

    public void addDocumentNumber(String documentNumber) {
        addText(documentNumber, this.documentNumber);
    }

    public void addDocumentDate() {
        click(documentDate);
    }

    public void addChosenDocumentDate() {
        click(chosenDocumentDate);
    }

    public void addIncomeBrutEstimated(String incomeBrutEstimated) {

        addText(incomeBrutEstimated, this.incomeBrutEstimated);
    }

    public void addEstimatedDeductibleCosts(String estimatedDeductibleCosts, int x, int y) {
        javascriptExecutor(x, y);
        addText(estimatedDeductibleCosts, this.estimatedDeductibleCosts);
    }

    public void addEstimatedIncomeSaveButton() {
        click(EstimatedIncomeSaveButton);
    }

    public void clickSummaryEstimatedCorection() {
        click(summaryEstimatedCorection);
    }

    public void clickOpenSummaryEstimatedCorection(int x, int y) {
        javascriptExecutor(x, y);
        click(listofButtons(listOfOpenButtons));
        //action(listofButtons(listOfOpenButtons));
    }

    public void clickCloseSummaryEstimatedCorection() {
        click(closeButton);
    }


    public void clickIncomeRealized(int x, int y) {
        javascriptExecutor(x, y);
        click(incomeRealized);
    }

    public void clickIncomeCategoryRealized() {
        click(incomeCategoryRealized);
    }

    public void addwWhichTypeOfIncomeCategoryRealized(String whichTypeOfIncomeCategoryRealized) {
        addText(whichTypeOfIncomeCategoryRealized, this.whichTypeOfIncomeCategoryRealized);
    }

    public void clickChosenTypeOfIncomeCategoryRealized() {
        click(chosenTypeOfIncomeCategoryRealized);
    }

    public void addDescriptionIncomeRealized(String descriptionIncomeRealized) {
        addText(descriptionIncomeRealized, this.descriptionIncomeRealized);
    }

    public void addAddressIncomeRealized(String addressIncomeRealized) {
        addText(addressIncomeRealized, this.addressIncomeRealized);
    }

    public void addBrutIncomeRealized(String brutIncomeRealized) {
        addText(brutIncomeRealized, this.brutIncomeRealized);
    }

    public void addDeductibleExpensesIncomeRealized(String deductibleExpensesIncomeRealized) {
        addText(deductibleExpensesIncomeRealized, this.deductibleExpensesIncomeRealized);
    }

    public void addSaveButtonIncomeRealized(int x, int y) {
        javascriptExecutor(x, y);
        click(saveButtonIncomeRealized);
    }

    public void clickRectificationButtonIncomeRealized() {
        click(rectificationButtonIncomeRealized);
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public void clickDeleteDeclaration() {
        click(deleteDeclaration);
    }
}




