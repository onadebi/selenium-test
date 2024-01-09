package com.onaxsys;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Paths;

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

    private WebDriver _driver;
    private final ChromeOptions options;

    public AppTest()
    {
        options = new ChromeOptions();
        // options.addArguments("--headless");
        _driver  = new ChromeDriver(options);
        _driver.manage().window().maximize();
        String currentDir = System.getProperty("user.dir");
        String fullPath = Paths.get(currentDir, "drivers","X64", "chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver", fullPath);
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Setup - Initializing Chrome Driver");        
        //get current directory
        _driver.get("https://www.onaxsys.com");
    }

    @AfterAll
    public void tearDown() {
        System.out.println("TearDown - Closing Chrome Driver");
        _driver.quit();
    }


    /**
     * MethodName: shouldAnswerWithTrue
     * Description: Test method
     * @return void
     * Purpose: Test method
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
