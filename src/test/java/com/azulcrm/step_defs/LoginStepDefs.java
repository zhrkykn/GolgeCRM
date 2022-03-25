package com.azulcrm.step_defs;

import com.azulcrm.page.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user enter valid credentials")
    public void user_enter_valid_credentials() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForPageToLoad(5);
        loginPage.nameLogin.sendKeys(ConfigurationReader.get("helpdesk"));
        loginPage.passwordLogin.sendKeys(ConfigurationReader.get("helpdeskpass"));
    }

    @When("user click submit for Login")
    public void user_click_submit_for_Login() {
        loginPage.submitLogin.click();
        BrowserUtils.waitFor(1);
    }

    @Then("user should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {
        String title = Driver.get().getTitle();
        Assert.assertTrue("Verify that title is true",title.contains("Portal"));

    }

}
