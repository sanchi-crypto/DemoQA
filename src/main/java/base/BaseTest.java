package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.BrowserFactory;

public class BaseTest {
	protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.getDriver();
        driver.get("https://demoqa.com/login");
    }

    @AfterClass
    public void tearDown() {
        BrowserFactory.quitDriver();
    }
}