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

    @FindBy(xpath = "")
    private WebElement TabRecipe;
    public void TabRecipe() {
        TabRecipe.click();
    }

    @FindBy(xpath = "")
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
