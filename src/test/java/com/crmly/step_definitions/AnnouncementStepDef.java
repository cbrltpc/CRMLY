package com.crmly.step_definitions;

import com.crmly.pages.AnnouncementPage;
import com.crmly.pages.LoginPage;
import com.crmly.pages.MoreTabMenu;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class AnnouncementStepDef {
    @Given("the user logged in")
    public void theUserLoggedIn() {

      new LoginPage().login(ConfigurationReader.get("hr_username"), ConfigurationReader.get("password"));

    }

    @When("the user navigate to announcement tab under more button")
    public void theUserNavigateToAnnouncementTabUnderMoreButton() {

        MoreTabMenu moreTabMenu =new MoreTabMenu();

        moreTabMenu.MoreButton.click();

        moreTabMenu.AnouncementSub.click();



    }

    @And("the user click {string} icon")
    public void theUserClickIcon(String str) {


       Driver.get().findElement(By.xpath("//*[@title='"+str+"']")).click();




    }

    @Then("the user should be able to upload file.")
    public void theUserShouldBeAbleToUploadFile() {

        new AnnouncementPage().UploadFileImages.sendKeys(System.getProperty("user.dir")+"/"+"src/test/resources/file.txt");

        String text = Driver.get().findElement(By.xpath("//*[@title=\"Click to insert file\"]")).getText();

        Assert.assertTrue(text.contains("file"));

    }

    @And("the user click Add more text")
    public void theUserClickAddMoreText() {

        BrowserUtils.waitFor(2);

        new AnnouncementPage().AddMore.click();
        new AnnouncementPage().EmployeesAndDepartments.click();


        for (int i = 0; i < (new AnnouncementPage().ContactList.size())-(new AnnouncementPage().ContactList.size()-2); i++) {
            new AnnouncementPage().ContactList.get(i).click();

        }
        System.out.println(new AnnouncementPage().ContactList.size());
        System.out.println(new AnnouncementPage().ExpectedContactList.size());



    }

    @Then("the user should be able to select contact from Employees and Departments lists.")
    public void theUserShouldBeAbleToSelectContactFromEmployeesAndDepartmentsLists() {

        List<String>  actualContacts = BrowserUtils.getElementsText(new AnnouncementPage().ContactList.subList(0,2));
        List<String> expectedContacts = BrowserUtils.getElementsText(new AnnouncementPage().ExpectedContactList);
        Assert.assertEquals(expectedContacts, actualContacts);

    }

    @Then("User should be able to attach a link by clicking on the link icon.")
    public void userShouldBeAbleToAttachALinkByClickingOnTheLinkIcon() {

        new AnnouncementPage().TextLinkIcon.sendKeys("Berlin");
        new AnnouncementPage().UrlLinkIcon.sendKeys("https://www.berlin.de/");
        new AnnouncementPage().UrlLinkIcon.sendKeys(Keys.ENTER);


        BrowserUtils.waitFor(2);
        Driver.get().switchTo().frame(0);
        WebElement Link = Driver.get().findElement(By.xpath("/html/body/a"));

        Assert.assertEquals(Link.getAttribute("href"), "https://www.berlin.de/" );
        Assert.assertEquals(Link.getText(), "Berlin" );




    }

    @Then("User should be able to insert videos by clicking on the video icon")
    public void userShouldBeAbleToInsertVideosByClickingOnTheVideoIcon() {
        String youTubeLink = "https://www.youtube.com/watch?v=L3wKzyIN1yk";
        Driver.get().findElement(By.xpath("//*[@id=\"video_idPostFormLHE_blogPostForm-source\"]")).sendKeys(youTubeLink);

        Driver.get().findElement(By.xpath("//input[@value='Save']")).click();

       // String notFound = Driver.get().findElement(By.xpath("//*[@id=\"bx-admin-prefix\"]/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td/span")).getText();
       // System.out.println(notFound);
       // Driver.get().switchTo().frame(0);
        //WebElement expected = Driver.get().findElement(By.xpath("/html/body"));

        //Assertion kaldi?????

        WebElement inputBox = Driver.get().findElement(By.xpath("//*[@id=\"bxed_idPostFormLHE_blogPostForm\"]"));



        Assert.assertTrue(inputBox.getAttribute("value").contains(youTubeLink));

    }

    @Then("User should be able to create a quote by clicking on the Comma icon.")
    public void userShouldBeAbleToCreateAQuoteByClickingOnTheCommaIcon() {


        Driver.get().switchTo().frame(0);

        System.out.println(Driver.get().findElements(By.xpath("/html/body//blockquote")).size());

        Assert.assertTrue(Driver.get().findElements(By.xpath("/html/body//blockquote")).size()>0);


    }
    @When("the user click to select contact from Employees and Departments lists.")
    public void theUserClickToSelectContactFromEmployeesAndDepartmentsLists() {



        Driver.get().findElement(By.xpath("//div/a[@hidefocus='true']")).click();

        Driver.get().findElement(By.xpath("//*[@class='bx-finder-box-tabs-content-table']//span/a")).click();

    }

    @Then("User should be able to add mention by clicking on the Add mention icon.")
    public void userShouldBeAbleToAddMentionByClickingOnTheAddMentionIcon() {
        Driver.get().switchTo().frame(0);
        Assert.assertTrue(Driver.get().findElement(By.xpath("//body//span")).getText().contains("@cybertekschool.com"));


    }



}
