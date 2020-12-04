package Monkees;

import Monkees.Base.NecessaryItems;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SetUp {

    private WebDriver driver;
    NecessaryItems necessaryItems = new NecessaryItems();
    String website = "https://istvangercsak.github.io/TheMonkees/index.html";

    @BeforeClass
    public void setUp() {
        String key = "webdriver.chrome.driver";
        System.setProperty(key, necessaryItems.getChromeDriverRoute());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website);
    }

    @Test
    public void FirstTest() {
        Assert.assertEquals(driver.getTitle(), "Main Page");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}