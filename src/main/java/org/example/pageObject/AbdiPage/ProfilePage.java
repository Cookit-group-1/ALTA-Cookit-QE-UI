package org.example.pageObject.AbdiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public static WebDriver webDriver;
    public ProfilePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//div[@class='hidden  sm:flex items-center gap-2 hover:text-secondary']//div[@class='dropdown dropdown-bottom']")
    private WebElement LogoProfile;
    public void setLogoProfile(){
        LogoProfile.click();
    }
    @FindBy(xpath = "//ul[@class='dropdown-content md:text-sm menu p-2 text-black shadow-lg bg-base-100 rounded-box w-52']//a[.='Profile']")
    private WebElement ProfilePage;
    public void setProfilePage() {
        ProfilePage.click();
    }
    @FindBy(xpath ="//button[@class='btn btn-primary btn-sm rounded-full']")
    private WebElement EditProfileButton;
    public void setEditProfileButton(){
        EditProfileButton.click();
    }
    @FindBy(xpath = "//textarea[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement UserBio;
    public void setUserBio(String Bio){
        UserBio.sendKeys(Bio);
    }
    @FindBy(xpath = "//form[@class='flex flex-col']//div[1]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement CurrentPassword;
    public  void setCurrentPassword(String UserCurrentPassword){
        CurrentPassword.sendKeys(UserCurrentPassword);
    }
    @FindBy(css = ".flex-col div:nth-of-type(1) > .absolute")
    private WebElement IconEyeCurrentPassword;
    public void setIconEyeCurrentPassword(){
        IconEyeCurrentPassword.click();
    }
    @FindBy(xpath = "//form[@class='flex flex-col']//div[2]/input[@class='w-full md:w-96 lg:w-full xl:w-undefined 2xl:w-undefined px-2 py-1 border mt-5 border-primary rounded-md focus:outline-none focus:ring focus:ring-white']")
    private WebElement NewPassword;
    public  void setNewPassword(String UserNewPassword) {
        NewPassword.sendKeys(UserNewPassword);
    }
    @FindBy(css = ".flex-col div:nth-of-type(2) > .absolute")
    private WebElement IconEyeNewPassword;
    public void setIconEyeNewPassword() {
        IconEyeNewPassword.click();
    }
    @FindBy(css = "[placeholder='Confirm new password']")
    private WebElement ConfirmNewPassword;
    public void setConfirmNewPassword(String ConfirmNewPassword){
        CurrentPassword.sendKeys(ConfirmNewPassword);
    }
    @FindBy(css = ".flex-col div:nth-of-type(3) > .absolute")
    private WebElement IconEyeConfirmNewPassword;
    public void setIconEyeConfirmNewPassword() {
        IconEyeConfirmNewPassword.click();
    }
    @FindBy(xpath ="//button[@class='w-24 lg:w-32 py-3 rounded-md place-self-center bg-secondary text-white']")
    private WebElement ButtonSave;
    public void setButtonSave(){
        ButtonSave.click();
    }
}