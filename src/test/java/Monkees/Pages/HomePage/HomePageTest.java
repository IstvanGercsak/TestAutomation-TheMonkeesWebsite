package Monkees.Pages.HomePage;

import Monkees.DriverFactory.DriverFactory;
import Monkees.Pages.General.GeneralTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class HomePageTest extends HomePagePOM {

    WebDriver driver = new DriverFactory().getDriver();
    GeneralTests generalTests = new GeneralTests();
    DriverFactory driverFactory = new DriverFactory();
    Logger logger = LogManager.getLogger(HomePageTest.class);

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = driverFactory.setUpTest(browser, headless);
    }

    @Test
    public void checkNavigationBar() {
        logger.info("Start: Navigation bar test on the Home Page");
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
        logger.info("End: Navigation bar test on the Home Page");
    }

    @Test
    public void checkFooterContent() {
        logger.info("Start: Footer bar test on the Home Page");
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
        logger.info("End: Footer bar test on the Home Page");
    }

    @Test
    public void checkBackgroundImage() {
        checkBackgroundImageIsVisibleAndAttributes();
    }

    public void checkBackgroundImageIsVisibleAndAttributes() {
        logger.info("Start: Background image test on the Home Page");
        backgroundPictureElement(driver).isEnabled();
        backgroundPictureElement(driver).isDisplayed();
        checkAttributes(backgroundPictureElement(driver), backgroundPictureSRC, backgroundPictureAlt);
        logger.info("End: Background image test on the Home Page");
    }

    public void checkAttributes(WebElement element, String src, String alt) {
        Assert.assertEquals(element.getAttribute("src"), src);
        Assert.assertEquals(element.getAttribute("alt"), alt);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        logger.info("Browser closed. Test finished.");
    }

}