package com.agrichain.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.agrichain.pages.HomePage;
import com.agrichain.pages.ResultPage;



public class TestSubstring {
    private WebDriver driver;
    
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://agrichain.com");
    }
    
    @Test
    public void testValidInput() {
        HomePage home = new HomePage(driver);
        home.enterString("abcabcbb");
        home.clickSubmit();
        
        ResultPage result = new ResultPage(driver);
        Assert.assertEquals(result.getResult(), "3");
	        Assert.assertTrue(result.isResultDisplayed());
	    }
	    
	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	}
