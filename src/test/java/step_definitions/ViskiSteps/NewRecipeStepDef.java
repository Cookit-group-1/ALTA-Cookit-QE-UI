package step_definitions.ViskiSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ViskiPage.NewRecipePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class NewRecipeStepDef {
    private static WebDriver webDriver;
    public NewRecipeStepDef(){
        super();
        webDriver = Hooks.webDriver;
    }
    public static final String DIR = System.getProperty("user.dir");

    @When("^User Click Button Add new Item$")
    public void userClickButtonAddNewItem() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.ButtonAddNewItem();
        Thread.sleep(3000);
    }

    @Then("^Click on New Recipe$")
    public void clickOnNewRecipe() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.NewRecipe();
        Thread.sleep(3000);
    }

    @And("^Click on Recipe Title Field$")
    public void clickOnRecipeTitleField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.RecipeTitleField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Recipe Title Field \"([^\"]*)\"$")
    public void inputValidDataRecipeTitleField(String Title) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataRecipeTitleField(Title);
        Thread.sleep(3000);
    }

    @And("^Click on Description Field$")
    public void clickOnDescriptionField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.DescriptionField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Description Field \"([^\"]*)\"$")
    public void inputValidDataDescriptionField(String Description) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataDescriptionField(Description);
        Thread.sleep(3000);
    }

