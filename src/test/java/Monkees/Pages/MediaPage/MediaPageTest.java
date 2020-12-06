package Monkees.Pages.MediaPage;

import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MediaPageTest extends MediaPagePOM {

    WebDriver driver = new BaseUtil().getDriver();
    GeneralTests generalTests = new GeneralTests();
    BaseUtil baseUtil = new BaseUtil();
    Logger logger = LogManager.getLogger(MediaPageTest.class);

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

    @Test
    public void checkMediaTitles() {
        navigationToMediaPage(driver);
        checklastTrainToClarksVilleTitle();
        checkDaydreamBelieverTitle();
        checkIAmABeliverTitle();
        checkSteppingStoneTitle();
    }

    @Test
    public void checkCoverImages() {
        navigationToMediaPage(driver);
        checkLastTrainToClarksVilleCoverImage();
        checkDaydreamBelieverCoverImage();
        checkIAmABeliverCoverImage();
        checkSteppingStoneCoverImage();
    }

    @Test
    public void checkMediaPlayers() {
        navigationToMediaPage(driver);
        checkLastTrainToClarksVilleMedia();
        checkDaydreamBelieverMedia();
        checkIAmABeliverMedia();
        checkSteppingStoneMedia();
        checkVideoMedia();
    }

    // Navigation
    public void navigationToMediaPage(WebDriver driver) {
        generalTests.navigationToMediaPage(driver);
    }

    // Title check
    public void checklastTrainToClarksVilleTitle() {
        lastTrainToClarksVilleTitleCSS(driver).isDisplayed();
        checkTitles(lastTrainToClarksVilleTitleCSS(driver), lastTrainToClarksVilleTitle);
    }

    public void checkDaydreamBelieverTitle() {
        daydreamBelieverTitleCSS(driver).isDisplayed();
        checkTitles(daydreamBelieverTitleCSS(driver), daydreamBelieverTitle);
    }

    public void checkIAmABeliverTitle() {
        iAmABeliverTitleCSS(driver).isDisplayed();
        checkTitles(iAmABeliverTitleCSS(driver), iAmABeliverTitle);
    }

    public void checkSteppingStoneTitle() {
        steppingStoneTitleCSS(driver).isDisplayed();
        checkTitles(steppingStoneTitleCSS(driver), steppingStoneTitle);
    }

    public void checkTitles(WebElement element, String title) {
        Assert.assertEquals(element.getText(), title);
    }

    // Image Check

    public void checkLastTrainToClarksVilleCoverImage() {
        lastTrainToClarksVilleImageCSS(driver).isDisplayed();
        checkAttributes(lastTrainToClarksVilleImageCSS(driver), lastTrainToClarksVilleSRC);
    }

    public void checkDaydreamBelieverCoverImage() {
        daydreamBelieverImageCSS(driver).isDisplayed();
        checkAttributes(daydreamBelieverImageCSS(driver), daydreamBelieverSRC);
    }

    public void checkIAmABeliverCoverImage() {
        iAmABeliverImageCSS(driver).isDisplayed();
        checkAttributes(iAmABeliverImageCSS(driver), iAmABeliverSRC);
    }

    public void checkSteppingStoneCoverImage() {
        steppingStoneImageCSS(driver).isDisplayed();
        checkAttributes(steppingStoneImageCSS(driver), steppingStoneSRC);
    }

    public void checkAttributes(WebElement element, String SRC) {
        Assert.assertEquals(element.getAttribute("src"), SRC);
    }

    // Media check
    public void checkLastTrainToClarksVilleMedia() {
        lastTrainToClarksVilleMediaCSS(driver).isDisplayed();
        lastTrainToClarksVilleMediaCSS(driver).isEnabled();
        checkAttributes(lastTrainToClarksVilleMediaCSS(driver), lastTrainToClarksVilleMediaSRC);
    }

    public void checkDaydreamBelieverMedia() {
        daydreamBelieverMediaCSS(driver).isDisplayed();
        daydreamBelieverMediaCSS(driver).isEnabled();
        checkAttributes(daydreamBelieverMediaCSS(driver), daydreamBelieverMediaSRC);
    }

    public void checkIAmABeliverMedia() {
        iAmABeliverMediaCSS(driver).isDisplayed();
        iAmABeliverMediaCSS(driver).isEnabled();
        checkAttributes(iAmABeliverMediaCSS(driver), iAmABeliverMediaSRC);
    }

    public void checkSteppingStoneMedia() {
        steppingStoneMediaCSS(driver).isDisplayed();
        steppingStoneMediaCSS(driver).isEnabled();
        checkAttributes(steppingStoneMediaCSS(driver), steppingStoneMediaSRC);
    }

    public void checkVideoMedia() {
        videoMediaCSS(driver).isDisplayed();
        videoMediaCSS(driver).isEnabled();
        checkAttributes(videoMediaCSS(driver), videoMediaSRC);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}