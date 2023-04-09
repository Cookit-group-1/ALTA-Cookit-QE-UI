package step_definitions.RiskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.RiskiPage.RecipePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class SearchRecipe {
    private WebDriver webDriver;
    public SearchRecipe(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("^User click search button$")
    public void userClickSearchButton() {
        RecipePage recipePage = new RecipePage(webDriver);
        recipePage.setSearchButton();
    }

    @Then("^System show search page$")
    public void systemShowSearchPage() {
        RecipePage recipePage = new RecipePage(webDriver);
        recipePage.verifySearchPage();
    }

    @Then("^User click search page$")
    public void userClickSearchPage() throws InterruptedException{
        RecipePage recipePage = new RecipePage(webDriver);
        recipePage.clickSearhRecipe();
        Thread.sleep(3000);
    }

    @Then("^User can input alphabet \"(.*)\"$")
    public void userCanInputAlphabet(String input) {
        RecipePage recipePage = new RecipePage(webDriver);
        recipePage.searchRecipe(input);
    }

    @Then("^System show any recipe \"(.*)\"$")
    public void systemShowAnyRecipe(String text){
        RecipePage recipePage = new RecipePage(webDriver);
        Assert.assertEquals(text, recipePage.setVerifySearch());
    }

    @And("^User click search recipe$")
    public void userClickSearchRecipe() throws InterruptedException {
        RecipePage recipePage = new RecipePage(webDriver);
        recipePage.setDoSearch();
        Thread.sleep(1500);
    }
}
