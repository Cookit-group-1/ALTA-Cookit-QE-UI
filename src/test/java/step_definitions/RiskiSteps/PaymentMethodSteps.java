package step_definitions.RiskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.RiskiPage.PaymentMethodPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class PaymentMethodSteps {
    private WebDriver webDriver;
    public PaymentMethodSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^Click payment options$")
    public void clickPaymentOptions() {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setPaymentMethods();
    }

    @Then("^Payment method BCA can be clicked$")
    public void paymentMethodBCACanBeClicked() {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setBCA();
    }


    @Then("^Payment method BNI can be clicked$")
    public void paymentMethodBNICanBeClicked() {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setBNI();
    }

    @Then("^Payment method BRI can be clicked$")
    public void paymentMethodBRICanBeClicked() {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setBRI();
    }
}
