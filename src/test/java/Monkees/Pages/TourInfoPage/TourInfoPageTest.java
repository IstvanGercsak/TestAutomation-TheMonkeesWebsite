package Monkees.Pages.TourInfoPage;

import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TourInfoPageTest extends TourInfoPagePOM {

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
        navigationToTourInfoPage(driver);
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
    }

    @Test
    public void checkFooterContent() {
        navigationToTourInfoPage(driver);
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
    }

    @Test
    public void buttonsAreActiveAndInactive() {
        navigationToTourInfoPage(driver);
        budapestBuyTicketButtonIsVisibleAndInactive();
        monacoBuyTicketButtonIsVisibleAndInactive();
        osloBuyTicketButtonIsVisibleAndActive();
        helsinkiBuyTicketButtonIsVisibleAndActive();
        belgradeBuyTicketButtonIsVisibleAndInactive();
        AnkaraBuyTicketButtonIsVisibleAndActive();
    }

    public void navigationToTourInfoPage(WebDriver driver) {
        generalTests.navigationToTourInfoPage(driver);
    }

    public void budapestBuyTicketButtonIsVisibleAndInactive() {
        budapestBuyButton(driver).isDisplayed();
        checkBuyButtonNotClickable(budapestBuyButton(driver));
    }

    public void monacoBuyTicketButtonIsVisibleAndInactive() {
        monacoBuyButton(driver).isDisplayed();
        checkBuyButtonClickable(monacoBuyButton(driver));
    }

    public void osloBuyTicketButtonIsVisibleAndActive() {
        osloBuyButton(driver).isDisplayed();
        checkBuyButtonClickable(osloBuyButton(driver));
    }

    public void helsinkiBuyTicketButtonIsVisibleAndActive() {
        helsinkiBuyButton(driver).isDisplayed();
        checkBuyButtonClickable(helsinkiBuyButton(driver));
    }

    public void belgradeBuyTicketButtonIsVisibleAndInactive() {
        belgradeBuyButton(driver).isDisplayed();
        checkBuyButtonNotClickable(belgradeBuyButton(driver));
    }

    public void AnkaraBuyTicketButtonIsVisibleAndActive() {
        ankaraBuyButton(driver).isDisplayed();
        checkBuyButtonClickable(ankaraBuyButton(driver));
    }

    public void checkBuyButtonClickable(WebElement monacoBuyTicketButton) {
        Assert.assertTrue(monacoBuyTicketButton.isEnabled());
    }

    public void checkBuyButtonNotClickable(WebElement monacoBuyTicketButton) {
        Assert.assertFalse(monacoBuyTicketButton.isEnabled());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
