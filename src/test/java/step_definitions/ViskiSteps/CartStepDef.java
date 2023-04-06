package step_definitions.ViskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ViskiPage.CartPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class CartStepDef {

    private  static WebDriver webDriver;
    public CartStepDef(){
        super();
        webDriver = Hooks.webDriver;
    }

    @When("^user click add item post in timeline$")
    public void userClickAddItemPostInTimeline() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddItemPostInTimeline();
        Thread.sleep(3000);
    }

    @And("^user click add item post in timeline Second$")
    public void userClickAddItemPostInTimelineSecond() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(3000);
        cartPage.AddItemPostInTimelineSecond();
        Thread.sleep(3000);
    }
    @When("^User Click Button Cart$")
    public void userClickButtonCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.ClickButtonCart();
        Thread.sleep(3000);
    }

    @Then("^Click on Delete Item button$")
    public void clickOnDeleteItemButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.DeleteItemButton();
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


    @And("^Click Checklist product in cart$")
    public void clickChecklistProductInCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.ChecklistProductInCart();
        Thread.sleep(5000);
    }

    @Then("^Click on Check out$")
    public void clickOnCheckOut() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.CheckOut();
        Thread.sleep(3000);
    }
}
