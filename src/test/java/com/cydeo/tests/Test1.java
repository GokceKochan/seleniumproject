package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {
        //setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //create instance of the chrome driver
        WebDriver driver=new ChromeDriver();

        //Test if driver is working as expected
        driver.get("https://www.google.com");
    }
}
