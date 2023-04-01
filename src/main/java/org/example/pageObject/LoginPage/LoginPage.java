package org.example.pageObject.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.naming.ldap.PagedResultsControl;

public class LoginPage {
    public static WebDriver webDriver;
    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//h1[@class='text-2xl 2xl:text-3xl font-bold text-orange-500']")
    private WebElement landingPage;

    public boolean verifyLandingPage(){
        landingPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[@class='lg:w-32 px-4 py-2 lg:py-3 text-orange-500 bg-white border2 md:font-bold 2xl:font-bold 2xl:text-xl rounded-md text-center']")
    private WebElement signButton;

    public void setSignButton(){
        signButton.click();
    }

    @FindBy(css = "[placeholder='Username']")
    private WebElement username;

    public void setUsername(String inputUsername){
        username.sendKeys(inputUsername);
    }

    @FindBy(css = "[placeholder='Password']")
    private WebElement password;

    public void setPassword(String inputPassword){
        password.sendKeys(inputPassword);
    }

    @FindBy(xpath = "//button[@class='w-full md:w-96 lg:w-full h-8 my-5 rounded-lg text-white font-semibold bg-orange-500']")
    private WebElement loginButton;

    public void setLoginButton(){
        loginButton.click();
    }

    @FindBy(xpath = "//button[@class='font-bold hidden sm:flex sm:text-sm lg:font-semibold lg:text-4xl']")
    private WebElement dashboard;

    public boolean verifyDashboard(){
        dashboard.isDisplayed();
        return true;
    }
}
