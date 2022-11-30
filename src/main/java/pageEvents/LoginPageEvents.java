package main.java.pageEvents;

import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;

public class LoginPageEvents {

    public void enterUserName(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", LoginPageElements.username).sendKeys("smruthi.kandukuri@dynamatix.com");
    }

    public void enterPassword(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("ID", LoginPageElements.password).sendKeys("Test@123");

    }

    public void clickOnshowPassword(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.showPassword).click();
    }

    public void clickOnLoginButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch .getWebElement("XPATH", LoginPageElements.logInButton).click();

    }
}
