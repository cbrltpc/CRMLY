package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreTabMenu extends BasePage {

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement MoreButton;

    @FindBy(xpath="//*[.=\"Announcement\"]")
    public WebElement AnouncementSub;

    @FindBy(xpath="//*[@id=\"feed-add-post-form-link-text\"]")
    public WebElement AnnouncementTab;

    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]//span/i")
    public WebElement LinkIcon;

    @FindBy(xpath="(//*[@title=\"Upload files\"])[1]]")
    public WebElement UploadFileIcon;

    @FindBy(xpath="//*[@id=\"bx-b-video-blogPostForm\"]/span/i")
    public WebElement CameraIcon;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm\"]/span/i")
    public WebElement QuoteIcon;

    @FindBy(xpath="//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement AddMentionIcon;

    @FindBy(xpath="//*[@id=\"bx-b-tag-input-blogPostForm\"]")
    public WebElement AddTagIcon;

    @FindBy(xpath="//*[@id=\"linkidPostFormLHE_blogPostForm-text\"]i")
    public WebElement LinkTextBox;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement LinkUrlBox;

    @FindBy(xpath="//*[@id=\"undefined\"]")
    public WebElement LinkSaveButton;

    @FindBy(xpath="//*[@id=\"bx-b-tag-input-blogPostForm\"]")
    public WebElement AdddTagIcon;  //güncel degil bos



}
