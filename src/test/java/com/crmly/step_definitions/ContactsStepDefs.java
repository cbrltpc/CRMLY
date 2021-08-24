package com.crmly.step_definitions;

import com.crmly.pages.MoreTabMenu;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsStepDefs {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equals("helpdesk")){
            username = ConfigurationReader.get("hr_username");
            password = ConfigurationReader.get("password");
        }else if(userType.equals("humanResource")){
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("password");
        }else if(userType.equals("marketing")){
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("password");
        }

        new LoginPage().login(username,password);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new MoreTabMenu().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
    }


    @Then("user able to see {string} tab")
    public void userAbleToSeeTab(String more) {

       // Assert.assertTrue(moreButton.//is clikable vs);



    }
}
