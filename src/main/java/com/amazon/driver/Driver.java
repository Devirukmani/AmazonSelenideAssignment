package com.amazon.driver;

import com.amazon.config.ConfigFactory;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Selenide.*;


public final class Driver {

    private Driver(){}

    private static final String URL = ConfigFactory.getConfig().url();

    public static void initDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        open(URL);
    }

    public static void quitDriver(){
        WebDriverRunner.getWebDriver().quit();
    }
}
