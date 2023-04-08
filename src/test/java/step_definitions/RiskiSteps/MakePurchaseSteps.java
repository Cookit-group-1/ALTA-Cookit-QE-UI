package step_definitions.RiskiSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.example.pageObject.RiskiPage.PurchasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class MakePurchaseSteps {

    private WebDriver webDriver;
    public MakePurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("^Subtotal should be \"(.*)\"$")
    public void subtotalShouldBe(String arg0){
        PurchasePage purchasePage = new PurchasePage(webDriver);
        Assert.assertEquals(arg0,purchasePage.setSubtotal());
    }


    @Then("^Order total should be \"(.*)\"$")
    public void orderTotalShouldBe(String arg0){
        PurchasePage purchasePage = new PurchasePage(webDriver);
        Assert.assertEquals(arg0,purchasePage.setOrderTotal());
    }

    @Then("^Already on detail purchase page$")
    public void alreadyOnDetailPurchasePage() {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        Assert.assertTrue(purchasePage.setVerifyDetailPurchase());
    }
}
