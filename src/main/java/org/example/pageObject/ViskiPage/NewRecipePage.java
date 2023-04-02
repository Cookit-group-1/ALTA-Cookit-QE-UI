package org.example.pageObject.ViskiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRecipePage {
    public static WebDriver driver;

    public NewRecipePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "")
    private WebElement ButtonAddNewItem;
    public void ButtonAddNewItem() {
        ButtonAddNewItem.click();
    }

    @FindBy(xpath = "")
    private WebElement NewRecipe;
    public void NewRecipe() {
        NewRecipe.click();
    }

    @FindBy(xpath = "")
    private WebElement RecipeTitleField;
    public void RecipeTitleField() {
        RecipeTitleField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataRecipeTitleField;
    public void inputValidDataRecipeTitleField(String Title) {
        inputValidDataRecipeTitleField.sendKeys(Title);
    }

    @FindBy(xpath = "")
    private WebElement DescriptionField;
    public void DescriptionField() {
        DescriptionField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataDescriptionField;
    public void inputValidDataDescriptionField(String Description) {
        inputValidDataDescriptionField.sendKeys(Description);
    }

    //IngredientsFIRST

    @FindBy(xpath = "")
    private WebElement IngredientsSubButtonFirstField;
    public void IngredientsSubButtonFirstField() {
        IngredientsSubButtonFirstField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataIngredientsSubButtonFirstField;
    public void inputValidDataIngredientsSubButtonFirstField(String Ingredients) {
        inputValidDataIngredientsSubButtonFirstField.sendKeys(Ingredients);
    }

    @FindBy(xpath = "")
    private WebElement AmtSubButtonFirstField;
    public void AmtSubButtonFirstField() {
     AmtSubButtonFirstField.click();
    }

     @FindBy(xpath = "")
     private WebElement inputValidDataAmtSubButtonFirstField;
     public void inputValidDataAmtSubButtonFirstField(int Amt) {
        inputValidDataAmtSubButtonFirstField.sendKeys(String.valueOf(Amt));
    }

    @FindBy(xpath = "")
    private WebElement UnitsSubButtonFirstField;
    public void UnitsSubButtonFirstField() {
     UnitsSubButtonFirstField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataUnitSubButtonFirstField;
    public void inputValidDataUnitSubButtonFirstField(String Unit) {
        inputValidDataUnitSubButtonFirstField.sendKeys(Unit);
    }

    //IngredientsSECOND

    @FindBy(xpath = "")
    private WebElement IngredientsAddButton;
    public void IngredientsAddButton() {
     IngredientsAddButton.click();
    }

    @FindBy(xpath = "")
    private WebElement IngredientsSubButtonSecondField;
    public void IngredientsSubButtonSecondField() {
        IngredientsSubButtonSecondField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataIngredientsSubButtonSecondField;
    public void inputValidDataIngredientsSubButtonSecondField(String IngredientsSecond) {
        inputValidDataIngredientsSubButtonSecondField.sendKeys(IngredientsSecond);
    }


    @FindBy(xpath = "")
    private WebElement AmtSubButtonSecondField;
    public void AmtSubButtonSecondField() {
     AmtSubButtonSecondField.click();
    }

     @FindBy(xpath = "")
     private WebElement inputValidDataAmtSubButtonSecondField;
     public void inputValidDataAmtSubButtonSecondField(int AmtSecond) {
        inputValidDataAmtSubButtonSecondField.sendKeys(String.valueOf(AmtSecond));
    }

    @FindBy(xpath = "")
    private WebElement UnitsSubButtonSecondField;
    public void UnitsSubButtonSecondField() {
     UnitsSubButtonSecondField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataUnitSubButtonSecondField;
    public void inputValidDataUnitSubButtonSecondField(String UnitSecond) {
        inputValidDataUnitSubButtonSecondField.sendKeys(UnitSecond);
    }

    //IngredientsTHIRD

    @FindBy(xpath = "")
    private WebElement IngredientsSubButtonThirdField;
    public void IngredientsSubButtonThirdField() {
        IngredientsSubButtonThirdField.click();
    }


    @FindBy(xpath = "")
    private WebElement inputValidDataIngredientsSubButtonThirdField;
    public void inputValidDataIngredientsSubButtonThirdField(String IngredientsThird) {
        inputValidDataIngredientsSubButtonThirdField.sendKeys(IngredientsThird);
    }


    @FindBy(xpath = "")
    private WebElement AmtSubButtonThirdField;
    public void AmtSubButtonThirdField() {
     AmtSubButtonThirdField.click();
    }

     @FindBy(xpath = "")
     private WebElement inputValidDataAmtSubButtonThirdField;
     public void inputValidDataAmtSubButtonThirdField(int AmtThird) {
        inputValidDataAmtSubButtonThirdField.sendKeys(String.valueOf(AmtThird));
    }

    @FindBy(xpath = "")
    private WebElement UnitsSubButtonThirdField;
    public void UnitsSubButtonThirdField() {
     UnitsSubButtonThirdField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataUnitSubButtonThirdField;
    public void inputValidDataUnitSubButtonThirdField(String UnitThird) {
        inputValidDataUnitSubButtonThirdField.sendKeys(UnitThird);
    }


    //DirectionsFIRST

    @FindBy(xpath = "")
    private WebElement DirectionsAddButton;
    public void DirectionsAddButton() {
     DirectionsAddButton.click();
    }

    @FindBy(xpath = "")
    private WebElement DirectionsFirstField;
    public void DirectionsFirstField() {
        DirectionsFirstField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataDirectionsFirstField;
    public void inputValidDataDirectionsFirstField(String DirectionsFirst) {
        inputValidDataDirectionsFirstField.sendKeys(DirectionsFirst);
    }

//    DirectionsSECOND

    @FindBy(xpath = "")
    private WebElement DirectionsSecondField;
    public void DirectionsSecondField() {
        DirectionsSecondField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataDirectionsSecondField;
    public void inputValidDataDirectionsSecondField(String DirectionsSecond) {
        inputValidDataDirectionsSecondField.sendKeys(DirectionsSecond);
    }

//    DirectionsTHIRD

    @FindBy(xpath = "")
    private WebElement DirectionsThirdField;
    public void DirectionsThirdField() {
        DirectionsThirdField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataDirectionsThirdField;
    public void inputValidDataDirectionsThirdField(String DirectionsThird) {
        inputValidDataDirectionsThirdField.sendKeys(DirectionsThird);
    }


    @FindBy(xpath = "")
    private WebElement SellIngredientsField;
    public void SellIngredientsField() {
        SellIngredientsField.click();
    }

    @FindBy(xpath = "")
    private WebElement inputValidDataSellIngredientsField;
    public void inputValidDataSellIngredientsField(String SellIngredients) {
        inputValidDataSellIngredientsField.sendKeys(SellIngredients);
    }


        @FindBy(xpath = "")
    private WebElement SubmitRecipe;
    public void SubmitRecipe() {
        SubmitRecipe.click();
    }

}
