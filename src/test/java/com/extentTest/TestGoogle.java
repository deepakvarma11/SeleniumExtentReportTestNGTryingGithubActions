package com.extentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestGoogle extends TestBase{

    WebDriver driver;

    @BeforeMethod
    public void start(){
         driver = new ChromeDriver();
    }

    @Test
    public void test01(){
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("q")).sendKeys("deepak varma", Keys.ENTER);
        List<WebElement> elements = driver.findElements(By.className("dURPMd"));
        Assert.assertTrue(elements.size()>0);
    }

    @AfterMethod
    public void finish(){
        driver.quit();
    }
}
