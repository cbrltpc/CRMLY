package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AnnouncementPage extends BasePage{


    @FindBy(xpath="(//*[@class='diskuf-fileUploader wd-test-file-light-inp '])[1]")
    public WebElement UploadFileImages;


    //@FindBy(xpath="//*[@id='feed-add-post-destination-input']")
    //public WebElement AddMore;

    @FindBy(xpath="//*[@id='bx-destination-tag']")
    public WebElement AddMore;


    @FindBy(xpath="//*[.='Employees and departments']")
    public WebElement EmployeesAndDepartments;

    @FindBy(xpath="//*[@id='bx-lm-box-email-content']")
    public WebElement ExitEmployeesAndDepartments;

    @FindBy(xpath= "//*[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> ContactList;

    @FindBy(xpath= "//*[@id=\"feed-add-post-destination-item\"]/span[@data-type='users']")
    public List<WebElement> ExpectedContactList;

    @FindBy(xpath="//div//table//td//input[@placeholder='Link text']")
    public WebElement TextLinkIcon;

    @FindBy(xpath="//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement UrlLinkIcon;


}
