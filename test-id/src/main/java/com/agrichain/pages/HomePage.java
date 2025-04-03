package com.agrichain.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
    public WebDriver driver;
    
    @FindBy(id = "stringInput")
    private WebElement inputField;
    
    @FindBy(id = "submitBtn")
    private WebElement submitButton;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void enterString(String text) {
        inputField.sendKeys(text);
    }
    
    public void clickSubmit() {
        submitButton.click();
    }
}
