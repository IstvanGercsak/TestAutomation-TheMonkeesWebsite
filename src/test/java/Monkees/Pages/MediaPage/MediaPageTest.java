package Monkees.Pages.MediaPage;

import Monkees.Base.NecessaryItems;
import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MediaPageTest {

    WebDriver driver = new BaseUtil().getDriver();
    GeneralTests generalTests = new GeneralTests();
    NecessaryItems necessaryItems = new NecessaryItems();
    String website = new BaseUtil().getWebsite();

    @BeforeMethod
    public void setUp() {
        String key = "webdriver.chrome.driver";
        System.setProperty(key, necessaryItems.getChromeDriverRoute());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website);
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