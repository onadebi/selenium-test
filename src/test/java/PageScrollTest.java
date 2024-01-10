import configs.BaseChromeTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.nio.file.Paths;

public class PageScrollTest extends BaseChromeTest {

    @Test
    void inputKeyPress() throws InterruptedException{
        _driver.navigate().to("https://formy-project.herokuapp.com/scroll");
//        WebElement address = _driver.findElement(By.id("autocomplete"));
//        address.click();
//        address.sendKeys("1555 Park Blvd, Palo Alto, CA");

        Thread.sleep(5000);
    }

}
