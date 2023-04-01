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

}
