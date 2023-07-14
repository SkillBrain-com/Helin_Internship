package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppPaymentsPage;
import pages.HouseAndBankJournal;

public class HouseAndBankJournalTest extends BasePage {
    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }

    public HouseAndBankJournal journal() {
        return new HouseAndBankJournal();
    }

    @Test(description = "Test House&Bank Journal")
    @Parameters({"email", "password", "caenAuthorisationNum", "documentNum",
            "totalIncome", "explication", "caenActivity", "CUI", "RegistrationNumber",
            "SupplierName", "City", "Address", "IBAN", "BankName", "Contact",
            "SupplierEmail", "SupplierPhone", "SupplierWebsite"})
    public void houseAndBankJournalTest(String email, String password, String caenActivity, String caenAuthorisationNum,
                                        String documentNum, String totalIncome, String explication,String CUI,
                                        String RegistrationNumber, String SupplierName,String City, String Address,
                                        String IBAN,String BankName,String Contact, String SupplierEmail,
                                        String SupplierPhone, String SupplierWebsite) {

        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        paymentPage().clickReceiptsPayments();
        journal().addIncome();
        journal().selectClient();
        paymentPage().addSupplierCUI(CUI);
        paymentPage().addSupplierRegistrationNumber(RegistrationNumber);
        paymentPage().clickSRL();
        paymentPage().clickPFA();
        paymentPage().addSupplierName(SupplierName);
        journal().selectSupplierCountry();
        paymentPage().selectRomania();
        journal().selectSupplierCounty();
        paymentPage().addSupplierCity(City);
        paymentPage().addSupplierAddress(Address);
        journal().selectSupplierCurrency();
        paymentPage().changeCurrency();
        paymentPage().addSupplierIban(IBAN);
        paymentPage().addSupplierBankName(BankName);
        paymentPage().addSupplierContact(Contact);
        paymentPage().closeCookieButton();
        paymentPage().addSupplierEmail(SupplierEmail);
        paymentPage().addSupplierPhone(SupplierPhone);
        paymentPage().addSupplierWebsite(SupplierWebsite);
        paymentPage().saveSupplier();
        paymentPage().closeAnotherCompanyWarning();
        journal().selectCreatedClient();
        journal().setSelectHouseAndBanks();
        journal().setActivityLocation();
        journal().setAddNewCaen();
        journal().addCaenActivity(caenActivity, caenAuthorisationNum);
        journal().setCaenDate();
        journal().saveNewCaen();
        journal().selectCaen();
        journal().setIncomeDoc();
        journal().addDocNumAndDate(documentNum);
        journal().addTotalIncome(totalIncome);
        journal().setItemType();
        journal().addExplication(explication);
        journal().setFiscalCategory();
        journal().saveArticle();


    }
}
