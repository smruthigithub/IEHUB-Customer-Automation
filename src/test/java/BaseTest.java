package test.java;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public ExtentSparkReporter htmlReporter;
//    public void setUpDrivers(){
//       /* if(browserName.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
//            driver= new ChromeDriver();
//        }else if(browserName.equalsIgnoreCase("edge")){
//            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe" );
//        }else {
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
//            driver= new ChromeDriver();
//        }*/
//        WebDriverManager.chromedriver().setup();
//
//    }

    @BeforeTest
    public void beforeTestMethod(){
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports" + File.separator + "AutomationReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("QA Engineer", "Smruthi Kandukuri");
    }

    @BeforeMethod
    public void beforeMethodMethod(Method testMethod){
        logger = extent.createTest(testMethod.getName());
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterMethodMethod(ITestResult result){
        if (result.getStatus()==ITestResult.SUCCESS){
            String methodName = result.getMethod().getMethodName();
            String logText =  "Test Case: "+ methodName + "Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS,m);
        }
        else if (result.getStatus()==ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText =  "Test Case: "+ methodName + "Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL,m);
        }
       // driver.quit();
    }

    @AfterTest
    public void afterTestMethod(){
        extent.flush();
    }

}