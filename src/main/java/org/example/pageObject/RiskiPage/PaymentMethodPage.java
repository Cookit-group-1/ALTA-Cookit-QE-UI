package org.example.pageObject.RiskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {
    public static WebDriver webDriver;
    public PaymentMethodPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(css = ".justify-center")
    private WebElement paymentMethods;

    public void setPaymentMethods(){
        paymentMethods.click();
    }

    @FindBy(xpath = "//label[.='Bank BCA']")
    private WebElement BCA;

    public void setBCA(){
        BCA.click();
    }

    @FindBy(xpath = "//label[.='Bank BNI']")
    private WebElement BNI;
    public void setBNI(){
        BNI.click();
    }

    @FindBy(xpath = "//label[.='Bank BRI']")
    private WebElement BRI;
    public void setBRI(){
        BRI.click();
    }

    @FindBy(xpath = "//label[.='Place Order']")
    private WebElement placeOrderButton;

    public void setPlaceOrderButton(){
        placeOrderButton.click();
    }

    @FindBy(xpath = "//input[@class='border-2 border-black py-2 px-2 rounded-md ']")
    private WebElement inputPassword;
    public void setInputPassword(String password){
        inputPassword.sendKeys(password);
    }

    @FindBy(xpath = "//label[.='Confirm']")
    private WebElement confirmButton;
    public void setConfirmButton(){
        confirmButton.click();
    }

   @FindBy(css = "p:nth-of-type(10)")
    private WebElement verifyMethod;
    public String setVerifyMethod(){
        return verifyMethod.getText();
    }

}
