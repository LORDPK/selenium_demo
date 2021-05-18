package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseTest {
    protected WebDriver _driver;
    protected ChromeOptions opt;

    @BeforeClass
    public void beforeSuite(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver.exe");
        opt = new ChromeOptions();
        opt.addArguments("--no-sandbox");
    }

    @BeforeMethod
    public void beforeTest(){
        _driver = new ChromeDriver(opt);
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void afterTest(){
        _driver.close();
        _driver.quit();
    }
}