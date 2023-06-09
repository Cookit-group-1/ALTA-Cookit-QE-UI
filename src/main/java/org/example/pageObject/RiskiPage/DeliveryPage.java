package org.example.pageObject.RiskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {
    public static WebDriver webDriver;
    public DeliveryPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(css = ".indicator > [stroke='currentColor']")
    private WebElement addToCartButton;
    public void setAddToCartButton(){
        addToCartButton.click();
    }

    @FindBy(xpath = "//input[@class='w-5 h-5 text-secondary bg-secondary cursor-pointer']")
    private WebElement addToCheckList;
    public void setAddToCheckList(){
        addToCheckList.click();
    }

    @FindBy(xpath = "//button[@class='w-full md:w-2/3 lg:w-1/3 py-2 place-self-end text-center text-white font-semibold rounded-md bg-primary']")
    private WebElement addToCheckOut;
    public void setAddToCheckOut(){
        addToCheckOut.click();
    }

    @FindBy(xpath = "//img[@src='/assets/gofood-22009058.png']")
    private WebElement goFoodDelivery;
    public void setGoFoodDelivery(){
        goFoodDelivery.click();
    }

    @FindBy(xpath = "//img[@src='/assets/grabfood-3405c73a.png']")
    private WebElement grabFoodDelivery;
    public void setGrabFoodDelivery(){
        grabFoodDelivery.click();
    }

    @FindBy(xpath = "//img[@src='/assets/shopeefood-d2f36eed.png']")
    private WebElement shopeeFoodDelivery;
    public void setShopeeFoodDelivery(){
        shopeeFoodDelivery.click();
    }

    @FindBy(xpath = "//p[4]")
    private WebElement verifyPrice;
    public String setVerifyPrice(){
        return verifyPrice.getText();
    }

}
