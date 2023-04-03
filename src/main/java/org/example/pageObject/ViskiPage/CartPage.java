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

    @FindBy(xpath = "[d='M11 9h2V6h3V4h-3V1h-2v3H8v2h3v3zm-4 9c-1.1 0-1.99.9-1.99 2S5.9 22 7 22s2-.9 2-2-.9-2-2-2zm10 0c-1.1 0-1.99.9-1.99 2s.89 2 1.99 2 2-.9 2-2-.9-2-2-2zm-9.83-3.25l.03-.12.9-1.63h7.45c.75 0 1.41-.41 1.75-1.03l3.86-7.01L19.42 4h-.01l-1.1 2-2.76 5H8.53l-.13-.27L6.16 6l-.95-2-.94-2H1v2h2l3.6 7.59-1.35 2.45c-.16.28-.25.61-.25.96 0 1.1.9 2 2 2h12v-2H7.42c-.13 0-.25-.11-.25-.25z']")
    private WebElement AddItemPostInTimeline;
    public void AddItemPostInTimeline(){
        AddItemPostInTimeline.click();
    }

    @FindBy(css = "div:nth-of-type(52) .text-accent")
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

    @FindBy(xpath = "//button[@class='w-full md:w-2/3 lg:w-1/3 py-2 place-self-end text-white font-semibold rounded-md bg-primary']")
    private WebElement CheckOut;
    public void CheckOut(){
        CheckOut.click();
    }

}
