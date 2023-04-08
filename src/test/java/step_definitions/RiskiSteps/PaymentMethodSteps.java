package step_definitions.RiskiSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Pa;
import gherkin.lexer.Th;
import org.example.pageObject.RiskiPage.PaymentMethodPage;
import org.junit.Assert;
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
    public void paymentMethodBCACanBeClicked(){
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

    @And("^Click place order button$")
    public void clickPlaceOrderButton() {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setPlaceOrderButton();
    }

    @And("^Input valid password \"(.*)\"$")
    public void inputValidPassword(String arg0) {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setInputPassword(arg0);

    }

    @And("^Click conifrm button$")
    public void clickConifrmButton() throws InterruptedException {
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        paymentMethodPage.setConfirmButton();
        Thread.sleep(5000);
    }

    @Then("^Payment method should be \"(.*)\"$")
    public void paymentMethodShouldBe(String verify){
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(webDriver);
        Assert.assertEquals(verify,paymentMethodPage.setVerifyMethod());
    }
}
