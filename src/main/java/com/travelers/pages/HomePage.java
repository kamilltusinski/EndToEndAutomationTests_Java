package com.travelers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(css = "[class='select2-choice'][href='javascript:void(0)']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    @FindBy(name = "checkin")
    private WebElement checkInInput;

    @FindBy(name = "checkout")
    private WebElement checkOutInput;

    @FindBy(id = "travellersInput")
    private WebElement travellersInput;

    @FindBy(id = "adultPlusBtn")
    private WebElement adultPlusBtn;

    @FindBy(id = "childPlusBtn")
    private WebElement childPlusBtn;

    @FindBy(xpath = "//button[text()=' Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setCityHotel(String cityName) throws InterruptedException {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        Thread.sleep(2000);
        searchCityInput.sendKeys(Keys.ENTER);
    }

    public void setDateRange(String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();

    }

    public void clickOnTravelersModal() throws InterruptedException {
        travellersInput.click();
        Thread.sleep(2000);
    }

    public void addAdult(){
        adultPlusBtn.click();

    }

    public void addChild()  {
        childPlusBtn.click();

    }

    public void performSearch(){
        searchButton.click();

    }


    public void getHotelNames() {
        List<WebElement> hotelNames = resultsTable.findElements(By.xpath(".//h4//b"));
        for (WebElement hotelName : hotelNames) {
            System.out.println(hotelName.getText());
        }
    }


}
