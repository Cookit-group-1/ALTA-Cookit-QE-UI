package org.example.pageObject.AdellaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public static WebDriver webDriver;
    public SignUpPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    // Get Click signup button 1st
    @FindBy(css = ".cursor-pointer.font-semibold")
    private WebElement signUp;
    public void clicksignUp(){
        signUp.click();
    }

    @FindBy(css = "[placeholder='username']")
    private  WebElement inputUsername;
    public void inputRegisName(String regis ){
        inputUsername.sendKeys(regis);
    }

    @FindBy(css ="[placeholder='Email']")
    private WebElement emailRegis;
    public void iputEmail(String email){
        emailRegis.sendKeys(email);
    }

    @FindBy(css = "[placeholder='Password']")
    private WebElement inputPassword;
    public void sendInputPassword(String pwd){
        inputPassword.sendKeys(pwd);
    }

    // Get sign up btn 2nd
    @FindBy(css = ".h-8")
    private WebElement getSignUpUp;
    public void clickSignUp(){
        getSignUpUp.click();
    }

    // Get verify user has registered
    @FindBy(xpath = "//h1[@class='font-bold text-3xl']")
    private WebElement verifyRegistered;
    public boolean VerifyAlreadyRegister(){
        verifyRegistered.isDisplayed();
        return true;
    }

    // klik profil
    @FindBy(css=".items-center.hidden .h-0")
    private WebElement logoProfile;
    public void LogoProfile(){
        logoProfile.click();
    }

    @FindBy(css = ".dropdown.hidden [href='/profile/110']")
    private WebElement dropdownProfile;
    public void clickDropdownProfile(){
        dropdownProfile.click();
    }

    @FindBy(css = "h1")
    private WebElement verifyUsers;
    public boolean verifyUserAdella(){
        verifyUsers.isDisplayed();
        return true;
    }




}
