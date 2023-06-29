package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContabilitateInPartidaSimpla;

import java.util.Set;

public class ContabilitateInPartidaSimplaTest extends BasePage {

    public ContabilitateInPartidaSimpla documentatieContabilitate() {
        return new ContabilitateInPartidaSimpla();
    }

    @Test(description = "HappyTest")
    @Parameters()
    public void ContabilitateInPartidaSimplaTest(){
        documentatieContabilitate().clickAplicatiaContApp();
        String originalTabHandle = driver_local.getWindowHandle();
        documentatieContabilitate().clickDocumentatie();
        Set<String> windowHandles = driver_local.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(originalTabHandle)) {
                driver_local.switchTo().window(handle);
                break;
            }
        }
        documentatieContabilitate().clickContabilitateaInPartidaSimpla();
        documentatieContabilitate().clickoptiuneSortareAZ();
        documentatieContabilitate().clickInfoContabilitateaInPartidaSimpla();
        documentatieContabilitate().clickLinkOUG();
        documentatieContabilitate().linkOUG();
        driver_local.navigate().back();
        documentatieContabilitate().clickRatingButton();
        //documentatieContabilitate().waitPage();
        documentatieContabilitate().mesajRatingButton();
        driver_local.navigate().back();
        documentatieContabilitate().clickCategoriiFiscale();
        documentatieContabilitate().textPaginaCategoriiFiscale();
        driver_local.navigate().back();
        documentatieContabilitate().clickRezumatTaxe();

    }

}
