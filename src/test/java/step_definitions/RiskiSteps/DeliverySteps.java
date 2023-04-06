package step_definitions.RiskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.RiskiPage.PaymentPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class DeliverySteps {
    private WebDriver webDriver;
    public DeliverySteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^User click add to chart button$")
    public void userClickAddToChartButton() {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        paymentPage.setAddToCheckOut();
    }

    @And("^Click add to checklist button$")
    public void clickAddToChecklistButton() {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        paymentPage.setAddToCheckList();
    }

    @And("^Click add to checkout button$")
    public void clickAddToCheckoutButton() {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        paymentPage.setAddToCheckOut();
    }

    @Then("^Gofood delivery button can be clicked$")
    public void gofoodDeliveryButtonCanBeClicked() {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        paymentPage.setGoFoodDelivery();
    }
}
