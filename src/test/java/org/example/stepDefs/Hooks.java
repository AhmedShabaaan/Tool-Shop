package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void openBrowser(){

        //define bridge if needed either using System property() or using WebDriverManger
        String browserName = configreader.get("browserName");
        System.out.println(browserName);
        //create new object from different browsers

        if (browserName.contains("chrome"))
        {
            driver = new  ChromeDriver();

        }
        else if (browserName.contains("firefox"))
        {
            driver = new FirefoxDriver();

        }
// maximize , implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://practicesoftwaretesting.com/");
    }


    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();



    }
}
