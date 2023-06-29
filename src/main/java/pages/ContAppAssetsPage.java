package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;

public class ContAppAssetsPage extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Active']")
    private WebElement buttonActive;
    @FindBy(xpath = "//a[contains(text(),'Imobilizări')]")
    private WebElement buttonAssets;
    @FindBy(xpath = "//a[@href='https://ps.contapp.ro/active/imobilizare/creaza']")
    private WebElement buttonAddAssets;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement textNameAssets;
    @FindBy(xpath = "//input[@id='input-provider']")
    private WebElement textProviderAssets;
    @FindBy(xpath = "(//input[@id='input-inventoryNumber'])[1]")
    private WebElement inventoryNumberAssets;
    @FindBy(xpath = "//input[@id='input-documentNumber']")
    private WebElement documentNumberAssets;
    @FindBy(xpath = "(//i[contains(@class,'bi bi-calendar')])[1]")
    private WebElement openDocumentDateAssets;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='5']")
    private WebElement selectDocumentDateAssets;
    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement inputValueAssets;
    @FindBy(xpath = "(//b[@role='presentation'])[2]")
    private WebElement openLocationAssets;
    @FindBy(xpath = "//span[contains(text(),'Activitate desfășurată la terți')]")
    private WebElement selectLocationAssets;
    @FindBy(xpath = "(//b[@role='presentation'])[3]")
    private WebElement openActivityAssets;
    @FindBy(xpath = "(//li[@role='option'])[2]")
    private WebElement selectActivityAssets;
    @FindBy(xpath = "//input[@id='input-partialDamp']")
    private WebElement checkBoxPartialDampAssets;
    @FindBy(xpath = "//input[@id='input-excludeFromRecords']")
    private WebElement checkBoxExcludeFromRecordsAssets;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[4]")
    private WebElement openClassifiedCodeAssets;
    @FindBy(xpath = "(//li[@role='option'])[3]")
    private WebElement selectClassifiedCodeAssets;
    @FindBy(xpath = "(//b[@role='presentation'])[5]")
    private WebElement openDampingTypeAssets;
    @FindBy(xpath = "(//span[normalize-space()='Liniar'])[1]")
    private WebElement selectDampingTypeAssets;
    @FindBy(xpath = "(//b[@role='presentation'])[6]")
    private WebElement openOperationTypeAssets;
    @FindBy(xpath = "(//li[@role='option'])[2]")
    private WebElement selectOperationTypeAssets;
    @FindBy(xpath = "//input[@id='input-operationDocumentNumber']")
    private WebElement operationDocumentNumberAssets;
    @FindBy(xpath = "(//i[contains(@class,'bi bi-calendar')])[2]")
    private WebElement openOperationDateAssets;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='7']")
    private WebElement selectOperationDateAssets;
    @FindBy(xpath = "//input[@id='input-operationDescription']")
    private WebElement textOperationDescriptionAssets;
    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement buttonSaveAssets;
    @FindBy(xpath = "//tbody/tr/td/span/div/div/button")
    private WebElement openAssetsDropdown;
    @FindBy(xpath = "//li[normalize-space()='Șterge']")
    private WebElement deleteAssets;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//button[@type='submit']")
    private WebElement confirmDeleteAssets;
    @FindBy(xpath = "//option[@value='date']")
    private WebElement sortByDate;
    @FindBy(xpath = "//option[@value='desc']")
    private WebElement sortByDateDesc;
    @FindBy(xpath = "//a[@class='btn btn-light']//i[@class='bi bi-eye']")
    private WebElement assetsRegistryButton;

    public void sortByDate() {
        click(sortByDate);
        click(sortByDateDesc);
    }

    public void deleteAssets() {
        click(openAssetsDropdown);
        click(deleteAssets);
        click(confirmDeleteAssets);
    }

    public void clickButtonActive() {
        click(buttonActive);
    }

    public void clickButtonAssets() {
        click(buttonAssets);
    }

    public void clickAddAssets() {
        click(buttonAddAssets);
    }

    public void setDateAssets() {
        click(openDocumentDateAssets);
        click(selectDocumentDateAssets);
    }

    public void setLocationAssets() {
        click(openLocationAssets);
        click(selectLocationAssets);
    }

    public void setActivityAssets() {
        click(openActivityAssets);
        click(selectActivityAssets);
    }

    public void checkPartialDampAssets() {
        click(checkBoxPartialDampAssets);
    }

    public void checkExcludeFromRecordsAssets() {
        click(checkBoxExcludeFromRecordsAssets);
    }

    public void setClassifiedCodeAssets() {
        click(openClassifiedCodeAssets);
        click(selectClassifiedCodeAssets);
        movetoElement();

    }

    public void setDampingTypeAssets() {
        click(openDampingTypeAssets);
        click(selectDampingTypeAssets);
        movetoElement();
    }

    public void setOperationTypeAssets() {
        click(openOperationTypeAssets);
        click(selectOperationTypeAssets);
        movetoElement();
    }

    public void setOperationDateAssets() {
        click(openOperationDateAssets);
        click(selectOperationDateAssets);
        movetoElement();
    }

    public void addNameAssets(String nameAssets) {
        addText(nameAssets, textNameAssets);
    }

    public void addProviderAssets(String providerAssets) {
        addText(providerAssets, textProviderAssets);
    }

    public void addInventoryNumberAssets(String invNumberAssets) {
        addText(invNumberAssets, inventoryNumberAssets);
    }

    public void addDocumentNumberAssets(String docNumberAssets) {
        addText(docNumberAssets, documentNumberAssets);
    }

    public void addValueAssets(String valueAssets) {
        addText(valueAssets, inputValueAssets);
    }

    public void addOperationDocNumberAssets(String operationDocNoAssets) {
        addText(operationDocNoAssets, operationDocumentNumberAssets);
    }

    public void addOperationDescriptionAssets(String operationDescAssets) {
        addText(operationDescAssets, textOperationDescriptionAssets);
        movetoElement();
    }

    public void saveAssets() {
        click(buttonSaveAssets);
    }

    public void verifyAssetsRegistryButton() {
        click(assetsRegistryButton);
        SwitchToNextTab();
        String CurrentUrl = "https://ps.contapp.ro/export/3850/assets/pdf/view?year=2023";
        Assert.assertEquals(getUrl(), CurrentUrl);

    }


}
