package com.travelers.tests;

import com.travelers.pages.HomePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchHotelTests extends BaseSeleniumTest {

    @Test
    public void searchHotelTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage homePage = new HomePage(driver);
        homePage.setCityHotel("Dubai");
        homePage.setDateRange("09/11/2021", "09/12/2021");
        homePage.clickOnTravelersModal();
        homePage.addAdult();
        homePage.addChild();
        homePage.performSearch();
        homePage.getHotelNames();

    }
}
