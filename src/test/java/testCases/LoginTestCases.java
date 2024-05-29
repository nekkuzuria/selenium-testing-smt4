package com.example.tests;

import com.example.pages.LoginPage;
import com.example.pages.SuccessPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTestCases {
    @Test
    public void test() {
        WebDriver driver;
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:/app");
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //LoginPage
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.setUsername("student");
        loginPage.setPassword("Password123");
        loginPage.submit();

        //SuccessPage
        SuccessPage successPage = new SuccessPage(driver);
        assertEquals("https://practicetestautomation.com/logged-in-successfully/", successPage.getCurrentUrl());
        assertTrue(successPage.getCongratulationMessage().contains("Congratulations"));
        assertTrue(successPage.isLogoutButtonDisplayed());

        // Print the title of the page
        System.out.println(driver.getTitle());

        // Quit the driver
        driver.quit();
    }
}
