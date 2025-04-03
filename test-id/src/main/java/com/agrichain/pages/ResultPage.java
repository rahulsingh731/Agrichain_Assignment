package com.agrichain.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ResultPage {
	
	public WebDriver driver;
	
	@FindBy(id = "resultOutput")
    private WebElement resultOutput;

    // Constructor
    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize elements with PageFactory
    }

    // Method to get the result text
    public String getResult() {
        return resultOutput.getText();
    }

    // Method to check if result is displayed
    public boolean isResultDisplayed() {
        return resultOutput.isDisplayed();
    }
}
