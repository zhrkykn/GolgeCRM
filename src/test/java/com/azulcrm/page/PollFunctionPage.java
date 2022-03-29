package com.azulcrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollFunctionPage extends BasePage{


    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement closeAllEmployees;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement toBtn;

    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']/a[2]")
    public WebElement employeAndDepartment;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionBtn;

    @FindBy(id = "question_0")
    public WebElement questionBox;

    @FindBy(id = "answer_0__0_")
    public WebElement answer1;

    @FindBy(id = "answer_0__1_")
    public WebElement answer2;

    @FindBy(id = "multi_0")
    public WebElement multiChoice;

    @FindBy(xpath = "//label[@title='Delete question']")
    public WebElement deleteQuestion;

    @FindBy(xpath = "(//label[@title='Delete answer'])[1]")
    public WebElement deleteAnswer1;

    @FindBy(xpath = "(//label[@title='Delete answer'])[2]")
    public WebElement deleteAnswer2;

    @FindBy(xpath = "blog-submit-button-save")
    public WebElement sendBtn;

}
