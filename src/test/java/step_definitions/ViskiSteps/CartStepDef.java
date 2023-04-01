package step_definitions.ViskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ViskiPage.CartPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class CartStepDef {

    private  static WebDriver webDriver;
    public CartStepDef(){
        super();
        webDriver = Hooks.webDriver;
    }
    @When("^User Click Button Cart$")
    public void userClickButtonCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.ClickButtonCart();
        Thread.sleep(3000);
    }

    @Then("^Page Display where item price is same with item total$")
    public void PageDisplaywhereitempriceissamewithitemtotal() {
    }

    @Then("^Click on Checklist Item$")
    public void clickOnChecklistItem() {
    }

    @Then("^Click on Delete Item button$")
    public void clickOnDeleteItemButton() {
    }


    @Then("^Click on positive button$")
    public void clickOnPositiveButton() {
    }

    @And("^Click on negative button$")
    public void clickOnNegativeButton() {
    }

    @Then("^Click on Check out$")
    public void clickOnCheckOut() {
    }

}
