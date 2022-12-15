package main.java.pageEvents;

import main.java.pageObjects.SignUpPageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static main.java.pageObjects.SignUpPageElements.*;

public class SignUpPageEvents {

    public void clickOnSignUponHomePage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonsignup).click();
    }

    public void enterNewEmailAddress(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.newEmailAddress).click();
        elementFetch .getWebElement("XPATH", SignUpPageElements.newEmailAddress).sendKeys("iehub.training22@dynamatix.co.uk");
    }

    public void clickOnSignUponSignUpPage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonSignupBtn).click();
    }

    public void clickOnVerifyButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonVerifyBtn).click();
    }

    public void enterYourNametoSignUp(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.enteryourName).click();
        elementFetch .getWebElement("XPATH", SignUpPageElements.enteryourName).sendKeys("Smruthi");
    }

    public void enterNewPasswordtoSignUp(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.enternewPwd).click();
        elementFetch .getWebElement("XPATH", SignUpPageElements.enternewPwd).sendKeys("Test@123");
    }

    public void reEnterNewPasswordtoSignUp(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.reenternewPwd).click();
        elementFetch .getWebElement("XPATH", SignUpPageElements.reenternewPwd).sendKeys("Test@123");
    }

    public void clickonSubmitBtntoSignUp(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonSubmitBtn).click();
    }

    public void clickonAcceptonTandCPage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonAcceptBtn).click();
    }

          //-----------------------------Profile Entering ------------------------------//

    public void enterLastName(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonlastname).click();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonlastname).sendKeys("David");
    }

    public void clickonNext(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonNextBtn).click();
    }

    public void clickonTitle(){
        ElementFetch elementFetch = new ElementFetch();
       /* elementFetch .getWebElement("ID", SignUpPageElements.clickonTitleBtn1).click();
        /* elementFetch .getWebElement("ID", SignUpPageElements.clickonTitleBtn2).click();*/
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonTitleBtn3).click();     // [Select Any1]
    /*    elementFetch .getWebElement("ID", SignUpPageElements.clickonTitleBtn4).click(); */
    }
    public void clickonAloneorPartner(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", SignUpPageElements.clickonAloneBtn).click();
        //elementFetch .getWebElement("XPATH", SignUpPageElements.clickonWithPartnerBtn).click();//   [Select Any1]
    }

    public void enterBuildingNum(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", SignUpPageElements.enterbuildingno).click();
        elementFetch.getWebElement("XPATH", SignUpPageElements.enterbuildingno).sendKeys("123/45");
    }
    public void enterPostCode(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", SignUpPageElements.enterpostcode).click();
        elementFetch.getWebElement("XPATH", SignUpPageElements.enterpostcode).sendKeys("AB13 0YF");
    }

    public void enterMobileNum(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", SignUpPageElements.entermobileNum).click();
        elementFetch.getWebElement("XPATH", SignUpPageElements.entermobileNum).sendKeys("9876543210");
    }

    public void clickYesorNoforChildren(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", SignUpPageElements.clickYesforchildren).click();
        //elementFetch.getWebElement("XPATH", SignUpPageElements.clickNoforchildren).click();       //[Select Any1]
    }

    //=========================================Income Fields=========================================//

    public void netSalary(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", enternetsalary).click();
        elementFetch.getWebElement("XPATH", enternetsalary).sendKeys("1000");
    }

    public void selectFromDropDown(WebElement element, String value)
    {
        Select drp = new Select(element);
        List<WebElement>alloptions= drp.getOptions();
        for (WebElement option: alloptions)
        {
            if (option.getText().equals(value))
            {
                option.click();
                break;
            }
        }
    }

    public void addNotes(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clickonaddnotes).click();
        elementFetch .getWebElement("XPATH", enternotes).sendKeys("Enter something");

    }

    public void partnerSalary(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", enterpartnersalary).click();
        elementFetch.getWebElement("XPATH", enterpartnersalary).sendKeys("15000");
    }

    public void clickNextOnIncome(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clicknextonIncome).click();
    }

    public void enterOtherEarnings(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherEarnings).click();
        elementFetch .getWebElement("XPATH", enterotherEarnings).sendKeys("10");
    }

    //=============Other Benefits =================//

    public void clickYesorNoonBenefits(){
        ElementFetch elementFetch = new ElementFetch();
       elementFetch .getWebElement("XPATH", clickYesforbenefits). click();
        // elementFetch .getWebElement("XPATH", clickNoforbenefits).click();            //Select anyone//
    }

    public void universalCredit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterUniversalcredit).click();
        elementFetch .getWebElement("XPATH", enterUniversalcredit).sendKeys("10");
    }

    public void jobseekerAllowanceIncome(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", jobseekerallowanceIncome).click();
        elementFetch .getWebElement("XPATH", jobseekerallowanceIncome).sendKeys("100");
    }

    public void jobseekerAllowanceContribution(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", jobseekerallowanceContribution).click();
        elementFetch .getWebElement("XPATH", jobseekerallowanceContribution).sendKeys("10");
    }

    public void enterIncomeSupport(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterincomesupport).click();
        elementFetch .getWebElement("XPATH", enterincomesupport).sendKeys("10");
    }

    public void workingTaxCredit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterworkingTaxCredit).click();
        elementFetch .getWebElement("XPATH", enterworkingTaxCredit).sendKeys("10");
    }

    public void childTaxCredit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildTaxCredit).click();
        elementFetch .getWebElement("XPATH", enterchildTaxCredit).sendKeys("10");
    }

    public void childBenefit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildBenefit).click();
        elementFetch .getWebElement("XPATH", enterchildBenefit).sendKeys("10");
    }

    public void empSupportAllowance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", empsuppportallowance).click();
        elementFetch .getWebElement("XPATH", empsuppportallowance).sendKeys("10");
    }

    public void disabilityBenefit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterdisabilitybenefit).click();
        elementFetch .getWebElement("XPATH", enterdisabilitybenefit).sendKeys("10");
    }
    public void carerAllowance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercarerallowance).click();
        elementFetch .getWebElement("XPATH", entercarerallowance).sendKeys("10");
    }

    public void localHousingAllowanceOrBenefit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", localhousingAllowanceorBenefit).click();
        elementFetch .getWebElement("XPATH", localhousingAllowanceorBenefit).sendKeys("10");
    }

    public void councilTaxSupport(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercouncilTaxsupport).click();
        elementFetch .getWebElement("XPATH", entercouncilTaxsupport).sendKeys("10");
    }

    public void otherBenefitsTaxCredits(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherbenefits).click();
        elementFetch .getWebElement("XPATH", enterotherbenefits).sendKeys("10");
    }

    public void childSupportIncome(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildsupportincome).click();
        elementFetch .getWebElement("XPATH", enterchildsupportincome).sendKeys("10");
    }

    public void boardersOrLodgers(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterBoardersOrLodgers).click();
        elementFetch .getWebElement("XPATH", enterBoardersOrLodgers).sendKeys("10");
    }

    public void dependentContribution(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterdependentContribution).click();
        elementFetch .getWebElement("XPATH", enterdependentContribution).sendKeys("10");
    }

    public void studentLoanOrGrant(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterstudentLoan).click();
        elementFetch .getWebElement("XPATH", enterstudentLoan).sendKeys("10");
    }

    public void moneyFromOtherSource(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entermoneyfromOtherSource).click();
        elementFetch .getWebElement("XPATH", entermoneyfromOtherSource).sendKeys("10");
    }

    public void clickNextonOtherSourceIncome(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clicknextonOthersourceIncome).click();
         }

    //========================================Assets Fields ================================//
    public void totalValueOfProperties(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", entervalueofProperties).click();
        elementFetch .getWebElement("ID", entervalueofProperties).sendKeys("100");
    }

    public void clickNextOnAssets(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clicknextonAssets).click();
    }

    public void outstandingOnMortgage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", entermortgageoutstanding).click();
        elementFetch .getWebElement("ID", entermortgageoutstanding).sendKeys("10");
    }

    public void loanAgainstPropertyAssets(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", enterloanagainstpropertyassets).click();
        elementFetch .getWebElement("ID", enterloanagainstpropertyassets).sendKeys("10");
    }

    public void valueOfVehicles(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", entervalueofVehicles).click();
        elementFetch .getWebElement("ID", entervalueofVehicles).sendKeys("10");
    }

    public void assetsSavings(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", enterassetSavings).click();
        elementFetch .getWebElement("ID", enterassetSavings).sendKeys("10");
    }

    public void otherAssetSavings(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", enterotherAssets).click();
        elementFetch .getWebElement("ID", enterotherAssets).sendKeys("10");
    }

    //===================================== Fixed Expenses Fields ================================//

    public void clickNextonFixed(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clicknextonFixed).click();
    }

    public void enterRent(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterrent).click();
        elementFetch .getWebElement("XPATH", enterrent).sendKeys("10");
    }
    public void enterGroundRent(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entergroundRent).click();
        elementFetch .getWebElement("XPATH", entergroundRent).sendKeys("10");
    }

    public void enterMortgage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entermortgage).click();
        elementFetch .getWebElement("XPATH", entermortgage).sendKeys("10");
    }

    public void enterEndowmentMortgage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterendowmentmortgage).click();
        elementFetch .getWebElement("XPATH", enterendowmentmortgage).sendKeys("10");
    }

    public void loanAgainstPropertyFixed(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterloanagainstPropertyfixed).click();
        elementFetch .getWebElement("XPATH", enterloanagainstPropertyfixed).sendKeys("10");
    }
    public void enterCouncilTax(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercouncilTax).click();
        elementFetch .getWebElement("XPATH", entercouncilTax).sendKeys("10");
    }
    public void enterInstalmentsforHousehold(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterinstalmentsforHousehold).click();
        elementFetch .getWebElement("XPATH", enterinstalmentsforHousehold).sendKeys("10");
    }

    public void enterTvLicense(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entertvlicense).click();
        elementFetch .getWebElement("XPATH", entertvlicense).sendKeys("10");
    }
    public void enterOtherHomeContents(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherHomecontents).click();
        elementFetch .getWebElement("XPATH", enterotherHomecontents).sendKeys("10");
    }

    //============= Gas, Electric, Utilities ============//

    public void enterGas(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entergas).click();
        elementFetch .getWebElement("XPATH", entergas).sendKeys("10");
    }

    public void enterElectricity(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterelectricity).click();
        elementFetch .getWebElement("XPATH", enterelectricity).sendKeys("10");
    }

    public void enterCoalFuels(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercoalfuels).click();
        elementFetch .getWebElement("XPATH", entercoalfuels).sendKeys("10");
    }

    public void enterWaterSupply(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterwatersupply).click();
        elementFetch .getWebElement("XPATH", enterwatersupply).sendKeys("10");
    }

    public void enterWaterWaste(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterwaterwaste).click();
        elementFetch .getWebElement("XPATH", enterwaterwaste).sendKeys("10");
    }

    public void enterOtherUtilities(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherutilities).click();
        elementFetch .getWebElement("XPATH", enterotherutilities).sendKeys("10");
    }

    //============= Childcare, Adultcare, Dental, Healthcare, etc============//

    public void enterChildCare(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildcare).click();
        elementFetch .getWebElement("XPATH", enterchildcare).sendKeys("10");
    }

    public void enterAdultCare(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enteradultcare).click();
        elementFetch .getWebElement("XPATH", enteradultcare).sendKeys("10");
    }

    public void enterChildSupportFixed(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildsupportfixed).click();
        elementFetch .getWebElement("XPATH", enterchildsupportfixed).sendKeys("10");
    }

    public void enterPrescriptions(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterprescriptions).click();
        elementFetch .getWebElement("XPATH", enterprescriptions).sendKeys("10");
    }

    public void enterDentalCosts(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterdentalcost).click();
        elementFetch .getWebElement("XPATH", enterdentalcost).sendKeys("10");
    }

    public void enterOtherHealthCare(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherhealthcare).click();
        elementFetch .getWebElement("XPATH", enterotherhealthcare).sendKeys("10");
    }

    public void enterPublicTransport(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterpublictransport).click();
        elementFetch .getWebElement("XPATH", enterpublictransport).sendKeys("10");
    }

    public void enterHirePurchase(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterhirepurchase).click();
        elementFetch .getWebElement("XPATH", enterhirepurchase).sendKeys("10");
    }

    public void enterCarPurchase(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercarpurchase).click();
        elementFetch .getWebElement("XPATH", entercarpurchase).sendKeys("10");
    }

    public void enterRoadTax(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterroadtax).click();
        elementFetch .getWebElement("XPATH", enterroadtax).sendKeys("10");
    }

    public void enterVehicleMOT(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entervehicleMOT).click();
        elementFetch .getWebElement("XPATH", entervehicleMOT).sendKeys("10");
    }

    public void enterBreakDownCover(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterbreakdowncover).click();
        elementFetch .getWebElement("XPATH", enterbreakdowncover).sendKeys("10");
    }

    public void enterFuelTollCharges(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterfueltollcharges).click();
        elementFetch .getWebElement("XPATH", enterfueltollcharges).sendKeys("10");
    }

    public void enterOtherTransport(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterothertransport).click();
        elementFetch .getWebElement("XPATH", enterothertransport).sendKeys("10");
    }

    //================ School Related costs for Children ================//

    public void enterSchoolUniforms(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterschooluniforms).click();
        elementFetch .getWebElement("XPATH", enterschooluniforms).sendKeys("10");
    }
    public void enterSchoolClubs(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterschoolclubs).click();
        elementFetch .getWebElement("XPATH", enterschoolclubs).sendKeys("10");
    }
    public void enterOtherSchoolCosts(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherSchoolcosts).click();
        elementFetch .getWebElement("XPATH", enterotherSchoolcosts).sendKeys("10");
    }

    //========== Pensions, Insurance, Building & Contents ===========//
    public void enterPension(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterpension).click();
        elementFetch .getWebElement("XPATH", enterpension).sendKeys("10");
    }
    public void enterLifeInsurance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterlifeinsurance).click();
        elementFetch .getWebElement("XPATH", enterlifeinsurance).sendKeys("10");
    }

    public void enterMortgagePaymentProtection(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entermortgagepaymentprotection).click();
        elementFetch .getWebElement("XPATH", entermortgagepaymentprotection).sendKeys("10");
    }

    public void enterBuildingContents(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterbuildingandcontents).click();
        elementFetch .getWebElement("XPATH", enterbuildingandcontents).sendKeys("10");
    }

    public void enterHealthInsurance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterhealthinsurance).click();
        elementFetch .getWebElement("XPATH", enterhealthinsurance).sendKeys("10");
    }

    public void enterOtherPensionCosts(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherpensioncosts).click();
        elementFetch .getWebElement("XPATH", enterotherpensioncosts).sendKeys("10");
    }

    //============ Professional Courses, Fees and Union Fees ==============//

    public void enterProfessionalCourses(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterprofessionalcourses).click();
        elementFetch .getWebElement("XPATH", enterprofessionalcourses).sendKeys("10");
    }

    public void enterUnionFees(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterunionfees).click();
        elementFetch .getWebElement("XPATH", enterunionfees).sendKeys("10");
    }

    public void enterProfessionalFees(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterprofessionalfees).click();
        elementFetch .getWebElement("XPATH", enterprofessionalfees).sendKeys("10");
    }

    public void enterOtherProfessionExpenses(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherprofessionexpenses).click();
        elementFetch .getWebElement("XPATH", enterotherprofessionexpenses).sendKeys("10");
    }

    //============ Other Expenses ==============//

    public void enterOtherFixedExpenses(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherfixedexpenses).click();
        elementFetch .getWebElement("XPATH", enterotherfixedexpenses).sendKeys("10");
    }

    //======================================= Flexible Expenses ===========================================//

}