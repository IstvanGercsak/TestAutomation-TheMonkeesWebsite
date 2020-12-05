package Monkees.Pages.HomePage;

import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class HomePageTest {

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
    public void imageCheck() {
        //TODO
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}