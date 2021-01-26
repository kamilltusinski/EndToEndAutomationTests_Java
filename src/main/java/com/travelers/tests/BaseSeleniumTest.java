package com.travelers.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        String driverPath = "C:\\Users\\kamil.tusinski\\Desktop\\EndToEndTestAutomation_Java\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
    //    driver.quit();
    }

}
