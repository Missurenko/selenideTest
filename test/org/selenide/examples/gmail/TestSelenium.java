package org.selenide.examples.gmail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ${bohdan.missurenko} on 6/14/2018.
 */
public class TestSelenium {

    String patch = "chromedriver.exe";

    @Test
    public void quest() throws InterruptedException {

        String gmailPassword = System.getProperty("gmail.password", "HelloHowAreYou");

        System.setProperty("webdriver.chrome.driver", patch);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseUrl = "http://www.google.co.uk/";
        driver.get(baseUrl);
        driver.findElement(By.linkText("Увійти")).click();
        driver.findElement(By.cssSelector("input")).sendKeys("work.b.missurenko@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.className("qhFLie")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("HelloHowAreYou");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.className("RveJvd")).click();
        driver.findElement(By.className("gb_Sc")).findElement(By.cssSelector("a")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText("Диск")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.findElement(By.className("l-u-Ab-zb-Pn-ve"));
        driver.quit();
    }
}
