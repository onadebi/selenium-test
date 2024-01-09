package com.onaxsys;

import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Paths;

import com.onaxsys.data.WebsiteData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static WebDriver _driver;

    public AppTest() {
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

    
    @BeforeEach
    public void setUp() {
        System.out.println("****Setup - Initializing Chrome Driver");
    }

    /**
     * Rigorous Test :-)
     */


    @Test
    public void WebsiteHomePageHasTitle()
    {
        _driver.navigate().to("https://onaxsys.com/");
        String title = _driver.getTitle();
        assertNotNull(title);
    }

    @Test
    public void AllWebsitePagesHaveTitle(){
        for(String weblink : WebsiteData.WeblinkData()) {
            if(weblink.isEmpty())
                continue;
            _driver.navigate().to(weblink);
            String title = _driver.getTitle();
            assertFalse(title.isEmpty());
        }
    }


    @AfterAll
    public static void shutDown() {
        System.out.println("****TearDown - Closing Chrome Driver");
        _driver.quit();
    }
}
