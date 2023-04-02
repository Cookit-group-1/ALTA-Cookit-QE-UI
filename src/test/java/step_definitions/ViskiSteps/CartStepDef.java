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

    @Then("^Click on Checklist Item$")
    public void clickOnChecklistItem() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.ChecklistItem();
        Thread.sleep(3000);
    }

    @Then("^Click on Delete Item button$")
    public void clickOnDeleteItemButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.ChecklistItem();
        Thread.sleep(3000);
    }


    @Then("^Click on positive button$")
    public void clickOnPositiveButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.PositiveButton();
        Thread.sleep(3000);
    }

    @And("^Click on negative button$")
    public void clickOnNegativeButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.NegativeButton();
        Thread.sleep(3000);
    }

    @Then("^Click on Check out$")
    public void clickOnCheckOut() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.CheckOut();
        Thread.sleep(3000);
    }

}
