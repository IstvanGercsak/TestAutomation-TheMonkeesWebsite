package Monkees.Pages.BandPage;

import Monkees.DriverFactory.DriverFactory;
import Monkees.Pages.General.GeneralTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BandPageTest extends BandPagePOM {

    WebDriver driver = new DriverFactory().driver;
    GeneralTests generalTests = new GeneralTests();
    DriverFactory driverFactory = new DriverFactory();

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = driverFactory.setUpTest(browser, headless);
    }

    @Test
    public void checkNavigationBar() {
        navigationToBandPage(driver);
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
    }

    @Test
    public void checkFooterContent() {
        navigationToBandPage(driver);
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
    }

    @Test
    public void bandMemberNameIsVisible() {
        navigationToBandPage(driver);
        davyJonesNameIsVisibleAndCorrect();
        mickyDolenzNameIsVisibleAndCorrect();
        michaelNesmithNameIsVisibleAndCorrect();
        peterTorkNameIsVisibleAndCorrect();
    }

    @Test
    public void bandMemberImageIsVisible() {
        navigationToBandPage(driver);
        davyJonesImageIsVisibleAndHasCorrectAlt();
        mickyDolenzImageIsVisibleAndHasCorrectAlt();
        michaelNesmithImageIsVisibleAndHasCorrectAlt();
        peterTorkImageIsVisibleAndHasCorrectAlt();
    }

    // Navigation to the site
    public void navigationToBandPage(WebDriver driver) {
        generalTests.navigationToBandPage(driver);
    }

    // Check Names
    public void davyJonesNameIsVisibleAndCorrect() {
        davyJonesCSS(driver).isDisplayed();
        nameIsVisible(davyJonesCSS(driver), davyJones);
    }

    public void mickyDolenzNameIsVisibleAndCorrect() {
        mickyDolenzCSS(driver).isDisplayed();
        nameIsVisible(mickyDolenzCSS(driver), mickyDolenz);
    }

    public void michaelNesmithNameIsVisibleAndCorrect() {
        michaelNesmithCSS(driver).isDisplayed();
        nameIsVisible(michaelNesmithCSS(driver), michaelNesmith);
    }

    public void peterTorkNameIsVisibleAndCorrect() {
        peterTorkCSS(driver).isDisplayed();
        nameIsVisible(peterTorkCSS(driver), peterTork);
    }

    public void nameIsVisible(WebElement element, String name) {
        Assert.assertEquals(element.getText(), name);
    }

    // Check Images
    public void davyJonesImageIsVisibleAndHasCorrectAlt() {
        davyJonesImageCSS(driver).isDisplayed();
        hasTheRightAltAttribute(davyJonesImageCSS(driver), davyJones);
    }

    public void mickyDolenzImageIsVisibleAndHasCorrectAlt() {
        mickyDolenzImageCSS(driver).isDisplayed();
        hasTheRightAltAttribute(mickyDolenzImageCSS(driver), mickyDolenz);
    }

    public void michaelNesmithImageIsVisibleAndHasCorrectAlt() {
        michaelNesmithImageCSS(driver).isDisplayed();
        hasTheRightAltAttribute(michaelNesmithImageCSS(driver), michaelNesmith);
    }

    public void peterTorkImageIsVisibleAndHasCorrectAlt() {
        peterTorkImageCSS(driver).isDisplayed();
        hasTheRightAltAttribute(peterTorkImageCSS(driver), peterTork);
    }

    public void hasTheRightAltAttribute(WebElement element, String altAttribute) {
        Assert.assertEquals(element.getAttribute("alt"), altAttribute);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}