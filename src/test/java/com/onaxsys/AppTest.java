package com.onaxsys;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private WebDriver _driver;
    @BeforeEach
    public void setUp() {
        System.out.println("Setup - Initializing Chrome Driver");
         _driver  = new ChromeDriver();
        _driver.get("https://www.google.com");
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
