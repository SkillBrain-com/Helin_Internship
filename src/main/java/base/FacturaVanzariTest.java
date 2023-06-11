package base;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FacturaVanzari;
import pages.LoginPage;

public class FacturaVanzariTest extends FacturaVanzari {
    public LoginPage loginPage() {
        return new LoginPage();
    }

    @Test(description = "Happy Test!")
    @Parameters({"username", "password"})
    public void verifyLogin(String username, String password) {

        loginPage().addUserName(username);
        loginPage().addUserPassword(password);
        loginPage().clickLoginButton();
    }
    @Test(description = "Create Account")
    @Parameters({"firstName","lastName", "email","password"})
    public void verifyCreateAccount(String firstName, String lastName, String email, String password){
        loginPage().clickCreateAccount();
        Assert.assertEquals(loginPage().getUrl(),"https://account.contapp.ro/login");
        loginPage().createAccount(firstName, lastName, email,password);

    }

    @Test(description = "venituri")
    @Parameters({"facturi vanzari"})
    public void genereazaFactura(String venituri,  String facturiVanzari, String clienti,String adauga ){
        clickvenituri();
        clickfacturiVanzari();
        clickclienti();
        clickadauga();

    }
    @Test(description = "adauga facturi vanzari")
    @Parameters("creaza factura vanzari")
    public void adaugaFacturiVanzari(String alegeClient,String alegeTip,String serieFactura,String numarFactura,
      String tipArticol, String denumireArticol ,String categorieFiscala,String cantitate,String pretUnitar,
                                     String total,String adaugaArticol){
        alegeClient();
        alegeTip();
        serieFactura();
        numarFactura();
        tipArticol();
        denumireArticol();
        categorieFiscala();
        cantitate();
        pretUnitar();
        total();
        adaugaArticol();
    }


}