//    @And("^Click on Photo Field$")
//    public void clickOnPhotoField() {
//    }
//
//    @And("^Choose one Photo$")
//    public void chooseOnePhoto() {
//    }
//
//    @And("^Click Open$")
//    public void clickOpen() {
//    }

    @And("^Click on Ingredients sub button First Field$")
    public void clickOnIngredientsSubButtonFirstField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.IngredientsSubButtonFirstField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Ingredients sub button First Field \"([^\"]*)\"$")
    public void inputValidDataIngredientsSubButtonFirstField(String Ingredients) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataIngredientsSubButtonFirstField(Ingredients);
        Thread.sleep(3000);
    }


    @And("^Click on Amt sub button First Field$")
    public void clickOnAmtSubButtonFirstField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.AmtSubButtonFirstField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Amt sub button First Field = (\\d+)$")
    public void inputValidDataAmtSubButtonFirstField(int Amt) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataAmtSubButtonFirstField(Amt);
        Thread.sleep(3000);
    }

    @And("^Click on Units sub button First Field$")
    public void clickOnUnitsSubButtonFirstField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.UnitsSubButtonFirstField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Unit sub button First Field \"([^\"]*)\"$")
    public void inputValidDataUnitSubButtonFirstField(String Unit) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataUnitSubButtonFirstField(Unit);
        Thread.sleep(3000);
    }

    @And("^Click on Ingredients add button$")
    public void clickOnIngredientsAddButton() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.IngredientsAddButton();
        Thread.sleep(3000);
    }

    @And("^Click on Ingredients sub button Second Field$")
    public void clickOnIngredientsSubButtonSecondField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.IngredientsSubButtonSecondField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Ingredients sub button Second Field \"([^\"]*)\"$")
    public void inputValidDataIngredientsSubButtonSecondField(String IngredientsSecond) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataIngredientsSubButtonSecondField(IngredientsSecond);
        Thread.sleep(3000);
    }

    @And("^Click on Amt sub button Second Field$")
    public void clickOnAmtSubButtonSecondField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.AmtSubButtonSecondField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Amt sub button Second Field = (\\d+)$")
    public void inputValidDataAmtSubButtonSecondField(int AmtSecond) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataAmtSubButtonSecondField(AmtSecond);
        Thread.sleep(3000);
    }

    @And("^Click on Units sub button Second Field$")
    public void clickOnUnitsSubButtonSecondField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.UnitsSubButtonSecondField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Unit sub button Second Field \"([^\"]*)\"$")
    public void inputValidDataUnitSubButtonSecondField(String UnitSecond) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataUnitSubButtonSecondField(UnitSecond);
        Thread.sleep(3000);
    }

    @And("^Click on Ingredients sub button Third Field$")
    public void clickOnIngredientsSubButtonThirdField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.IngredientsSubButtonThirdField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Ingredients sub button Third Field \"([^\"]*)\"$")
    public void inputValidDataIngredientsSubButtonThirdField(String IngredientsThird) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataIngredientsSubButtonThirdField(IngredientsThird);
        Thread.sleep(3000);
    }

    @And("^Click on Amt sub button Third Field$")
    public void clickOnAmtSubButtonThirdField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.AmtSubButtonThirdField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Amt sub button Third Field = (\\d+)$")
    public void inputValidDataAmtSubButtonThirdField(int AmtThird) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataAmtSubButtonThirdField(AmtThird);
        Thread.sleep(3000);
    }

    @And("^Click on Units sub button Third Field$")
    public void clickOnUnitsSubButtonThirdField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.UnitsSubButtonThirdField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Unit sub button Third Field \"([^\"]*)\"$")
    public void inputValidDataUnitSubButtonThirdField(String UnitThird) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataUnitSubButtonThirdField(UnitThird);
        Thread.sleep(3000);
    }

    @And("^Click on Directions add button$")
    public void clickOnDirectionsAddButton() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.DirectionsAddButton();
        Thread.sleep(3000);
    }

    @And("^Click on Directions First Field$")
    public void clickOnDirectionsFirstField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.DirectionsFirstField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Directions First Field \"([^\"]*)\"$")
    public void inputValidDataDirectionsFirstField(String DirectionsFirst) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataDirectionsFirstField(DirectionsFirst);
        Thread.sleep(3000);
    }

    @And("^Click on Directions Second Field$")
    public void clickOnDirectionsSecondField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.DirectionsSecondField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Directions Second Field \"([^\"]*)\"$")
    public void inputValidDataDirectionsSecondField(String DirectionsSecond) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataDirectionsSecondField(DirectionsSecond);
        Thread.sleep(3000);
    }

    @And("^Click on Directions Third Field$")
    public void clickOnDirectionsThirdField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.DirectionsThirdField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Directions Third Field \"([^\"]*)\"$")
    public void inputValidDataDirectionsThirdField(String DirectionsThird) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataDirectionsThirdField(DirectionsThird);
        Thread.sleep(3000);
    }

    @And("^Click on Sell Ingredients Field$")
    public void clickOnSellIngredientsField() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.SellIngredientsField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid Data Sell Ingredients Field \"([^\"]*)\"$")
    public void inputValidDataSellIngredientsField(String SellIngredients) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataSellIngredientsField(SellIngredients);
        Thread.sleep(3000);
    }

    @And("^Click on Submit Recipe$")
    public void clickOnSubmitRecipe() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.SubmitRecipe();
        Thread.sleep(3000);
    }

    @Then("^Input any Recipe Title Field \"([^\"]*)\"$")
    public void inputAnyRecipeTitleField(String RecipeTitle) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataRecipeTitleField(RecipeTitle);
        Thread.sleep(3000);
    }

    @Then("^Input any Description Field \"([^\"]*)\"$")
    public void inputAnyDescriptionField(String Description) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataDescriptionField(Description);
        Thread.sleep(3000);
    }

    @Then("^Input any Ingredients sub button First Field \"([^\"]*)\"$")
    public void inputAnyIngredientsSubButtonFirstField(String Ingredients) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataIngredientsSubButtonFirstField(Ingredients);
        Thread.sleep(3000);
    }

    @Then("^Input any Amt sub button First Field \"([^\"]*)\"$")
    public void inputAnyAmtSubButtonFirstField(int Amt) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataAmtSubButtonFirstField(Amt);
        Thread.sleep(3000);
    }

    @Then("^Input any Units sub button First Field \"([^\"]*)\"$")
    public void inputAnyUnitsSubButtonFirstField(String Units) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataUnitSubButtonFirstField(Units);
        Thread.sleep(3000);
    }

    @Then("^Input any Directions First Field \"([^\"]*)\"$")
    public void inputAnyDirectionsFirstField(String Directions) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataDirectionsFirstField(Directions);
        Thread.sleep(3000);
    }

    @Then("^Input any Sell Ingredients Field \"([^\"]*)\"$")
    public void inputAnySellIngredientsField(String SellIngredients) throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.inputValidDataSellIngredientsField(SellIngredients);
        Thread.sleep(3000);
    }

    @And("^Click on Choose Files Photo$")
    public void clickOnChooseFilesPhoto() throws InterruptedException {
        WebElement X = webDriver.findElement(By.xpath("//input[@id='imageInput']"));
        String V = "/Users/fizkiarditiakusuma/IdeaProjects/ALTA-Cookit-QE-UI/src/ImageNewRecipe/bolukukus.jpeg";
        X.sendKeys(V);
        Thread.sleep(3000);
    }
}
