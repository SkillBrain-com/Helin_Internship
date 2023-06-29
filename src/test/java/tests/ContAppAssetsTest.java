package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppAssetsPage;
import pages.ContAppPaymentsPage;

public class ContAppAssetsTest extends BasePage {
    public ContAppAssetsPage assetsPage() {
        return new ContAppAssetsPage();
    }

    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }

    @Test(description = "Add New Assets")
    @Parameters({"email", "password", "nameAssets", "providerAssets", "invNumberAssets", "docNumberAssets", "valueAssets",
            "operationDocNoAssets", "operationDescAssets"})
    public void addNewAssets(String email, String password, String nameAssets, String providerAssets, String invNumberAssets, String docNumberAssets,
                             String valueAssets, String operationDocNoAssets, String operationDescAssets) {

        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        assetsPage().clickButtonActive();
        assetsPage().clickButtonAssets();
        assetsPage().clickAddAssets();
        assetsPage().addNameAssets(nameAssets);
        assetsPage().addProviderAssets(providerAssets);
        assetsPage().addInventoryNumberAssets(invNumberAssets);
        assetsPage().addDocumentNumberAssets(docNumberAssets);
        assetsPage().setDateAssets();
        assetsPage().addValueAssets(valueAssets);
        paymentPage().closeCookieButton();
        assetsPage().setLocationAssets();
        assetsPage().setActivityAssets();
        assetsPage().checkPartialDampAssets();
        assetsPage().checkExcludeFromRecordsAssets();
        assetsPage().setClassifiedCodeAssets();
        assetsPage().setDampingTypeAssets();
        assetsPage().setOperationTypeAssets();
        assetsPage().setOperationDateAssets();
        assetsPage().addOperationDocNumberAssets(operationDocNoAssets);
        assetsPage().addOperationDescriptionAssets(operationDescAssets);
        assetsPage().saveAssets();
        assetsPage().deleteAssets();
        assetsPage().sortByDate();
        assetsPage().verifyAssetsRegistryButton();

    }
}
