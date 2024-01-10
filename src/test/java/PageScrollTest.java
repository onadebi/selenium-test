import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.nio.file.Paths;

public class PageScrollTest {

    private static WebDriver _driver;
    public PageScrollTest(){
        System.out.println("****Constructor - Initializing Chrome Driver");
        //get current directory
        String currentDir = System.getProperty("user.dir");
        String fullPath = Paths.get(currentDir, "drivers","X64", "chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver", fullPath);

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        _driver  = new ChromeDriver(options);
        _driver.manage().window().maximize();
    }

    @Test
    void inputKeyPress() throws InterruptedException{
//        _driver.navigate().to("https://formy-project.herokuapp.com/scroll");
//        WebElement address = _driver.findElement(By.id("autocomplete"));
//        address.click();
//        address.sendKeys("1555 Park Blvd, Palo Alto, CA");

        Thread.sleep(5000);
    }

    @AfterAll
    static void tearDown(){
        System.out.println("****TearDown - Closing Chrome Driver");
        _driver.quit();
    }
}
