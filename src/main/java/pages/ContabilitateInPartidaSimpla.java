package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContabilitateInPartidaSimpla extends BaseTest {

    @FindBy (xpath = "//a[contains(text(),'Aplicația ContApp')]")
    private WebElement listaAplicatiaContApp;

    @FindBy ( xpath = "//a[@target='_blank'][contains(text(),'Documentație')]")
    private WebElement documentatie;

    @FindBy ( xpath = "//body/section/section[1]/section[1]/a[2]")
    private WebElement paginaContabilitateInPartidaSimpla;

    @FindBy ( xpath = "//option[@value='name']")
    private WebElement listaSortareAZ;

    @FindBy (xpath = "//a[1]//span[normalize-space()='Categorii fiscale - tipuri de venituri și cheltuieli']")
    private WebElement categoriiFiscale;

    @FindBy (xpath = "//a[1]//span[normalize-space()='Despre Contabilitatea în Partidă Simplă']")
    private WebElement despreContabilitateaInPartidaSImpla;

    @FindBy (xpath = "//a[1]//span[normalize-space()='Rezumat taxe și contribuții datorate']")
    private WebElement rezumatTaxeSiContributiiDatorate;

    @FindBy (xpath = "//body[1]/section[1]/div[1]/section[1]/div[1]/article[1]/p[3]/a[1]")
    private WebElement linkOUG44;

    @FindBy ( xpath = "//span[@class='articleRatings-feedback']")
    private WebElement mesajRatingButton;

    @FindBy (xpath = "//div[normalize-space()='404']")
    private WebElement textPaginaOUG;


    @FindBy (xpath = "//div[contains(text(),'Negăsit')]")
    private WebElement text2PaginaOUG;

    @FindBy (xpath = "//tbody/tr[1]/td[1]")
    private WebElement textCheltuieli;

    @FindBy (xpath = "//td[normalize-space()='Achizitie obiecte de inventar']")
    private WebElement textColoana2;

    @FindBy (xpath = "//tbody/tr[11]/td[3]")
    private WebElement textColoana3;

    @FindBy (xpath = "//button[@data-rating='positive']//span[2]")
    private WebElement ratingButton;

    @FindBy (xpath = "//p[contains(text(),'După închiderea anului fiscal, contribuabilii pent')]")
    private WebElement paragraf;

    @FindBy (xpath = "//body[1]/section[1]/div[1]/section[1]/div[1]/article[1]/h4[2]/strong[1]")
    private WebElement titluTabel;

    public void clickAplicatiaContApp() {
        click(listaAplicatiaContApp);
    }

    public void clickDocumentatie(){
        click(documentatie);
    }

    public void clickContabilitateaInPartidaSimpla(){
        click(paginaContabilitateInPartidaSimpla);
    }

    public void clickoptiuneSortareAZ() {
        click(listaSortareAZ);
        String text1 = getText(categoriiFiscale);
        char firstLetter = text1.charAt(0);
        System.out.println("First letter from the first link " + firstLetter);
        String text2 = getText(despreContabilitateaInPartidaSImpla);
        char firstLetter2 = text2.charAt(0);
        System.out.println("First Letter from the second link: " + firstLetter2);
        String text3 = getText(rezumatTaxeSiContributiiDatorate);
        char firstLetter3 = text3.charAt(0);
        System.out.println("First Letter from the third link: " + firstLetter3);
        char[] charArray = {firstLetter, firstLetter2, firstLetter3};
        boolean isAlphabetical = true;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (Character.toLowerCase(charArray[i]) > Character.toLowerCase(charArray[i + 1])) {
                isAlphabetical = false;
                break;
            }
        }
        if (isAlphabetical) {
            System.out.println("The links are in alphabetical order, the sorting method A-Z is working");
        } else {
            System.out.println("The links are not in alphabetical order.");
        }
    }

    public void clickRezumatTaxe(){
        click(rezumatTaxeSiContributiiDatorate);
    }
    public void clickLinkOUG(){
        click(linkOUG44);
    }
    public void linkOUG(){
        System.out.println("Link-ul nu functioneaza si apare urmatoarea eroare: " + " " + getText(textPaginaOUG) + " " + getText(text2PaginaOUG));
    }
    public void clickRatingButton(){
        click(ratingButton);
    }


    public void  mesajRatingButton(){
        Assert.assertEquals(getText(mesajRatingButton),"Mulțumim pentru părere");
    }

    public void clickInfoContabilitateaInPartidaSimpla(){
        click(despreContabilitateaInPartidaSImpla);
    }

    public void clickCategoriiFiscale(){
        click(categoriiFiscale);
    }

    public void textPaginaCategoriiFiscale() {
        System.out.println("Text dintr-un rand: " + getText(textCheltuieli) + " " + getText(textColoana2) + " " + getText(textColoana3));
    }




}
