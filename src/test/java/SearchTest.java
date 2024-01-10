import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Paths;

public class SearchTest {

    private static WebDriver _driver;
    public SearchTest(){
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
    void contentSearchTest() throws InterruptedException {
        System.out.println("****Navigating to Google.com");
        _driver.navigate().to("https://google.com");
        WebElement searchBox = _driver.findElement(By.name("q"));

        searchBox.sendKeys("Onaxsys Ventures");
        searchBox.submit();
        Thread.sleep(5000);
    }


    @Test
    void inputKeyPress() throws InterruptedException{
        _driver.navigate().to("https://formy-project.herokuapp.com/keypress");
        WebElement name = _driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Onadebi");

        WebElement btnSubmit = _driver.findElement(By.id("button"));
        btnSubmit.click();

        Thread.sleep(5000);
    }

    @AfterAll
    static void tearDown(){
        System.out.println("****TearDown - Closing Chrome Driver");
        _driver.quit();
    }
}
