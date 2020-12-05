package Monkees.Pages.MediaPage;

import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MediaPageTest {

    WebDriver driver = new BaseUtil().getDriver();
    GeneralTests generalTests = new GeneralTests();
    BaseUtil baseUtil = new BaseUtil();

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = baseUtil.setUpTest(browser, headless);
    }

    @Test
    public void checkNavigationBar() {
        navigationToMediaPage(driver);
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
    }

    @Test
    public void checkFooterContent() {
        navigationToMediaPage(driver);
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
    }

    public void navigationToMediaPage(WebDriver driver) {
        generalTests.navigationToMediaPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}