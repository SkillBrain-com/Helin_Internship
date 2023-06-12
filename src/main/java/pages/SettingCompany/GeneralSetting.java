package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GeneralSetting extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='General']")
    private WebElement generalSettingLink;
    @FindBy(xpath = "//input[@placeholder='Caută după CUI/CIF']")
    private WebElement searchInputCUI;

    @FindBy(xpath = "//i[@class='bi bi-search']")
    private WebElement searchButton;

    @FindBy(xpath = "///span[contains(text(),'Adaugă')]")
    private WebElement addCompanyButton;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[1]")
    @CacheLookup private WebElement nrRegComInput;

    @FindBy(xpath = "(//span[@role='textbox'])[2]")
    @CacheLookup private WebElement entityTypeOption;

    @FindBy(xpath = "//span[@title='---']")
    private WebElement entityOptionDefault;

    @FindBy(xpath = "//span[contains(@title,'Alta')]")
    private WebElement entityTypeOptionOther;

    @FindBy(xpath = "//span[contains(@title,'Asociere de P.F.')]")
    private WebElement entityTypeOptionAPF;

    @FindBy(xpath = "//span[normalize-space()='II']")
    private WebElement entityTypeOptionII;

    @FindBy(xpath = "//span[contains(text(),'Persoană fizică')]")
    private WebElement entityTypeOptionPF;

    @FindBy(xpath = "//span[contains(text(),'PFA')]")
    private WebElement entityTypeOptionPFA;

    @FindBy(xpath = "//span[normalize-space()='PFI']")
    private WebElement entityTypeOptionPFI;

    @FindBy (xpath = "//span[contains(text(),'Profesie Liberală')]")
    private WebElement  entityTypeOptionPL;

    @FindBy(xpath = "//span[normalize-space()='SA']")
    private WebElement entityTypeOptionSA;

    @FindBy(xpath = "//span[normalize-space()='SRL']")
    private WebElement entityTypeOptionSRL;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[2]")
    private WebElement companyNameLabel;

    @FindBy (xpath = "//div[@class=\"input-group with-text\"]//input[@class=\"form-control\"]")
    private WebElement registrationDate;

    @FindBy(xpath = "//span[contains(@role,'combobox')]")
    private WebElement countryOption;

    @FindBy(xpath = "(//span[@role='combobox'])[3]")
    private WebElement countyOption;

    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement cityInput;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[4]")
    private WebElement addressInput;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[5]")
    private WebElement contactPersonInput;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[6]")
    private WebElement websiteInput;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[7]")
    private WebElement emailInput;

    @FindBy(xpath = "(//div//div[@class=\"input-group \"]//input[@class=\"form-control \"])[8]")
    private WebElement phoneInput;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Închide'])[1]")
    private WebElement closeButton;

    // alert messages
    @FindBy(xpath = "//label[contains(text(),'CUI/CIF trebuie să fie un șir de caractere.')]")
    private WebElement cuiAlertMessage;

    @FindBy(xpath = "//label[normalize-space()='Campul 'Tip entitate' este obligatoriu.']")
    private WebElement entityTypeAlertMessage;

    @FindBy(xpath = "//label[normalize-space()='Campul 'Numele firmei' este obligatoriu.']")
    private WebElement companyNameAlertMessage;

    @FindBy(xpath = "//label[contains(text(),'Campul \"Județ\" este obligatoriu.')]")
    private WebElement countyAlertMessage;

    @FindBy(xpath = "//label[normalize-space()='Campul \"Localitate\" este obligatoriu.']")
    private WebElement cityAlertMessage;

    @FindBy(xpath = "//label[contains(text(),'Campul \"Adresă\" este obligatoriu.')]")
    private WebElement addressAlertMessage;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement successMessage;

    public void getEntityTypeOption(String entityType){
        click(entityTypeOption);
        switch (entityType) {
            case "---":
                click(entityOptionDefault);
                break;
            case "Alta":
                click(entityTypeOptionOther);
                break;
            case "Asociere de P.F.":
                click(entityTypeOptionAPF);
                break;
            case "II":
                click(entityTypeOptionII);
                break;
            case "Persoană fizică":
                click(entityTypeOptionPF);
                break;
            case "PFA":
                click(entityTypeOptionPFA);
                break;
            case "PFI":
                click(entityTypeOptionPFI);
                break;
            case "Profesie Liberală":
                click(entityTypeOptionPL);
                break;
            case "SA":
                click(entityTypeOptionSA);
                break;
            case "SRL":
                click(entityTypeOptionSRL);
                break;
            default:
                System.out.println("Entity type not found");
        }
    }


    public void getMessageAlert(String message){
        switch (message) {
            case "CUI/CIF trebuie să fie un șir de caractere.":
                getText(cuiAlertMessage);
                break;
            case "Campul 'Tip entitate' este obligatoriu.":
                getText(entityTypeAlertMessage);
                break;
            case "Campul 'Numele firmei' este obligatoriu.":
                getText(companyNameAlertMessage);
                break;
            case "Campul \"Județ\" este obligatoriu.":
                getText(countyAlertMessage);
                break;
            case "Campul \"Localitate\" este obligatoriu.":
                getText(cityAlertMessage);
                break;
            case "Campul \"Adresă\" este obligatoriu.":
                getText(addressAlertMessage);
                break;
            default:
                System.out.println("Message not found");
        }
    }


    public void addCompanyName(String companyName){
        addText(companyName, companyNameLabel);
    }

    public void addRegistrationDate(String registrationDate){
        click(this.registrationDate);
        addText(registrationDate, this.registrationDate);
    }

    public void getCountryOption(String country){
        click(countryOption);
        switch (country) {
            case "Romania":
                click(countryOption);
                break;
            default:
                System.out.println("Country not found");
        }
    }

    public void getCountyOption(String county){
        click(countyOption);
        switch (county) {
            case "Alba":
                click(countyOption);
                break;
            default:
                System.out.println("County not found");
        }
    }

    public void modifiedCompany(String cui, String nrRegCom, String entityType, String companyName,
                                String registrationDate, String country, String county, String city, String address,
                                String contactPerson, String website, String email, String phone){
        addText(cui, searchInputCUI);
        addText(nrRegCom, nrRegComInput);
        getEntityTypeOption(entityType);
        addCompanyName(companyName);
        addRegistrationDate(registrationDate);
        getCountryOption(country);
        getCountyOption(county);
        addText(city, cityInput);
        addText(address, addressInput);
        addText(contactPerson, contactPersonInput);
        addText(website, websiteInput);
        addText(email, emailInput);
        addText(phone, phoneInput);
        click(saveButton);
    }
}