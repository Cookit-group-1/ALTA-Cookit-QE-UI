package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ContohPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class ContohStep {
    private WebDriver webDriver;
    public ContohStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^berada di landing page$")
    public void beradaDiLandingPage() {
        ContohPage contohPage = new ContohPage(webDriver);
        Assert.assertTrue(contohPage.verifyLandingPage());
    }
    @When("^masukan email \"(.*)\"$")
    public void masukanEmail(String email){
        ContohPage contohPage = new ContohPage(webDriver);
        contohPage.setUsername(email);
    }

    @And("^masukan pass \"(.*)\"$")
    public void masukanPass(String pass){
        ContohPage contohPage = new ContohPage(webDriver);
        contohPage.setPassword(pass);
    }

    @Then("^pencet tombol login$")
    public void pencetTombolLogin() {
        ContohPage contohPage = new ContohPage(webDriver);
        contohPage.clickButton();
    }
}
