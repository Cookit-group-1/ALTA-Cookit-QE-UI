package org.example.pageObject.ViskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]")
    private WebElement AddItemPostInTimeline;
    public void AddItemPostInTimeline(){
        AddItemPostInTimeline.click();
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[4]/div[2]/div[1]/button[1]/*[1]")
    private WebElement AddItemPostInTimelineSecond;
    public void AddItemPostInTimelineSecond(){
        AddItemPostInTimelineSecond.click();
    }

    @FindBy(xpath = "//div[@class='indicator']")
    private WebElement ClickButtonCart;
    public void ClickButtonCart(){
        ClickButtonCart.click();
    }

    @FindBy(css = ".absolute")
    private WebElement DeleteItemButton;
    public void DeleteItemButton(){
        DeleteItemButton.click();
    }

    @FindBy(xpath = "//p[.='+']")
    private WebElement PositiveButton;
    public void PositiveButton(){
        PositiveButton.click();
    }

    @FindBy(xpath = "//p[.='-']")
    private WebElement NegativeButton;
    public void NegativeButton(){
        NegativeButton.click();
    }

    @FindBy(css = ".w-5")
    private WebElement ChecklistProductInCart;
    public void ChecklistProductInCart(){
        ChecklistProductInCart.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[4]/button[1]")
    private WebElement CheckOut;
    public void CheckOut(){
        CheckOut.click();
    }
}
