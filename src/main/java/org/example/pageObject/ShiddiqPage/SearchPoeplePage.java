package org.example.pageObject.ShiddiqPage;

import cucumber.api.java.en.And;
import org.example.pageObject.RiskiPage.RecipePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPoeplePage {
    public static WebDriver webDriver;
    public SearchPoeplePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    // Get poeple page
    @FindBy(xpath = "//button[.='People']")
    private WebElement poeplePage;
    public void clickPoeplePage(){
        poeplePage.click();
    }

    // get click search
    @FindBy(css = "[placeholder='Search Cookit']")
    private WebElement inputName;
    public void inputUserNameOtherPoeple(String TeamQaJos){
        inputName.sendKeys(TeamQaJos);
        inputName.sendKeys(Keys.RETURN);
    }

    // Get click profile
    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//div[@class='h-0 pb-1/1 relative hover:cursor-pointer']")
    private WebElement photoProfile;
    public void clickPhotoProfile(){
        photoProfile.click();
    }

    // Get Follow
    @FindBy(css = ".btn-primary")
    private WebElement followUser;
    public void clickFollowUser() {
        followUser.click();
    }


    // Gek like recipes
    @FindBy(xpath ="//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//div[@class='flex justify-self-center']/button[.='0']")
    private WebElement getLike;
    public void clickSignLove(){
        getLike.click();
    }

    // Get sign comment 5th
    @FindBy(css ="div:nth-of-type(5) .justify-self-start > .flex")
    private WebElement commentUser;
    public void clickSignComment(){
        commentUser.click();
    }

    // Get string comment
    @FindBy(css=".input")
    private WebElement userComment;
    public void sendComment(String comments){
        userComment.sendKeys(comments);
    }

    // Get submit
    @FindBy(css=".btn-primary")
    private WebElement submitComment;
    public void sendSubmitComment(){
        submitComment.click();
    }


    // Get verify comment
    @FindBy(xpath = "//p[@class='font-light']")
    private WebElement verifyComment;
    public boolean getVerifyComment(){
        verifyComment.isDisplayed();
        return true;
    }





    // dari admin
    @FindBy(css = ".text-2xl")
    private WebElement verifySuccessLogin;
    public boolean isVerifySuccessLoginDisplayed() {
        verifySuccessLogin.isDisplayed();
        return true;
    }


    @FindBy(xpath = "//input[1]")
    private WebElement userName;
    public void setUserName(String user){
        userName.sendKeys(user);
    }

    public boolean verifyLoginPage(){
        userName.isDisplayed();
        return true;
    }


    @FindBy(xpath = "//input[2]")
    private WebElement password;
    public void setPassword(String psd){
        password.sendKeys(psd);
    }

    @FindBy(css = ".btn")
    private WebElement btnLogin;
    public void clickLogin(){
        btnLogin.click();
    }




    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnOk;
    public void setclickOk(){
        btnOk.click();
    }



    // User n Button
    @FindBy(xpath = "//a[.='User']")
    private WebElement btnListUser;
    public void clickListUser(){
        btnListUser.click();
    }

    @FindBy(css = ".navbar-end > div")
    private WebElement btnHitUser;
    public void clickHiUser(){
        btnHitUser.click();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnOkBtn;
    public void setclickBtnOk(){
        btnOkBtn.click();
    }

    @FindBy(xpath = "//a[.='Logout']")
    private WebElement btnLogout;
    public void clickLogoutButton(){
        btnLogout.click();
    }




    // Create List User Input user
    @FindBy(xpath = "//input[@id='name-input']")
    private WebElement name;
    public void setName(String name1){
        name.sendKeys(name1);
    }


    @FindBy(xpath = "//input[@id='email-input']")
    private WebElement email;
    public void setEmail(String email1){
        email.sendKeys(email1);
    }

    @FindBy(xpath = "//input[@id='phone-input']")
    private WebElement number;
    public void setNumber(String number1){
        number.sendKeys(number1);
    }

    @FindBy(xpath = "//form[@class='flex flex-row space-x-20 justify-center mx-auto my-auto p-20']/div[1]/select[@class='select select-bordered select-sm  ']")
    private WebElement status;
    public void setStatus(String sts){
        status.sendKeys(sts);
    }

    @FindBy(xpath = "//form[@class='flex flex-row space-x-20 justify-center mx-auto my-auto p-20']/div[2]/select[@class='select select-bordered select-sm  ']")
    private WebElement team;
    public void setTeam(String tm){
        team.sendKeys(tm);
    }

    @FindBy(xpath = "//input[@id='address-input']")
    private WebElement address;
    public void setAddress(String address1){
        address.sendKeys(address1);
    }

    @FindBy(xpath = "//button[@class='btn btn w-20 text-xs bg-sky-900 border-none hover:bg-orange-500 mt-5']")
    private WebElement btnSubmit;
    public void clickSumbit(){
        btnSubmit.click();
    }

    @FindBy(xpath = "//tbody[1]/tr[1]/td[@class='space-x-1 flex']")
    private WebElement poeple;
    public void setPoepleSkill(){
        poeple.click();
    }
}
