package com.azulcrm.page;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public abstract class BasePage {
    @FindBy(xpath = "//a[@class='menu-item-link']")
    public List<WebElement> leftSideMenu;
    @FindBy(xpath = "//span[contains(text(),'More')]")
    public WebElement more;

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }
    public void nav(String leftMenuName){
        more.click();
        BrowserUtils.waitFor(2);
        for (WebElement s : leftSideMenu) {
            if(s.getText().equalsIgnoreCase(leftMenuName)){
                s.click();
                break;
            }
        }
        BrowserUtils.waitForPageToLoad(5);


    }
}
