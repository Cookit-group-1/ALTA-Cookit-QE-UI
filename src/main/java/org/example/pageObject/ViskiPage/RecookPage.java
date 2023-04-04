package org.example.pageObject.ViskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecookPage {
    public static WebDriver driver;
    public RecookPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='border-b-4 py-2 border-secondary font-semibold']")
    private WebElement TabRecipe;
    public void TabRecipe() {
        TabRecipe.click();
    }

    @FindBy(css = ".max-w-xl > div:nth-of-type(2) label:nth-of-type(1) > svg:nth-of-type(1)")
    private WebElement ThreePointInPostAccountUser;
    public void ThreePointInPostAccountUser() {
        ThreePointInPostAccountUser.click();
    }

    @FindBy(xpath = "//div[@class='relative min-h-screen flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-start']/div[2]//p[.='Recook']")
    private WebElement ReplyButtonInPostAccountUser;
    public void ReplyButtonInPostAccountUser() {
        ReplyButtonInPostAccountUser.click();
    }

    @FindBy(xpath = "")
    private WebElement AddYourCommentField;
    public void AddYourCommentField() {
        AddYourCommentField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataAddYourCommentField;
    public void inputValidDataAddYourCommentField(String DataAddYourCommentField) {
        inputValidDataAddYourCommentField.sendKeys(DataAddYourCommentField);
    }

    @FindBy(xpath = "")
    private WebElement inputAnyAddYourCommentField;
    public void inputAnyAddYourCommentField(String AnyAddYourCommentField) {
        inputAnyAddYourCommentField.sendKeys(AnyAddYourCommentField);
    }

}
