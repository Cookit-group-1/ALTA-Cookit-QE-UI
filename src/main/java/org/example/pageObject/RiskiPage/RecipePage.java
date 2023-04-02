package org.example.pageObject.RiskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipePage {
    public static WebDriver webDriver;
    public RecipePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(css = "[href='/search'] > [stroke='currentColor']")
    private WebElement searchButton;

    public void setSearchButton(){
        searchButton.click();
    }

    @FindBy(xpath = "//input[@class='input h-8 rounded-full text-black w-full']")
    private WebElement searchPage;

    public boolean verifySearchPage(){
        searchPage.isDisplayed();
        return true;
    }

    public void searchRecipe(String inputRecipe){
        searchPage.sendKeys(inputRecipe);
    }

    public void clickSearhRecipe(){
        searchPage.click();
    }

    @FindBy(css = "[d='M256 48C141.1 48 48 141.1 48 256s93.1 208 208 208 208-93.1 208-208S370.9 48 256 48zm106.5 150.5L228.8 332.8h-.1c-1.7 1.7-6.3 5.5-11.6 5.5-3.8 0-8.1-2.1-11.7-5.7l-56-56c-1.6-1.6-1.6-4.1 0-5.7l17.8-17.8c.8-.8 1.8-1.2 2.8-1.2 1 0 2 .4 2.8 1.2l44.4 44.4 122-122.9c.8-.8 1.8-1.2 2.8-1.2 1.1 0 2.1.4 2.8 1.2l17.5 18.1c1.8 1.7 1.8 4.2.2 5.8z']")
    private WebElement doSearch;

    public void setDoSearch(){
        doSearch.click();
    }

    @FindBy(xpath = "//div[@class='relative flex flex-col w-full sm:w-2/3 lg:w-1/2 max-w-xl items-center justify-center']/div[3]//p[@class='font-semibold text-primary hover:text-accent hover:cursor-pointer']")
    private WebElement verifySearch;

    public String setVerifySearch(){
        return verifySearch.getText();
    }
}
