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
    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']")
    private WebElement LogoProfile;
    public void setLogoProfile(){
        LogoProfile.click();
    }
    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']//a[.='Profile']")
    private WebElement ProfilePage;
    public void setProfilePage() {
        ProfilePage.click();
    }
    @FindBy(xpath ="//button[@class=' text-primary place-self-end mb-24 text-2xl rounded-full']")
    private WebElement EditProfileButton;
    public void setEditProfileButton(){
        EditProfileButton.click();
    }
    @FindBy(xpath = "//textarea[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement UserBio;
    public void setUserBio(String Bio){
        UserBio.sendKeys(Bio);
    }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElement CurrentPassword;
    public  void setCurrentPassword(String UserCurrentPassword){
        CurrentPassword.sendKeys(UserCurrentPassword);
    }
    @FindBy(css = ".flex-col div:nth-of-type(1) > .absolute")
    private WebElement IconEyeCurrentPassword;
    public void setIconEyeCurrentPassword(){
        IconEyeCurrentPassword.click();
    }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/input[1]")
    private WebElement NewPassword;
    public  void setNewPassword(String UserNewPassword) {
        NewPassword.sendKeys(UserNewPassword);
    }
    @FindBy(css = ".flex-col div:nth-of-type(2) > .absolute")
    private WebElement IconEyeNewPassword;
    public void setIconEyeNewPassword() {
        IconEyeNewPassword.click();
    }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/input[1]")
    private WebElement ConfirmNewPassword;
    public void setConfirmNewPassword(String UserConfirmNewPassword){
        ConfirmNewPassword.sendKeys(UserConfirmNewPassword);
    }
    @FindBy(css = ".flex-col div:nth-of-type(3) > .absolute")
    private WebElement IconEyeConfirmNewPassword;
    public void setIconEyeConfirmNewPassword() {
        IconEyeConfirmNewPassword.click();
    }
    @FindBy(xpath = "//label[@class='w-24 h-24 rounded-full cursor-pointer relative overflow-hidden flex justify-center items-center hover:brightness-50']")
    private WebElement AddPhotoProfile;
    public void setAddPhotoProfile(){
        AddPhotoProfile.click();
    }
    @FindBy(xpath = "//button[@class='w-24 py-1 bg-secondary font-semibold rounded-md text-white']")
    private WebElement ButtonVerified;
    public void setButtonVerified(){
        ButtonVerified.click();
    }
    @FindBy(xpath ="//button[@class='w-24 lg:w-32 py-1 rounded-md place-self-center bg-secondary text-white']")
    private WebElement ButtonSave;
    public void setButtonSave(){
        ButtonSave.click();
    }
}