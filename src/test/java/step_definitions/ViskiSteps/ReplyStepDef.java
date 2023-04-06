package step_definitions.ViskiSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ViskiPage.ReplyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class ReplyStepDef {
    private static WebDriver webDriver;
    public ReplyStepDef(){
        super();
        webDriver = Hooks.webDriver;
    }
    @When("^User Click Tab Recipe$")
    public void userClickTabRecipe() throws InterruptedException {
        ReplyPage replyPage =new ReplyPage(webDriver);
        replyPage.TabRecipe();
        Thread.sleep(3000);
    }

    @And("^Click Three Point in post account user$")
    public void clickThreePointInPostAccountUser() throws InterruptedException {
        ReplyPage replyPage = new ReplyPage(webDriver);
        replyPage.ThreePointInPostAccountUser();
        Thread.sleep(3000);
    }

    @Then("^Click on reply button in post account user$")
    public void clickOnReplyButtonInPostAccountUser() throws InterruptedException {
        ReplyPage replyPage = new ReplyPage(webDriver);
        replyPage.ReplyButtonInPostAccountUser();
        Thread.sleep(3000);
    }

    @And("^Click Add your comment Field$")
    public void clickAddYourCommentField() throws InterruptedException {
        ReplyPage replyPage = new ReplyPage(webDriver);
        replyPage.AddYourCommentField();
        Thread.sleep(3000);
    }

    @Then("^Input Valid data add your comment Field \"([^\"]*)\"$")
    public void inputValidDataAddYourCommentField(String DataAddYourCommentField) throws InterruptedException {
        ReplyPage replyPage = new ReplyPage(webDriver);
        replyPage.inputValidDataAddYourCommentField(DataAddYourCommentField);
        Thread.sleep(3000);
    }


    @Then("^Input any Add your comment Field \"([^\"]*)\"$")
    public void inputAnyAddYourCommentField(String AddYourCommentField) throws InterruptedException {
        ReplyPage replyPage = new ReplyPage(webDriver);
        replyPage.inputAnyAddYourCommentField(AddYourCommentField);
        Thread.sleep(3000);
    }

    @And("^Click on Choose Files Photo Reply$")
    public void clickOnChooseFilesPhotoReply() throws InterruptedException {
        WebElement X = webDriver.findElement(By.xpath("//input[1]"));
        String DIR = System.getProperty("User.DIR");
        String V = "/Users/fizkiarditiakusuma/IdeaProjects/ALTA-Cookit-QE-UI/src/test/resources/ImageRecook/bolukukusnew.jpeg";
        X.sendKeys(V);
        Thread.sleep(7000);
    }

    @And("^Click on Submit Reply$")
    public void clickOnSubmitReply() throws InterruptedException {
        WebElement S = webDriver.findElement(By.xpath("//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']"));
        S.click();
        Thread.sleep(3000);
    }


//    @And("^Click add image Reply$")
//    public void clickAddImageReply() throws InterruptedException {
//        ReplyPage replyPage =new ReplyPage(webDriver);
//        replyPage.AddImageReply();
//        Thread.sleep(3000);
//    }
}
