import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    @Test
    public void test() {
        WebDriver driver;
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:/app");

        driver.manage().window().maximize();
        driver.get("https://sv.ugm.ac.id/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }


}
