package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessPage {
    private WebDriver driver;
    private By congratulationMessage = By.tagName("strong");
    private By logoutButton = By.cssSelector("a.wp-block-button__link.has-very-dark-gray-background-color");

    public SuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getCongratulationMessage() {
        return driver.findElement(congratulationMessage).getText();
    }

    public boolean isLogoutButtonDisplayed() {
        return driver.findElement(logoutButton).isDisplayed();
    }
}
