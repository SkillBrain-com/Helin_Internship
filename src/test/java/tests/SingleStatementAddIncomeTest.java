package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SingleStatementAddIncome;

public class SingleStatementAddIncomeTest extends BasePage {
    public SingleStatementAddIncome singleStatementAddIncome() {
        return new SingleStatementAddIncome();
    }

    @Test(description = "Testing add income section")
    @Parameters({"username", "password", "fatherName", "ibanAccount", "whichCategory", "documentNumber", "incomeDescription", "incomeBrutEstimated", "estimatedDeductibleCosts", "whichTypeOfIncomeCategoryRealized", "descriptionIncomeRealized", "addressIncomeRealized", "brutIncomeRealized", "deductibleExpensesIncomeRealized"})
    public void singleStatementTestAddIncome(String username, String password, String fatherName, String ibanAccount, String whichCategory, String documentNumber, String incomeDescription, String incomeBrutEstimated, String estimatedDeductibleCosts, String whichTypeOfIncomeCategoryRealized, String descriptionIncomeRealized, String addressIncomeRealized, String brutIncomeRealized, String deductibleExpensesIncomeRealized) {
        singleStatementAddIncome().clickAuthenticationButton();
        singleStatementAddIncome().addEmail(username);
        singleStatementAddIncome().addPassword(password);
        singleStatementAddIncome().clickRememberMeCheckbox();
        singleStatementAddIncome().clickLoginButton();
        singleStatementAddIncome().clickSingleStatementButton();
        singleStatementAddIncome().clickAcceptCookie();
        singleStatementAddIncome().addAdaugaVenitButton();
        singleStatementAddIncome().addInputSummaryFatherName(fatherName);
        singleStatementAddIncome().addInputIbanAccount(ibanAccount);
        singleStatementAddIncome().addInputButtonEmployed();
        singleStatementAddIncome().addInputButtonRetired();
        singleStatementAddIncome().addInputButtonLawyer();
        singleStatementAddIncome().addDisabilityButton();
        singleStatementAddIncome().addDisabilityButtonFrom(0,500);
        singleStatementAddIncome().addChoiceDateFrom();
        singleStatementAddIncome().addDisabilityButtonToDate();
        singleStatementAddIncome().addChoiceToDate();
        singleStatementAddIncome().addIncomeButton();
        singleStatementAddIncome().addIncomeCategory();
        singleStatementAddIncome().addWhichCategory(whichCategory);
        singleStatementAddIncome().addChosenCategory();
        singleStatementAddIncome().addIncomeDescriptioin(incomeDescription);
        singleStatementAddIncome().addOrganizationFormIndividual();
        singleStatementAddIncome().addOrganizationFormAsociation();
        singleStatementAddIncome().addDocumentNumber(documentNumber);
        singleStatementAddIncome().addDocumentDate();
        singleStatementAddIncome().addChosenDocumentDate();
        singleStatementAddIncome().addIncomeBrutEstimated(incomeBrutEstimated);
        singleStatementAddIncome().addEstimatedDeductibleCosts(estimatedDeductibleCosts,0,2000);
        singleStatementAddIncome().addEstimatedIncomeSaveButton();
        singleStatementAddIncome().clickOpenSummaryEstimatedCorection(0,2000);
        singleStatementAddIncome().clickCloseSummaryEstimatedCorection();
        singleStatementAddIncome().clickIncomeRealized(0,1500);
        singleStatementAddIncome().clickIncomeCategoryRealized();
        singleStatementAddIncome().addwWhichTypeOfIncomeCategoryRealized(whichTypeOfIncomeCategoryRealized);
        singleStatementAddIncome().clickChosenTypeOfIncomeCategoryRealized();
        singleStatementAddIncome().addDescriptionIncomeRealized(descriptionIncomeRealized);
        singleStatementAddIncome().addAddressIncomeRealized(addressIncomeRealized);
        singleStatementAddIncome().addBrutIncomeRealized(brutIncomeRealized);
        singleStatementAddIncome().addDeductibleExpensesIncomeRealized(deductibleExpensesIncomeRealized);
        singleStatementAddIncome().addSaveButtonIncomeRealized(0,1500);
        singleStatementAddIncome().clickRectificationButtonIncomeRealized();
        singleStatementAddIncome().clickDeleteButton();
        singleStatementAddIncome().clickDeleteDeclaration();

    }
}
