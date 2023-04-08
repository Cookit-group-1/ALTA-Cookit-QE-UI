package step_definitions.AbdiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.pageObject.AbdiPage.LogoutPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LogoutStep {
    private WebDriver webDriver;
    public LogoutStep() throws InterruptedException {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @And("^User click logout$")
    public void userClickLogout() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.setLogOut();
        Thread.sleep(3000);
    }
    @And("^User click yes are you sure$")
    public void userClickYesAreYouSure() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.setButtonYes();
        Thread.sleep(3000);
    }
}
