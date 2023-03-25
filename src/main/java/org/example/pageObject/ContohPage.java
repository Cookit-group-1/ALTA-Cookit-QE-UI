package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContohPage {
    public static WebDriver webDriver;
    public ContohPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement landingPage;

    public boolean verifyLandingPage(){
        landingPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    public void setUsername(String inputUsername){
        username.sendKeys(inputUsername);
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    public void setPassword(String inputPassword){
        password.sendKeys(inputPassword);
    }

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public void clickButton(){
        loginButton.click();
    }

}
