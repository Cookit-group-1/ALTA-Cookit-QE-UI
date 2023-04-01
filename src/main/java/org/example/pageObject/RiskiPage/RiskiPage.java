package org.example.pageObject.RiskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RiskiPage {
    public static WebDriver webDriver;
    public RiskiPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
}
