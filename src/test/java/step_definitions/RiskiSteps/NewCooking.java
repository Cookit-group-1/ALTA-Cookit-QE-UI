package step_definitions.RiskiSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.RiskiPage.NewCookingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class NewCooking {
    private WebDriver webDriver;
    public NewCooking(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^User click add new item button$")
    public void userClickAddNewItemButton() {
        NewCookingPage newCookingPage = new NewCookingPage(webDriver);
        newCookingPage.setAddNewItem();
    }

    @And("^Click new cooking$")
    public void clickNewCooking() {
        NewCookingPage newCookingPage = new NewCookingPage(webDriver);
        newCookingPage.addNewCooking();
    }

    @And("^Input any description \"(.*)\"$")
    public void inputAnyDescription(String input) throws InterruptedException {
        NewCookingPage newCookingPage = new NewCookingPage(webDriver);
        newCookingPage.addTextNewCooking(input);
        Thread.sleep(2000);
    }

    @And("^Input an image$")
    public void inputAnImage() throws InterruptedException {
        WebElement X = webDriver.findElement(By.xpath("//input[1]"));
        String V = "/Users/riskiferdian/Documents/GitHub/ALTA-Cookit-QE-UI/src/test/resources/images/pizza.jpg";
        X.sendKeys(V);
        Thread.sleep(3000);
    }

    @Then("^Click submit$")
    public void clickSubmit() {
        NewCookingPage newCookingPage = new NewCookingPage(webDriver);
        newCookingPage.setSubmit();
    }
}
