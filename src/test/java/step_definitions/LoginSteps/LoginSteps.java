package step_definitions.LoginSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^User open website cookit$")
    public void userOpenWebsiteCookit() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLandingPage());
    }

    @When("^Click sign in button$")
    public void clickSignInButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setSignButton();
    }

    @And("^Input username \"(.*)\"$")
    public void inputUsername(String username) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(username);
        Thread.sleep(1500);
    }

    @And("^Input password \"(.*)\"$")
    public void inputPassword(String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setPassword(password);
        Thread.sleep(1500);
    }

    @And("^CLick login button$")
    public void clickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setLoginButton();
        Thread.sleep(4000);
    }

    @And("^User already login$")
    public void userAlreadyLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDashboard());
        Thread.sleep(5000);
    }
}