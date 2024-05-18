import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    @Test
    public void test() {
        WebDriver driver;
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:/app");

        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

//        Fill input username and password
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

//        Verify the URL matches the expected URL
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);

//        Verify the new page contains the expected text 'Congratulations'
        WebElement congratulationMessage = driver.findElement(By.tagName("strong"));
        assertTrue(congratulationMessage.getText().contains("Congratulations"));

//        Verify the Log out button is displayed on the new page
        WebElement logoutButton = driver.findElement(By.cssSelector("a.wp-block-button__link.has-very-dark-gray-background-color"));
        assertTrue(logoutButton.isDisplayed());

//        Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

//        Quit the driver
        driver.quit();

    }


}
