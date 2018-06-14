package org.selenide.examples.gmail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ${bohdan.missurenko} on 6/14/2018.
 */
public class TestSelenium {

    private final String patch = "drivers/chromedriver.exe";

    private final String loginName = "work.b.missurenko@gmail.com";

    private final String pass = "HelloHowAreYou";

    @Test
    public void quest() {
        System.setProperty("webdriver.chrome.driver", patch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://www.google.co.uk/";
        driver.get(baseUrl);
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}