package org.example.pageObject.RiskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class PurchasePage {
    public static WebDriver webDriver;
    public PurchasePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(css = ".justify-between > p:nth-of-type(2)")
    private WebElement subtotal;
    public String setSubtotal(){
        return subtotal.getText();
    }

    @FindBy(css = "p:nth-of-type(8)")
    private WebElement orderTotal;
    public String setOrderTotal(){
        return orderTotal.getText();
    }

    @FindBy(xpath = "//h1[@class='text-xl font-semibold text-white text-center ']")
    private WebElement verifyDetailPurchase;
    public boolean setVerifyDetailPurchase(){
        verifyDetailPurchase.isDisplayed();
        return true;
    }


}
