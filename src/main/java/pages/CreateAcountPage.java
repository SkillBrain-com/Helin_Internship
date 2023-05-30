package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CreateAcountPage extends BaseTest {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement butoncontinua;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//a[normalize-space()='Termeni']")
    private WebElement termeni;




}
