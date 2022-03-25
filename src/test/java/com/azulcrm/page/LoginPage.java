package com.azulcrm.page;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement nameLogin;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordLogin;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitLogin;




   public void Login(){
       nameLogin.sendKeys(ConfigurationReader.get("helpdesk"));
       passwordLogin.sendKeys(ConfigurationReader.get("helpdeskpass"));
       BrowserUtils.waitFor(1);
       submitLogin.click();
   }
}

