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
        elementFetch .getWebElement("XPATH", SignUpPageElements.newEmailAddress).sendKeys("iehub.training12@dynamatix.co.uk");
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
        elementFetch .getWebElement("ID", SignUpPageElements.clickonlastname).click();
        elementFetch .getWebElement("ID", SignUpPageElements.clickonlastname).sendKeys("David");
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

    //=========================================Income Fields =========================================//

    public void netSalary(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", enternetsalary). click();
        elementFetch.getWebElement("XPATH", enternetsalary).sendKeys("10000");
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
       // elementFetch .getWebElement("XPATH", enterotherEarnings).sendKeys("100");
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
        elementFetch .getWebElement("XPATH", enterUniversalcredit).sendKeys("100");
    }

    public void jobseekerAllowanceIncome(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", jobseekerallowanceIncome).click();
        elementFetch .getWebElement("XPATH", jobseekerallowanceIncome).sendKeys("100");
    }

    public void jobseekerAllowanceContribution(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", jobseekerallowanceContribution).click();
        elementFetch .getWebElement("XPATH", jobseekerallowanceContribution).sendKeys("100");
    }

    public void enterIncomeSupport(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterincomesupport).click();
        elementFetch .getWebElement("XPATH", enterincomesupport).sendKeys("100");
    }

    public void workingTaxCredit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterworkingTaxCredit).click();
        elementFetch .getWebElement("XPATH", enterworkingTaxCredit).sendKeys("100");
    }

    public void childTaxCredit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildTaxCredit).click();
        elementFetch .getWebElement("XPATH", enterchildTaxCredit).sendKeys("100");
    }

    public void childBenefit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildBenefit).click();
        elementFetch .getWebElement("XPATH", enterchildBenefit).sendKeys("100");
    }

    public void empSupportAllowance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", empsuppportallowance).click();
        elementFetch .getWebElement("XPATH", empsuppportallowance).sendKeys("100");
    }

    public void disabilityBenefit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterdisabilitybenefit).click();
        elementFetch .getWebElement("XPATH", enterdisabilitybenefit).sendKeys("100");
    }
    public void carerAllowance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercarerallowance).click();
        elementFetch .getWebElement("XPATH", entercarerallowance).sendKeys("100");
    }

    public void localHousingAllowanceOrBenefit(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", localhousingAllowanceorBenefit).click();
        elementFetch .getWebElement("XPATH", localhousingAllowanceorBenefit).sendKeys("100");
    }

    public void councilTaxSupport(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entercouncilTaxsupport).click();
        elementFetch .getWebElement("XPATH", entercouncilTaxsupport).sendKeys("100");
    }

    public void otherBenefitsTaxCredits(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterotherbenefits).click();
        elementFetch .getWebElement("XPATH", enterotherbenefits).sendKeys("100");
    }

    public void childSupportOrMaintenance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterchildsupport).click();
        elementFetch .getWebElement("XPATH", enterchildsupport).sendKeys("100");
    }

    public void boardersOrLodgers(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterBoardersOrLodgers).click();
        elementFetch .getWebElement("XPATH", enterBoardersOrLodgers).sendKeys("100");
    }

    public void dependentContribution(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterdependentContribution).click();
        elementFetch .getWebElement("XPATH", enterdependentContribution).sendKeys("100");
    }

    public void studentLoanOrGrant(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", enterstudentLoan).click();
        elementFetch .getWebElement("XPATH", enterstudentLoan).sendKeys("100");
    }

    public void moneyFromOtherSource(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", entermoneyfromOtherSource).click();
        elementFetch .getWebElement("XPATH", entermoneyfromOtherSource).sendKeys("100");
    }

    //========================================Assets Fields ================================//
    public void totalValueOfProperties(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", entervalueofProperties).click();
        elementFetch .getWebElement("ID", entervalueofProperties).sendKeys("1000");
    }

    public void clickNextOnAssets(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clicknextonAssets).click();
    }

    public void outstandingOnMortgage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", entermortgageoutstanding).click();
        elementFetch .getWebElement("ID", entermortgageoutstanding).sendKeys("100");
    }

    public void outstandingOnSecuredLoans(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", enterloansoutstanding).click();
        elementFetch .getWebElement("ID", enterloansoutstanding).sendKeys("100");
    }

    public void valueOfVehicles(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", entervalueofVehicles).click();
        elementFetch .getWebElement("ID", entervalueofVehicles).sendKeys("100");
    }

    public void assetsSavings(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", enterassetSavings).click();
        elementFetch .getWebElement("ID", enterassetSavings).sendKeys("100");
    }

    public void otherAssetSavings(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", enterotherAssets).click();
        elementFetch .getWebElement("ID", enterotherAssets).sendKeys("100");
    }

    //===================================== Fixed Expenses Fields ================================//

    public void clickNextonFixed(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", clicknextonFixed).click();
    }

}