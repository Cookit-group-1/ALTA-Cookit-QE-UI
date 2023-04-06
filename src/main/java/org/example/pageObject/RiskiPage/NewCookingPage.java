package org.example.pageObject.RiskiPage;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCookingPage {
    public static WebDriver webDriver;
    public NewCookingPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//p[.='New Post']")
    private WebElement addNewItem;

    public void setAddNewItem(){
        addNewItem.click();
    }

    @FindBy(xpath = "//a[.='New Cooking']")
    private WebElement newCooking;
    public void addNewCooking(){
        newCooking.click();
    }

    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement addNewCookingPage;
    public boolean verifyNewCookingPage(){
        addNewCookingPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement textNewCooking;
    public void addTextNewCooking(String input){
        textNewCooking.sendKeys(input);
    }

    @FindBy(xpath = "//label[@class='btn btn-ghost w-full sm:w-20 w-10 sm:btn-sm flex gap-2']")
    private WebElement addPhoto;
    public void setAddPhoto(){
        String DIR = System.getProperty("user.dir");
        String image = DIR + "/src/test/resource/images/pizza.jpg";
        addPhoto.sendKeys(image);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement submit;
    public void setSubmit(){
        submit.click();
    }
}
