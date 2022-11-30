package test.java;

import main.java.pageEvents.LoginPageEvents;
import main.java.pageEvents.SignUpPageEvents;
import main.java.utils.SuiteListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static main.java.pageObjects.SignUpPageElements.selectfrequency;

@Listeners(SuiteListener.class)
public class LoginTest extends BaseTest {
    @Test
    public void methodToEnterTheLoginPage() throws InterruptedException {

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.enterUserName();
        loginPageEvents.enterPassword();
        loginPageEvents.clickOnLoginButton();
      /*  Assert.assertTrue(true);*/

      /*  =======================================Profile Entry ==============================*/

        SignUpPageEvents signUpPageEvents = new SignUpPageEvents();
        WebElement enterlastName = driver.findElement(By.id("lname"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", enterlastName);
        Thread.sleep(5000);
        signUpPageEvents.clickonNext();
        signUpPageEvents.clickonTitle();
        Thread.sleep(2000);              //Select the Title in signUpPageEvents before Running//
        signUpPageEvents.clickonNext();
        signUpPageEvents.clickonAloneorPartner();
        Thread.sleep(2000);                       //Select anyone in signUpPageEvents before Running//
        signUpPageEvents.clickonNext();

        /* ===================Using Select method in the Test itself for dob===========*/

        Select selectdate = new Select(driver.findElement(By.xpath("//select[@name='debtor1Date']")));
        selectdate.selectByVisibleText("28");
        Select selectmonth = new Select(driver.findElement(By.xpath("//select[@name='debtor1Month']")));
        selectmonth.selectByVisibleText("October");
      //  Thread.sleep(3000);
        Select selectyear = new Select(driver.findElement(By.xpath("//select[@name='debtor1Year']")));
        selectyear.selectByVisibleText("1999");
        Thread.sleep(2000);
        signUpPageEvents.clickonNext();
        /*signUpPageEvents.enterBuildingNum();
        signUpPageEvents.enterPostCode();*/
        signUpPageEvents.clickonNext();
        Select residentialStatus = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[1]")));
        residentialStatus.selectByVisibleText("Owner without mortgage");
        /*  residentialStatus.selectByVisibleText("Owner with mortgage");
        residentialStatus.selectByVisibleText("Living with parents");                     //Select anyone//
        residentialStatus.selectByVisibleText("Tenant - Private");
        residentialStatus.selectByVisibleText("Tenant - Social");
        residentialStatus.selectByVisibleText("Other");  */
        signUpPageEvents.clickonNext();
       // signUpPageEvents.enterMobileNum();
        signUpPageEvents.clickonNext();
        Select employmentStatus = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[2]")));
        employmentStatus.selectByVisibleText("Full Time");
        /*employmentStatus.selectByVisibleText("Part Time");
        employmentStatus.selectByVisibleText("Unemployed");
        employmentStatus.selectByVisibleText("Not working due to illness/disability");
        employmentStatus.selectByVisibleText("Self Employed");
        employmentStatus.selectByVisibleText("Retired");                    //Select anyone//
        employmentStatus.selectByVisibleText("Carer");
        employmentStatus.selectByVisibleText("Student");
        employmentStatus.selectByVisibleText("Other");*/
        signUpPageEvents.clickonNext();
        signUpPageEvents.clickYesorNoforChildren();
        signUpPageEvents.clickonNext();
        Thread.sleep(2000);

        /* ====================Select if there are Children Below 16 ===============================*/

        Select childrenBelow16 = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[3]")));
        childrenBelow16.selectByVisibleText("3");                        //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();

        // ====================Select if Children Between 16 and 18===============================//

        Select childrenBetween16And18 = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[4]")));
        childrenBetween16And18.selectByVisibleText("3");                        //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();
        Select dependentAdults = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[3]")));
        dependentAdults.selectByVisibleText("3");                       //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();

        //*===================Do u own any vehicles written here directly due to Exception=============*//

        driver.findElements(By.xpath("(//label[text()='YES'])[1]"));  //YES for VEHICLES//
      //  driver.findElements(By.xpath("(//label[text()='NO'])[2]"));    //NO for VEHICLES//
        signUpPageEvents.clickonNext();
        Thread.sleep(2000);
        Select numberOfVehicles = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[6]")));
        numberOfVehicles.selectByVisibleText("3");                        //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();

        Select reasonForIEHub = new Select(driver.findElement(By.id("reasonForIeHub")));
        reasonForIEHub.selectByValue("Managing my budget");
        /*reasonForIEHub.selectByValue("Planning ahead");
        reasonForIEHub.selectByValue("Asked to by my creditor/company I am dealing with");
        reasonForIEHub.selectByValue("Loan / Finance Application");           //Select anyone//
        reasonForIEHub.selectByValue("Grant / Tariff Application");
        reasonForIEHub.selectByValue("Managing debt");
        reasonForIEHub.selectByValue("Preparing a family member for living alone");
        reasonForIEHub.selectByValue("Other");*/
        signUpPageEvents.clickonNext();
        Thread.sleep(5000);

        //==================================Income Fields ====================================//

       // signUpPageEvents.netSalary();
       // signUpPageEvents.selectFromDropDown(selectfrequency, "4-Weeks");
       // signUpPageEvents.addNotes();
        Thread.sleep(3000);
        signUpPageEvents.clickNextOnIncome();
       // signUpPageEvents.partnerSalary();
        signUpPageEvents.selectFromDropDown(selectfrequency, "Month");
        Thread.sleep(3000);
        signUpPageEvents.clickNextOnIncome(); //On Other Earnings//
        Thread.sleep(3000);

        //================Other Benefits===================//

       driver.findElements(By.id("btc-yes"));  //YES FOR BENEFITS//
      //  driver.findElements(By.id("btc-no"));   //NO FOR BENEFITS//
        signUpPageEvents.clickNextOnIncome();
       // signUpPageEvents.universalCredit();
        signUpPageEvents.clickNextOnIncome();
//       // signUpPageEvents.jobseekerAllowanceIncome();
//        signUpPageEvents.clickNextOnIncome();                        // Uncomment when selected Unemployed //
//       // signUpPageEvents.jobseekerAllowanceContribution();
//        signUpPageEvents.clickNextOnIncome();
//       // signUpPageEvents.enterIncomeSupport();
//        signUpPageEvents.clickNextOnIncome();

       // signUpPageEvents.workingTaxCredit();
        signUpPageEvents.clickNextOnIncome();
      //  signUpPageEvents.childTaxCredit();
        signUpPageEvents.clickNextOnIncome();
      //  signUpPageEvents.childBenefit();
        signUpPageEvents.clickNextOnIncome();
//       signUpPageEvents.empSupportAllowance();
//        signUpPageEvents.clickNextOnIncome();
//     //   signUpPageEvents.disabilityBenefit();                       // Uncomment when selected Unemployed //
//        signUpPageEvents.clickNextOnIncome();
        //signUpPageEvents.carerAllowance();
        signUpPageEvents.clickNextOnIncome();
       // signUpPageEvents.localHousingAllowanceOrBenefit();      //Uncomment for Tenant Private/Social and Other//
       // signUpPageEvents.clickNextOnIncome();
       // signUpPageEvents.councilTaxSupport();
        signUpPageEvents.clickNextOnIncome();
     //  signUpPageEvents.otherBenefitsTaxCredits();
        signUpPageEvents.clickNextOnIncome();

        //===========Other Income===============//

        driver.findElements(By.xpath("//label[@for='other-income-yes']"));   //YES FOR INCOME//
      //  driver.findElements(By.xpath("//label[@for='other-income-no']"));   //NO FOR INCOME//
        signUpPageEvents.clickNextOnIncome();
      //  signUpPageEvents.childSupportOrMaintenance();
        signUpPageEvents.clickNextOnIncome();
       // signUpPageEvents.boardersOrLodgers();
        signUpPageEvents.clickNextOnIncome();
       // signUpPageEvents.dependentContribution();
        signUpPageEvents.clickNextOnIncome();
      //  signUpPageEvents.studentLoanOrGrant();
       signUpPageEvents.clickNextOnIncome();
      //  signUpPageEvents.moneyFromOtherSource();
        signUpPageEvents.clickNextOnIncome();
     //   Thread.sleep(4000);

        //=====================================Assets Fields=====================================//

        //driver.findElements(By.xpath("//label[@for='vehicle-yes']"));   //YES FOR PROPERTIES//
       driver.findElements(By.xpath("//label[@for='vehicle-no']"));    //NO FOR PROPERTIES//
        Thread.sleep(3000);
        signUpPageEvents.clickNextOnAssets();
       // signUpPageEvents.totalValueOfProperties();
        signUpPageEvents.clickNextOnAssets();
        //signUpPageEvents.outstandingOnMortgage();
        signUpPageEvents.clickNextOnAssets();
        //signUpPageEvents.outstandingOnSecuredLoans();
        signUpPageEvents.clickNextOnAssets();
        //signUpPageEvents.valueOfVehicles();
        signUpPageEvents.clickNextOnAssets();
        //signUpPageEvents.assetsSavings();
        signUpPageEvents.clickNextOnAssets();
        //signUpPageEvents.otherAssetSavings();
        signUpPageEvents.clickNextOnAssets();
        signUpPageEvents.clickNextOnAssets();
        Thread.sleep(3000);

        //====================================Fixed Expenses==================================//

        //driver.findElements(By.xpath("//label[@class='haveHomeAndContents-yes']"));
        driver.findElements(By.xpath("//label[@class='haveHomeAndContents-no']"));
        signUpPageEvents.clickNextonFixed();

        //============= Gas, Electric, Utilities ============//
        driver.findElement(By.xpath("//label[@class='haveUtilityCosts-yes']"));
       // driver.findElement(By.xpath("//label[@class='haveUtilityCosts-no']"));
        signUpPageEvents.clickNextonFixed();




    }
}
