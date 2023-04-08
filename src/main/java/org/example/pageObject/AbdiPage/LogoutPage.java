package org.example.pageObject.AbdiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public static WebDriver webDriver;

    public LogoutPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;

    }
    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']//span[.='logout']")
    private WebElement LogOut;
    public void setLogOut(){
        LogOut.click();
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement ButtonYes;
    public void setButtonYes(){
        ButtonYes.click();
    }

}