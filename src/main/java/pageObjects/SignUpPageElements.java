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

    String clickonlastname = "//input[@id='lname']";
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
    String clicknextonIncome = "(//div[@class='wizard-footer-right text-center']/div/button)[1]";
    String clicknextonOthersourceIncome = "(//div[@class='wizard-footer-right text-center']/button)";
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
    String enterchildsupportincome = "(//input[@class='form-control checknegativenumber '])[8]";
    String enterBoardersOrLodgers = "(//input[@class='form-control checknegativenumber '])[9]";

    String enterdependentContribution = "(//input[@class='form-control checknegativenumber '])[10]";
    String enterstudentLoan = "(//input[@class='form-control checknegativenumber '])[11]";
    String entermoneyfromOtherSource = "(//input[@class='form-control checknegativenumber '])[12]";

    //============================================Assets Fields =======================================//
    String entervalueofProperties = "totalValueProperties";
    String clicknextonAssets = "(//button[@class='wizard-btn btn-fill wizard-btn-wd btn-for-img'])[2]";
    String entermortgageoutstanding = "mortgageOutstanding";
    String enterloanagainstpropertyassets = "securedLoanOutstanding";
    String entervalueofVehicles = "valueOfVehicles";
    String enterassetSavings = "assetSavings";
    String enterotherAssets = "otherAssets";

    //======================================== Fixed Expenses ========================================//

    String clicknextonFixed = "(//button[@class='wizard-btn btn-fill wizard-btn-wd btn-for-img'])[3]";
    String enterrent = "(//input[@class='form-control checknegativenumber'])[9]";
    String entergroundRent = "(//input[@class='form-control checknegativenumber'])[10]";
    String entermortgage = "(//input[@class='form-control checknegativenumber'])[11]";
    String enterendowmentmortgage = "(//input[@class='form-control checknegativenumber'])[12]";
    String enterloanagainstPropertyfixed = "(//input[@class='form-control checknegativenumber'])[13]";
    String entercouncilTax = "(//input[@class='form-control checknegativenumber'])[14]";
    String enterinstalmentsforHousehold = "(//input[@class='form-control checknegativenumber'])[15]";
    String entertvlicense = "(//input[@class='form-control checknegativenumber'])[16]";
    String enterotherHomecontents = "(//input[@class='form-control checknegativenumber'])[17]";


    //============= Gas, Electric, Utilities ============//

    String entergas = "(//input[@class='form-control checknegativenumber'])[18]";
    String enterelectricity = "(//input[@class='form-control checknegativenumber'])[19]";
    String entercoalfuels = "(//input[@class='form-control checknegativenumber'])[20]";
    String enterwatersupply = "(//input[@class='form-control checknegativenumber'])[21]";
    String enterwaterwaste = "(//input[@class='form-control checknegativenumber'])[22]";
    String enterotherutilities = "(//input[@class='form-control checknegativenumber'])[23]";


    //============= Childcare, Adultcare, Dental, Healthcare, etc============//

    String enterchildcare = "(//input[@class='form-control checknegativenumber'])[24]";
    String enteradultcare = "(//input[@class='form-control checknegativenumber'])[25]";
    String enterchildsupportfixed = "(//input[@class='form-control checknegativenumber'])[26]";
    String enterprescriptions = "(//input[@class='form-control checknegativenumber'])[27]";
    String enterdentalcost = "(//input[@class='form-control checknegativenumber'])[28]";
    String enterotherhealthcare = "(//input[@class='form-control checknegativenumber'])[29]";
    String enterpublictransport = "(//input[@class='form-control checknegativenumber'])[30]";
    String enterhirepurchase = "(//input[@class='form-control checknegativenumber'])[31]";
    String entercarpurchase = "(//input[@class='form-control checknegativenumber'])[32]";
    String enterroadtax = "(//input[@class='form-control checknegativenumber'])[33]";
    String entervehicleMOT = "(//input[@class='form-control checknegativenumber'])[34]";
    String enterbreakdowncover = "(//input[@class='form-control checknegativenumber'])[35]";
    String enterfueltollcharges = "(//input[@class='form-control checknegativenumber'])[36]";
    String enterothertransport = "(//input[@class='form-control checknegativenumber'])[37]";

    //================ School Related costs for Children ================//

    String enterschooluniforms = "(//input[@class='form-control checknegativenumber'])[38]";
    String enterschoolclubs = "(//input[@class='form-control checknegativenumber'])[39]";
    String enterotherSchoolcosts = "(//input[@class='form-control checknegativenumber'])[40]";

    //========== Pensions, Insurance, Building & Contents ===========//

    String enterpension = "(//input[@class='form-control checknegativenumber'])[41]";
    String enterlifeinsurance = "(//input[@class='form-control checknegativenumber'])[42]";
    String entermortgagepaymentprotection = "(//input[@class='form-control checknegativenumber'])[43]";
    String enterbuildingandcontents = "(//input[@class='form-control checknegativenumber'])[44]";
    String enterhealthinsurance = "(//input[@class='form-control checknegativenumber'])[45]";
    String enterotherpensioncosts = "(//input[@class='form-control checknegativenumber'])[46]";

    //============ Professional Courses, Fees and Union Fees ==============//

    String enterprofessionalcourses = "(//input[@class='form-control checknegativenumber'])[47]";
    String enterunionfees = "(//input[@class='form-control checknegativenumber'])[48]";
    String enterprofessionalfees = "(//input[@class='form-control checknegativenumber'])[49]";
    String enterotherprofessionexpenses = "(//input[@class='form-control checknegativenumber'])[50]";

    //============ Other Expenses ==============//
    String enterotherfixedexpenses = "(//input[@class='form-control checknegativenumber'])[51]";

    //======================================= Flexible Expenses ===========================================//






}
