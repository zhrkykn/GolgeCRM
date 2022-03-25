package com.azulcrm.page;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//span[@class='sitemap-menu-lines']")
    public WebElement hamburger;


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
    public void hamburgerMenu(String catalogName, String menuName){
        hamburger.click();
        BrowserUtils.waitFor(1);
        String path = "//div[@class='sitemap-section']/a[contains(text(),'"+catalogName+
                "')]/../div/a[contains(text(),'"+menuName+"')]";
        System.out.println(path);
        Driver.get().findElement(By.xpath(path)).click();
        BrowserUtils.waitFor(3);


    }
}
