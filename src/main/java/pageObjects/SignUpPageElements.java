package main.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static test.java.BaseTest.driver;

public interface SignUpPageElements {

    String clickonsignup = "//button[text()='Sign Up']";
    String newEmailAddress = "//input[@name='signUpEmail']";
    String clickonSignupBtn = "//button[text()='SIGN UP']";
    String clickonVerifyBtn = "//button[text()='VERIFY']";
    String enteryourName = "//input[@name='name']";
    String enternewPwd = "//input[@name='pw1']";
    String reenternewPwd = "//input[@name='pw2']";
    String clickonSubmitBtn = "//button[text()='SUBMIT']";
    String clickonAcceptBtn = "//button[text()='Accept']";


    //-----------------------------Profile Entering---------------------------------//

    String clickonlastname = "lname";
    String clickonNextBtn = "//button[text()='Next ']";
    String clickonTitleBtn1 = "mr";
    String clickonTitleBtn2 = "ms";
    String clickonTitleBtn3 = "//label[text()='Miss']";
    String clickonTitleBtn4 = "mrs";
    String clickonAloneBtn = "//label[text()='ALONE']";
    String clickonWithPartnerBtn = "//label[text()='WITH PARTNER']";
    String enterbuildingno = "//input[@name='buildingNumber']";
    String enterpostcode = "//input[@name='postCode']";
    String entermobileNum = "//input[@name='mobileNumber']";
    String clickYesforchildren = "//label[text()='YES']";
    String clickNoforchildren = "//label[text()='NO']";
    String clickYesforvehicles = "(//label[text()='YES'])[1]";
    String clickNoforvehicles = "(//label[text()='NO'])[1]";

    //========================================Income Fields====================================//

    String enternetsalary = "//input[@name='basicIncome']";
    WebElement selectfrequency = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
    String enterpartnersalary= "//input[@name='debtor2BasicIncome']";

    String clicknextonIncome = "(//button[@class='wizard-btn btn-fill wizard-btn-wd btn-for-img'])[1]";
    String clickonaddnotes = "(//button[@class='btn btn-default btn-dynamatrix custom-btn'])[1]";
    String enternotes = "(//textarea[@placeholder='Enter Notes'])[1]";
    String enterotherEarnings = "//input[@name='otherSalaryWages1']";

    //======================Other Benefits ======================//
    String clickYesforbenefits = "//input[@id='btc-yes']";
    String clickNoforbenefits = "//input[@id='btc-no']";
    String enterUniversalcredit = "//input[@name='otherIncludeUniversalCredit']";
    String jobseekerallowanceIncome = "//input[@name='jobseekerAllowanceIncome']";
    String jobseekerallowanceContribution= "//input[@name='jobseekerAllowanceContribute']";
    String enterincomesupport = "//input[@name='incomeSupport']";
    String enterworkingTaxCredit = "//input[@name='workingTaxCredit']";
    String enterchildTaxCredit ="//input[@name='childTaxCredit']";
    String enterchildBenefit = "//input[@name='childBenefit']";
    String empsuppportallowance = "//input[@name='empsupportallowancestatutory']";
    String enterdisabilitybenefit = "//input[@name='dlaPipAttendanceAllowance']";
    String entercarerallowance = "//input[@name='carerAllowance']";
    String localhousingAllowanceorBenefit = "//input[@name='housingbenefitlocalallowance']";
    String entercouncilTaxsupport = "//input[@name='councilTaxReduction']";
    String enterotherbenefits = "//input[@name='otherBenefits']";

    //====================Other Income================//

    String clickYesforotherIncome = "other-income-yes";
    String clickNoforotherIncome = "other-income-no";
    String enterchildsupport = "(//input[@class='form-control checknegativenumber '])[8]";
    String enterBoardersOrLodgers = "(//input[@class='form-control checknegativenumber '])[9]";

    String enterdependentContribution = "(//input[@class='form-control checknegativenumber '])[10]";
    String enterstudentLoan = "(//input[@class='form-control checknegativenumber '])[11]";
    String entermoneyfromOtherSource = "(//input[@class='form-control checknegativenumber '])[12]";

    //============================================Assets Fields =======================================//
    String entervalueofProperties = "totalValueProperties";
    String clicknextonAssets = "(//button[@class='wizard-btn btn-fill wizard-btn-wd btn-for-img'])[2]";
    String entermortgageoutstanding = "mortgageOutstanding";
    String enterloansoutstanding = "securedLoanOutstanding";
    String entervalueofVehicles = "valueOfVehicles";
    String enterassetSavings = "assetSavings";
    String enterotherAssets = "otherAssets";

    //======================================== Fixed Expenses ========================================//

    String clicknextonFixed = "(//button[@class='wizard-btn btn-fill wizard-btn-wd btn-for-img'])[3]";
    String enterrent = "";


}
