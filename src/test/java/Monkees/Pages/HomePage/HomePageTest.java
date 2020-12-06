package Monkees.Pages.HomePage;

import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class HomePageTest extends HomePagePOM {

    WebDriver driver = new BaseUtil().getDriver();
    GeneralTests generalTests = new GeneralTests();
    BaseUtil baseUtil = new BaseUtil();
    Logger logger = LogManager.getLogger(HomePageTest.class);

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = baseUtil.setUpTest(browser, headless);
    }

    @Test
    public void checkNavigationBar() {
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
    }

    @Test
    public void checkFooterContent() {
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
    }

    @Test
    public void checkBackgroundImage() {
        checkBackgroundImageIsVisibleAndAttributes();
    }

    public void checkBackgroundImageIsVisibleAndAttributes() {
        backgroundPictureElement(driver).isEnabled();
        backgroundPictureElement(driver).isDisplayed();
        checkAttributes(backgroundPictureElement(driver), backgroundPictureSRC, backgroundPictureAlt);
    }

    public void checkAttributes(WebElement element, String src, String alt) {
        Assert.assertEquals(element.getAttribute("src"), src);
        Assert.assertEquals(element.getAttribute("alt"), alt);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}