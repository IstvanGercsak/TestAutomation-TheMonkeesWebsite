package Monkees.Pages.Base;

import Monkees.Base.NecessaryItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseUtil {

    public String website = "https://istvangercsak.github.io/TheMonkees/index.html";
    public WebDriver driver;

    ChromeOptions chromeOptions = new ChromeOptions();
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    NecessaryItems necessaryItems = new NecessaryItems();

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriver setUpTest(String browser, String headless) {

        switch (browser) {
            case "Chrome":
                System.setProperty(
                        necessaryItems.getSystemChromePropertyKey(),
                        necessaryItems.getChromeDriverRoute());
                if (headless.equals("true")) {
                    chromeOptions.addArguments("headless");
                    driver = new ChromeDriver(chromeOptions);
                } else
                    driver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty(
                        necessaryItems.getSystemFirefoxPropertyKey(),
                        necessaryItems.getGeckoDriverRoute());
                if (headless.equals("true")) {
                    firefoxOptions.addArguments("--headless");
                    driver = new FirefoxDriver(firefoxOptions);
                } else
                    driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(website);
        return driver;
    }

}
