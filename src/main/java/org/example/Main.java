package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class Main {
    static WebDriver webDriver;
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        System.out.println("Hello world!");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
//        WebDriverManager.chromedriver().setup();
//        webDriver = new ChromeDriver(options);
        String newspaperHost = "http://localhost:4444/wd/hub";
        webDriver = new RemoteWebDriver(new URI(newspaperHost).toURL(), options);
        webDriver.get("https://www.google.com/");
        System.out.printf(webDriver.getTitle());
        webDriver.quit();
    }


}