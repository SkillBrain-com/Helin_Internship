package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public static WebDriver driverLocal;
    String url = "https://semicolon-task-manager-skillbrains-grxarv6yb-cezarmocanu.vercel.app/login";
    public static ExtentReports reports;
    public static ExtentTest logger;

    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestContext context) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driverLocal = new ChromeDriver(options);
        driverLocal.manage().window().maximize();
        driverLocal.manage().deleteAllCookies();
        driverLocal.get(url);
        context.setAttribute("WebDriver", driverLocal);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverLocal.quit();
    }
}
