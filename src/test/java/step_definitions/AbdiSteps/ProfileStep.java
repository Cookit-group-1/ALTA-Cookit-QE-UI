package step_definitions.AbdiSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.pageObject.AbdiPage.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class ProfileStep {
    private WebDriver webDriver;
    public ProfileStep() throws InterruptedException {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^User drop down feature profile$")
    public void userDropDownFeatureProfile() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setLogoProfile();
        Thread.sleep(3000);
    }
    @And("^User click feature profile$")
    public void UserClickFeatureProfile() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setProfilePage();
        Thread.sleep(3000);
    }
    @And("^User click edit profile button$")
    public void userClickEditProfileButton() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setEditProfileButton();
        Thread.sleep(3000);
    }
    @And("^User input bio \"(.*)\"$")
    public void userInputBio(String Bio) throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setUserBio(Bio);
        Thread.sleep(3000);
    }

    @And("^User input current password \"(.*)\"$")
    public void userInputCurrentPassword(String CurrentPassword) throws InterruptedException {
        ProfilePage profilePage = new  ProfilePage(webDriver);
        profilePage.setCurrentPassword(CurrentPassword);
        Thread.sleep(3000);
    }
    @When("^User click icon eye button can see current password$")
    public void userClickIconEyeButtonCanSeeCurrentPassword() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setIconEyeCurrentPassword();
        Thread.sleep(3000);
    }
    @And("^User input new password \"(.*)\"$")
    public void userInputNewPassword(String NewPassword) throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setNewPassword(NewPassword);
        Thread.sleep(3000);
    }
    @When("^User click icon eye button can see new password$")
    public void userClickIconEyeButtonCanSeeNewPassword() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setIconEyeNewPassword();
        Thread.sleep(3000);
    }
    @And("^User confirm new password \"(.*)\"$")
    public void userConfirmNewPassword(String ConfirmNewPassword) throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setConfirmNewPassword(ConfirmNewPassword);
        Thread.sleep(3000);
    }
    @When("^User click icon eye button can see confirm new password$")
    public void userClickIconEyeButtonCanSeeConfirmNewPassword() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setIconEyeConfirmNewPassword();
        Thread.sleep(3000);
    }
    @And("^User upload photo profile$")
    public void userUploadPhotoProfile() throws InterruptedException {
        WebElement X = webDriver.findElement(By.xpath("//input[@id='pict']"));
        String A = "/Users/macbookArshaka/Documents/CAPSTONE COOKIT/ALTA-Cookit-QE-UI/src/test/resources/images/abdi.jpeg";
        X.sendKeys(A);
        Thread.sleep(3000);
    }
    @And("^User click request to be verified$")
    public void userClickRequestToBeVerified() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setButtonVerified();
        Thread.sleep(3000);
    }

    @And("^User click button save$")
    public void userClickButtonSave() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.setButtonSave();
        Thread.sleep(3000);
    }
}
