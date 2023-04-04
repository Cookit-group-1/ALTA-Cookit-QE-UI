package org.example.pageObject.ViskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReplyPage {
    public static WebDriver driver;
    public ReplyPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='border-b-4 py-2 border-secondary font-semibold']")
    private WebElement TabRecipe;
    public void TabRecipe() {
        TabRecipe.click();
    }

    @FindBy(css = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[4]/div[3]/ul[1]")
    private WebElement ThreePointInPostAccountUser;
    public void ThreePointInPostAccountUser() {
        ThreePointInPostAccountUser.click();
    }

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//li[.='Reply']")
    private WebElement ReplyButtonInPostAccountUser;
    public void ReplyButtonInPostAccountUser() {
        ReplyButtonInPostAccountUser.click();
    }

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement AddYourCommentField;
    public void AddYourCommentField() {
        AddYourCommentField.click();
    }

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement inputValidDataAddYourCommentField;
    public void inputValidDataAddYourCommentField(String DataAddYourCommentField) {
        inputValidDataAddYourCommentField.sendKeys(DataAddYourCommentField);
    }

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement inputAnyAddYourCommentField;
    public void inputAnyAddYourCommentField(String AnyAddYourCommentField) {
        inputAnyAddYourCommentField.sendKeys(AnyAddYourCommentField);
    }

    @FindBy(xpath = "//label[@class='btn btn-ghost w-full sm:w-20 w-10 sm:btn-sm flex gap-2']")
    private WebElement AddImageReply;
    public void AddImageReply() {
        AddImageReply.click();
    }

}
