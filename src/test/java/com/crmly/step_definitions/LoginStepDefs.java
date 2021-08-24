package com.crmly.step_definitions;

import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {


    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {

        new LoginPage().login(ConfigurationReader.get("hr_username"),ConfigurationReader.get("password"));
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);

        Assert.assertEquals("https://qa.crmly.net/stream/?login=yes",Driver.get().getCurrentUrl());


    }
}
