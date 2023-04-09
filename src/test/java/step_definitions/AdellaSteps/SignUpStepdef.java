package step_definitions.AdellaSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.AdellaPage.SignUpPage;
import org.example.pageObject.ShiddiqPage.SearchPoeplePage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class SignUpStepdef {
    private WebDriver webDriver;
    SignUpPage signUpPage ;
    public SignUpStepdef(){
        super();
        this.webDriver = Hooks.webDriver;
        signUpPage= new SignUpPage(webDriver);
    }

    // Get Click Sign Up Button
    @And("^User click Sign up to Create new account$")
    public void userClickSignUpToCreateNewAccount() throws InterruptedException{
        Thread.sleep(2000);
        signUpPage.clicksignUp();
        Thread.sleep(2000);
    }

    @And("^Input Username \"([^\"]*)\"$")
    public void inputUsername(String regisName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        signUpPage.inputRegisName(regisName);
        Thread.sleep(1000);

    }

    @And("^Input Email \"([^\"]*)\"$")
    public void inputEmail(String email) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        signUpPage.iputEmail(email);
        Thread.sleep(1000);
    }

    @And("^Input Password \"([^\"]*)\"$")
    public void inputPassword(String password) throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        signUpPage.sendInputPassword(password);
        Thread.sleep(1000);
    }

    @And("^CLick sign up button$")
    public void clickSignUpButton() throws InterruptedException{
        Thread.sleep(4000);
        signUpPage.clickSignUp();
        Thread.sleep(4000);
    }

    @And("^User already register$")
    public void userAlreadyRegister() throws InterruptedException{
        signUpPage.VerifyAlreadyRegister();
        Thread.sleep(4000);
    }

    // logo profile
    @And("^Click logo profile to verify$")
    public void clickLogoProfileToVerify() throws InterruptedException{
        signUpPage.LogoProfile();
        Thread.sleep(4000);
    }

    @And("^Click profile to verify user$")
    public void clickProfileToVerifyUser() throws InterruptedException{
        signUpPage.clickDropdownProfile();
        Thread.sleep(3000);
    }

    @Then("^Verify user has true adella$")
    public void verifyUserHasTrueAdella() {
        signUpPage.verifyUserAdella();
    }
}
