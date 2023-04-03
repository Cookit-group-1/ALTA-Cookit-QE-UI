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

    @FindBy(xpath = "//p[.='Cart']")
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
