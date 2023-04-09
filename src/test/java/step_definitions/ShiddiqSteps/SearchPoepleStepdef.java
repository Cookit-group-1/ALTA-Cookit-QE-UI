package step_definitions.ShiddiqSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;
import org.example.pageObject.ShiddiqPage.SearchPoeplePage;

public class SearchPoepleStepdef {
    private WebDriver webDriver;
    SearchPoeplePage searchPage;
    public SearchPoepleStepdef(){
        super();
        this.webDriver = Hooks.webDriver;
        searchPage = new SearchPoeplePage(webDriver);
    }

    // FOLLOW

    @And("^User click Poeple page to search$")
    public void userClickPoeplePageToSearch() {
        searchPage.clickPoeplePage();

    }

    @And("^User input \"([^\"]*)\" as anme$")
    public void userInputAsAnme(String TeamQaJos) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchPage.inputUserNameOtherPoeple(TeamQaJos);
        Thread.sleep(3000);

    }

    @And("^Click the profile$")
    public void clickTheProfile() throws InterruptedException{
        searchPage.clickPhotoProfile();
        Thread.sleep(3000);

    }

    @Then("^Follow Tim Qe Joss to be friend$")
    public void followTimQeJossToBeFriend() {
        searchPage.clickFollowUser();
    }

    // Get a like
    @And("^User click sign love to like$")
    public void userClickSignLoveToLike() throws InterruptedException{
        searchPage.clickSignLove();
        Thread.sleep(3000);
    }

    // Get a comment
    @And("^User click sign of comment to comment recipes$")
    public void userClickSignOfCommentToCommentRecipes() throws InterruptedException{
        Thread.sleep(3000);
        searchPage.clickSignComment();
        Thread.sleep(3000);
    }

    @And("^User comment recipes other user like \"([^\"]*)\"$")
    public void userCommentRecipesOtherUserLike(String comments) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchPage.sendComment(comments);
        Thread.sleep(3000);

    }

    // Get a Picture
    @And("^Add picture for commment from directory")
    public void addPictureForCommmentFromDirectory() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement picture = webDriver.findElement(By.xpath("//input[1]"));
        String upload = "A:\\0CapstoneWbautomation\\ALTA-Cookit-QE-UI\\src\\test\\resources\\ImageComment";
        picture.sendKeys(upload);
        Thread.sleep(7000);
    }

    @And("^Click submit button$")
    public void clickSubmitButton() throws InterruptedException{
        searchPage.sendSubmitComment();
        Thread.sleep(7000);
    }


    @And("^Verify that commetn is ready uploaded$")
    public void verifyThatCommetnIsReadyUploaded() {
        searchPage.getVerifyComment();
    }
}
