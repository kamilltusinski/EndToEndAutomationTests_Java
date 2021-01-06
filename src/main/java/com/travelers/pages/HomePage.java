package com.travelers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void sendKeysToCityInput(String cityName){
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
    }

}
