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

    @FindBy(xpath = "//button[.='New Post']")
    private WebElement ButtonAddNewItem;
    public void ButtonAddNewItem() {
        ButtonAddNewItem.click();
    }

    @FindBy(xpath = "//a[.='New Recipe']")
    private WebElement NewRecipe;
    public void NewRecipe() {
        NewRecipe.click();
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement RecipeTitleField;
    public void RecipeTitleField() {
        RecipeTitleField.click();
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputValidDataRecipeTitleField;
    public void inputValidDataRecipeTitleField(String Title) {
        inputValidDataRecipeTitleField.sendKeys(Title);
    }

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement DescriptionField;
    public void DescriptionField() {
        DescriptionField.click();
    }

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement inputValidDataDescriptionField;
    public void inputValidDataDescriptionField(String Description) {
        inputValidDataDescriptionField.sendKeys(Description);
    }

    //IngredientsFIRST

    @FindBy(xpath = "//input[@class='input py-2 input-primary col-span-5']")
    private WebElement IngredientsSubButtonFirstField;
    public void IngredientsSubButtonFirstField() {
        IngredientsSubButtonFirstField.click();
    }

    @FindBy(xpath = "//input[@class='input py-2 input-primary col-span-5']")
    private WebElement inputValidDataIngredientsSubButtonFirstField;
    public void inputValidDataIngredientsSubButtonFirstField(String Ingredients) {
        inputValidDataIngredientsSubButtonFirstField.sendKeys(Ingredients);
    }

    @FindBy(xpath = "//input[@value='0']")
    private WebElement AmtSubButtonFirstField;
    public void AmtSubButtonFirstField() {
        AmtSubButtonFirstField.click();
    }

    @FindBy(xpath = "//input[@value='0']")
    private WebElement inputValidDataAmtSubButtonFirstFieldClear;
    public void inputValidDataAmtSubButtonFirstFieldClear() {
        inputValidDataAmtSubButtonFirstFieldClear.clear();
    }

     @FindBy(xpath = "//input[@value='0']")
     private WebElement inputValidDataAmtSubButtonFirstField;
     public void inputValidDataAmtSubButtonFirstField(int Amt) {
         inputValidDataAmtSubButtonFirstField.sendKeys(String.valueOf(Amt));
    }

    @FindBy(xpath = "//input[3]")
    private WebElement UnitsSubButtonFirstField;
    public void UnitsSubButtonFirstField() {
     UnitsSubButtonFirstField.click();
    }

    @FindBy(xpath = "//input[3]")
    private WebElement inputValidDataUnitSubButtonFirstField;
    public void inputValidDataUnitSubButtonFirstField(String Unit) {
        inputValidDataUnitSubButtonFirstField.sendKeys(Unit);
    }

    //IngredientsSECOND

    @FindBy(xpath = "//div[4]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement IngredientsAddButton;
    public void IngredientsAddButton() {
     IngredientsAddButton.click();
    }

    @FindBy(xpath = "//div[4]/div[3]/input[@class='input py-2 input-primary col-span-5']")
    private WebElement IngredientsSubButtonSecondField;
    public void IngredientsSubButtonSecondField() {
        IngredientsSubButtonSecondField.click();
    }

    @FindBy(xpath = "//div[4]/div[3]/input[@class='input py-2 input-primary col-span-5']")
    private WebElement inputValidDataIngredientsSubButtonSecondField;
    public void inputValidDataIngredientsSubButtonSecondField(String IngredientsSecond) {
        inputValidDataIngredientsSubButtonSecondField.sendKeys(IngredientsSecond);
    }


    @FindBy(xpath = "//div[4]/div[3]/input[@value='0']")
    private WebElement AmtSubButtonSecondField;
    public void AmtSubButtonSecondField() {
     AmtSubButtonSecondField.click();
    }

    @FindBy(xpath = "//div[4]/div[3]/input[@value='0']")
    private WebElement inputValidDataAmtSubButtonSecondFieldClear;
    public void inputValidDataAmtSubButtonSecondFieldClear() {
            inputValidDataAmtSubButtonSecondFieldClear.clear();
    }
     @FindBy(xpath = "//div[4]/div[3]/input[@value='0']")
     private WebElement inputValidDataAmtSubButtonSecondField;
     public void inputValidDataAmtSubButtonSecondField(int AmtSecond) {
         inputValidDataAmtSubButtonSecondField.sendKeys(String.valueOf(AmtSecond));
    }

    @FindBy(xpath = "//div[4]/div[3]/input[3]")
    private WebElement UnitsSubButtonSecondField;
    public void UnitsSubButtonSecondField() {
     UnitsSubButtonSecondField.click();
    }

    @FindBy(xpath = "//div[4]/div[3]/input[3]")
    private WebElement inputValidDataUnitSubButtonSecondField;
    public void inputValidDataUnitSubButtonSecondField(String UnitSecond) {
        inputValidDataUnitSubButtonSecondField.sendKeys(UnitSecond);
    }

    //IngredientsTHIRD

    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[@class='input py-2 input-primary col-span-5']")
    private WebElement IngredientsSubButtonThirdField;
    public void IngredientsSubButtonThirdField() {
        IngredientsSubButtonThirdField.click();
    }


    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[@class='input py-2 input-primary col-span-5']")
    private WebElement inputValidDataIngredientsSubButtonThirdField;
    public void inputValidDataIngredientsSubButtonThirdField(String IngredientsThird) {
        inputValidDataIngredientsSubButtonThirdField.sendKeys(IngredientsThird);
    }


    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[@value='0']")
    private WebElement AmtSubButtonThirdField;
    public void AmtSubButtonThirdField() {
     AmtSubButtonThirdField.click();
    }

    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[@value='0']")
    private WebElement inputValidDataAmtSubButtonThirdFieldClear;
    public void inputValidDataAmtSubButtonThirdFieldClear() {
            inputValidDataAmtSubButtonThirdFieldClear.clear();
    }

     @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[@value='0']")
     private WebElement inputValidDataAmtSubButtonThirdField;
     public void inputValidDataAmtSubButtonThirdField(int AmtThird) {
         inputValidDataAmtSubButtonThirdField.sendKeys(String.valueOf(AmtThird));
    }

    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[3]")
    private WebElement UnitsSubButtonThirdField;
    public void UnitsSubButtonThirdField() {
     UnitsSubButtonThirdField.click();
    }

    @FindBy(xpath = "//form[@class='w-full flex flex-col my-2 gap-2 px-4']//div[4]/input[3]")
    private WebElement inputValidDataUnitSubButtonThirdField;
    public void inputValidDataUnitSubButtonThirdField(String UnitThird) {
        inputValidDataUnitSubButtonThirdField.sendKeys(UnitThird);
    }


    //DirectionsFIRST

    @FindBy(xpath = "//div[5]//button[@class='btn btn-circle btn-sm btn-ghost text-2xl text-primary']")
    private WebElement DirectionsAddButton;
    public void DirectionsAddButton() {
     DirectionsAddButton.click();
    }

    @FindBy(xpath = "//textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement DirectionsFirstField;
    public void DirectionsFirstField() {
        DirectionsFirstField.click();
    }

    @FindBy(xpath = "//textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement inputValidDataDirectionsFirstField;
    public void inputValidDataDirectionsFirstField(String DirectionsFirst) {
        inputValidDataDirectionsFirstField.sendKeys(DirectionsFirst);
    }

//    DirectionsSECOND

    @FindBy(xpath = "//div[5]/div[3]/textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement DirectionsSecondField;
    public void DirectionsSecondField() {
        DirectionsSecondField.click();
    }

    @FindBy(xpath = "//div[5]/div[3]/textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement inputValidDataDirectionsSecondField;
    public void inputValidDataDirectionsSecondField(String DirectionsSecond) {
        inputValidDataDirectionsSecondField.sendKeys(DirectionsSecond);
    }

//    DirectionsTHIRD

    @FindBy(xpath = "//div[5]/div[4]/textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement DirectionsThirdField;
    public void DirectionsThirdField() {
        DirectionsThirdField.click();
    }

    @FindBy(xpath = "//div[5]/div[4]/textarea[@class='input h-20 py-2 input-primary col-span-11']")
    private WebElement inputValidDataDirectionsThirdField;
    public void inputValidDataDirectionsThirdField(String DirectionsThird) {
        inputValidDataDirectionsThirdField.sendKeys(DirectionsThird);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary w-1/2 self-end mt-2']")
    private WebElement SubmitRecipe;
    public void SubmitRecipe() {
        SubmitRecipe.click();
    }



}
