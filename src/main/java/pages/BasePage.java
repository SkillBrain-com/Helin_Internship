package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.*;

import static base.BaseTest.PageLinksAndTexts.contactAppUrlLink;


public class BasePage {

    public static WebDriver driver_local; //--> rulare in mod normal pe local
//    String contactAppUrl = "https://contapp.ro/";
    public static ExtentTest logger;
    public static ExtentReports report;
    

    /*pentru Webdriver Local - rularea pe acelasi pc
     */
    @BeforeMethod(alwaysRun=true)
    public void setup(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver_local = new ChromeDriver(options);
        driver_local.manage().window().maximize();
        driver_local.get(String.valueOf(contactAppUrlLink));
        context.setAttribute("WebDriver", driver_local);
    }


    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        driver_local.quit();
    }

    public void reportLog(String message){
        Reporter.log(message);
    }

}
