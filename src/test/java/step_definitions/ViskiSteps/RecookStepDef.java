package step_definitions.ViskiSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ViskiPage.RecookPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class RecookStepDef {
    private static WebDriver webDriver;
    public RecookStepDef(){
        super();
        webDriver = Hooks.webDriver;
    }
    @When("^User Click Tab Recipe$")
    public void userClickTabRecipe() throws InterruptedException {
        RecookPage recookPage =new RecookPage(webDriver);
        recookPage.TabRecipe();
        Thread.sleep(3000);
    }

    @And("^Click Three Point in post account user$")
    public void clickThreePointInPostAccountUser() throws InterruptedException {
        RecookPage recookPage = new RecookPage(webDriver);
        recookPage.ThreePointInPostAccountUser();
        Thread.sleep(3000);
    }

    @Then("^Click on reply button in post account user$")
    public void clickOnReplyButtonInPostAccountUser() throws InterruptedException {
        RecookPage recookPage = new RecookPage(webDriver);
        recookPage.ReplyButtonInPostAccountUser();
        Thread.sleep(3000);
    }

    @And("^Click Add your comment Field$")
    public void clickAddYourCommentField() throws InterruptedException {
        RecookPage recookPage = new RecookPage(webDriver);
        recookPage.AddYourCommentField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid data add your comment Field \"([^\"]*)\"$")
    public void inputValidDataAddYourCommentField(String DataAddYourCommentField) throws InterruptedException {
        RecookPage recookPage = new RecookPage(webDriver);
        recookPage.inputValidDataAddYourCommentField(DataAddYourCommentField);
        Thread.sleep(3000);
    }


    @Then("^Input any Add your comment Field \"([^\"]*)\"$")
    public void inputAnyAddYourCommentField(String AddYourCommentField) throws InterruptedException {
        RecookPage recookPage = new RecookPage(webDriver);
        recookPage.inputAnyAddYourCommentField(AddYourCommentField);
        Thread.sleep(3000);
    }

    @And("^Click on Choose Files Photo Recook$")
    public void clickOnChooseFilesPhotoRecook() throws InterruptedException {
        WebElement X = webDriver.findElement(By.xpath("//input[@id='imageInput']"));
        String V = "/Users/fizkiarditiakusuma/IdeaProjects/ALTA-Cookit-QE-UI/src/test/resources/ImageRecook/bolukukusbaru.webp";
        X.sendKeys(V);
        Thread.sleep(3000);
    }

}
