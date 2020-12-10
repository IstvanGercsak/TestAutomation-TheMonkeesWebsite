package Monkees.DriverFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public String website = "https://istvangercsak.github.io/TheMonkees/index.html";
    public WebDriver driver;

    String systemChromePropertyKey = "webdriver.chrome.driver";
    String systemFirefoxPropertyKey = "webdriver.gecko.driver";
    String chromeDriverRoute = "/Users/istvangercsak/IdeaProjects/WebDriver/chromeDriver_mac/87.0.4280.88/chromedriver";
    String geckoDriverRoute = "/Users/istvangercsak/IdeaProjects/WebDriver/firefoxDriver_mac/0.28.0/geckodriver";


    ChromeOptions chromeOptions = new ChromeOptions();
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    Logger logger = LogManager.getLogger(DriverFactory.class);

    public WebDriver setUpTest(String browser, String headless) {

        switch (browser) {
            case "Chrome":
                System.setProperty(
                        systemChromePropertyKey,
                        chromeDriverRoute);
                if (headless.equals("true")) {
                    chromeOptions.addArguments("headless");
                    driver = new ChromeDriver(chromeOptions);
                    logger.info("Headless Chrome browser starts");
                } else
                    driver = new ChromeDriver();
                logger.info("Chrome browser starts");
                break;
            case "Firefox":
                System.setProperty(
                        systemFirefoxPropertyKey,
                        geckoDriverRoute);
                if (headless.equals("true")) {
                    firefoxOptions.addArguments("--headless");
                    driver = new FirefoxDriver(firefoxOptions);
                    logger.info("Headless Firefox browser starts");
                } else
                    driver = new FirefoxDriver();
                logger.info("Headless Firefox browser starts");
                break;
        }
        driver.manage().window().maximize();
        driver.get(website);
        return driver;
    }
}
