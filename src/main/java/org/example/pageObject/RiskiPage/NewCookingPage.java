package org.example.pageObject.RiskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCookingPage {
    public static WebDriver webDriver;
    public NewCookingPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "[d='M19 3H5a2 2 0 00-2 2v14a2 2 0 002 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-2 10h-4v4h-2v-4H7v-2h4V7h2v4h4v2z']")
    private WebElement addNewButton;

    public void clickAddNewButton(){

    }

    @FindBy(xpath = "//button[@class='btn btn-primary rounded-full']")
    private WebElement newCooking;
}
