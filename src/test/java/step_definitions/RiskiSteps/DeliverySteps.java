package step_definitions.RiskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.De;
import org.example.pageObject.RiskiPage.DeliveryPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class DeliverySteps {
    private WebDriver webDriver;
    public DeliverySteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^User click add to chart button$")
    public void userClickAddToChartButton() throws InterruptedException {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        deliveryPage.setAddToCartButton();
        Thread.sleep(2000);
    }

    @And("^Click add to checklist button$")
    public void clickAddToChecklistButton() {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        deliveryPage.setAddToCheckList();
    }

    @And("^Click add to checkout button$")
    public void clickAddToCheckoutButton() throws InterruptedException {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        deliveryPage.setAddToCheckOut();
        Thread.sleep(2000);
    }

    @Then("^Gofood delivery button can be clicked$")
    public void gofoodDeliveryButtonCanBeClicked() {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        deliveryPage.setGoFoodDelivery();
    }

    @Then("^Verify subtotal shipping price is \"(.*)\"$")
    public void verifySubtotalShippingPrice(String verifyPrice) {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        Assert.assertEquals(verifyPrice,deliveryPage.setVerifyPrice());
    }

    @Then("^Grabfood delivery button can be clicked$")
    public void grabfoodDeliveryButtonCanBeClicked() {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        deliveryPage.setGrabFoodDelivery();
    }

    @Then("^Shopeefood delivery button can be clicked$")
    public void shopeefoodDeliveryButtonCanBeClicked() {
        DeliveryPage deliveryPage = new DeliveryPage(webDriver);
        deliveryPage.setShopeeFoodDelivery();
    }
}
