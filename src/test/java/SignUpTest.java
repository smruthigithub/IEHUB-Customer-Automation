package test.java;

import main.java.pageEvents.SignUpPageEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static main.java.pageObjects.SignUpPageElements.selectfrequency;

public class SignUpTest extends BaseTest {

    @Test
    public void methodToSignUp() throws InterruptedException {
        SignUpPageEvents signUpPageEvents = new SignUpPageEvents();
        signUpPageEvents.clickOnSignUponHomePage();
        signUpPageEvents.enterNewEmailAddress();
        signUpPageEvents.clickOnSignUponSignUpPage();
        Thread.sleep(15000);
        signUpPageEvents.clickOnVerifyButton();
        signUpPageEvents.enterYourNametoSignUp();
        signUpPageEvents.enterNewPasswordtoSignUp();
        signUpPageEvents.reEnterNewPasswordtoSignUp();
        signUpPageEvents.clickonSubmitBtntoSignUp();
        signUpPageEvents.clickonAcceptonTandCPage();

            //----------------------------------Profile Entering---------------------------//

        WebElement enterlastName = driver.findElement(By.id("lname"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", enterlastName);
        enterlastName.sendKeys("Grace");
        signUpPageEvents.clickonNext();
        signUpPageEvents.clickonTitle();     //Can change the Title in signUpPageEvents before Running//
        signUpPageEvents.clickonNext();
        signUpPageEvents.clickonAloneorPartner();   //Can change it in signUpPageEvents before Running//
        signUpPageEvents.clickonNext();
      /*  signUpPageEvents.selectValuefromDropDown();
        signUpPageEvents.selectValuefromDropDown();*/
        Select selectdate = new Select(driver.findElement(By.xpath("//select[@name='debtor1Date']")));
        selectdate.selectByVisibleText("28");
        Thread.sleep(5000);
        Select selectmonth = new Select(driver.findElement(By.xpath("//select[@name='debtor1Month']")));
        selectmonth.selectByVisibleText("October");
        Thread.sleep(5000);
        Select selectyear = new Select(driver.findElement(By.xpath("//select[@name='debtor1Year']")));
        selectyear.selectByVisibleText("1999");
        Thread.sleep(5000);
        signUpPageEvents.clickonNext();
        signUpPageEvents.enterBuildingNum();
        signUpPageEvents.enterPostCode();
        signUpPageEvents.clickonNext();
        Select residentialStatus = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[1]")));
        residentialStatus.selectByVisibleText("Owner without mortgage");
        /*residentialStatus.selectByVisibleText("Owner with mortgage");
        residentialStatus.selectByVisibleText("Living with parents");            //Select anyone//
        residentialStatus.selectByVisibleText("Tenant - Private");
        residentialStatus.selectByVisibleText("Tenant - Social");
        residentialStatus.selectByVisibleText("Other");*/
        signUpPageEvents.clickonNext();
        signUpPageEvents.enterMobileNum();
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
        signUpPageEvents.clickYesorNoforChildren();        //Can change the Title in signUpPageEvents before Running//
        signUpPageEvents.clickonNext();

        /* ====================Select if there are Children Below 16 ===============================*/

        Select childrenBelow16 = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[3]")));
        childrenBelow16.selectByVisibleText("3");                        //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();

        /* ====================Select if Children Between 16 and 18===============================*/

        Select childrenBetween16And18 = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[4]")));
        childrenBetween16And18.selectByVisibleText("3");                        //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();

        Select dependentAdults = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[3]")));
        dependentAdults.selectByVisibleText("3");                       //Select anyone from 0 to 10//
        signUpPageEvents.clickonNext();

        /*===================Do u own any vehicles written here directly due to Exception=============*/

        driver.findElements(By.xpath("(//label[text()='YES'])[1]")); //YES for VEHICLES//
       // driver.findElements(By.xpath("(//label[text()='NO'])[2]"));    //NO for VEHICLES//
        signUpPageEvents.clickonNext();
        /*Select numberOfVehicles = new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[6]")));
        numberOfVehicles.selectByVisibleText("2");*/                        //Select anyone from 0 to 10//
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

        signUpPageEvents.netSalary();
        signUpPageEvents.selectFromDropDown(selectfrequency, "4-Weeks");
        signUpPageEvents.addNotes();
        Thread.sleep(3000);
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.partnerSalary();
        signUpPageEvents.selectFromDropDown(selectfrequency, "Month");
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.clickNextOnIncome(); //On Other Earnings//
        Thread.sleep(3000);

        //================Other Benefits===================//

        driver.findElement(By.id("btc-yes"));  //YES FOR BENEFITS//
        driver.findElement(By.id("btc-no"));   //NO FOR BENEFITS//
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.universalCredit();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.jobseekerAllowanceIncome();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.jobseekerAllowanceContribution();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.enterIncomeSupport();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.workingTaxCredit();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.childTaxCredit();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.childBenefit();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.empSupportAllowance();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.disabilityBenefit();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.carerAllowance();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.localHousingAllowanceOrBenefit();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.councilTaxSupport();
        signUpPageEvents.clickNextOnIncome();
        signUpPageEvents.otherBenefitsTaxCredits();
        signUpPageEvents.clickNextOnIncome();

    }

}
