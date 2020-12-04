package Monkees.Pages.General;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralTests {

    String homeNavigationButton = "#nav > li:nth-child(1) > a";
    String homeNavigationButtonHref = "https://istvangercsak.github.io/TheMonkees/index.html";
    String tourInfoNavigationButton = "#nav > li:nth-child(2) > a";
    String tourInfoNavigationButtonHref = "https://istvangercsak.github.io/TheMonkees/tourinfo.html";
    String bandNavigationButton = "#nav > li:nth-child(3) > a";
    String bandNavigationButtonHref = "https://istvangercsak.github.io/TheMonkees/band.html";
    String mediaNavigationButton = "#nav > li:nth-child(4) > a";
    String mediaNavigationButtonHref = "https://istvangercsak.github.io/TheMonkees/media.html";
    String contactNavigationButton = "#nav > li:nth-child(5) > a";
    String contactNavigationButtonHref = "https://istvangercsak.github.io/TheMonkees/contact.html";

    String socialFacebookIcon = "body > footer > div > div.col-md-4.footer-color > ul > li:nth-child(1) > a";
    String socialFacebookIconHref = "https://www.facebook.com/TheMonkees/";
    String socialTwitterIcon = "body > footer > div > div.col-md-4.footer-color > ul > li:nth-child(2) > a";
    String socialTwitterIconHref = "https://twitter.com/TheMonkees";
    String socialYouTubeIcon = "body > footer > div > div.col-md-4.footer-color > ul > li:nth-child(3) > a";
    String socialYouTubeIconHref = "https://www.youtube.com/user/themonkees";
    String socialSpotifyIcon = "body > footer > div > div.col-md-4.footer-color > ul > li:nth-child(4) > a";
    String socialSpotifyIconHref = "https://open.spotify.com/artist/320EPCSEezHt1rtbfwH6Ck";

    public void checkHrefForHomeButton(WebDriver driver) {
        checkHref(driver, this.homeNavigationButton, this.homeNavigationButtonHref);
    }

    public void checkHrefForTourInfoButton(WebDriver driver) {
        checkHref(driver, this.tourInfoNavigationButton, this.tourInfoNavigationButtonHref);
    }

    public void checkHrefForBandButton(WebDriver driver) {
        checkHref(driver, this.bandNavigationButton, this.bandNavigationButtonHref);
    }

    public void checkHrefForMediaButton(WebDriver driver) {
        checkHref(driver, this.mediaNavigationButton, this.mediaNavigationButtonHref);
    }

    public void checkHrefForContactButton(WebDriver driver) {
        checkHref(driver, this.contactNavigationButton, this.contactNavigationButtonHref);
    }

    public void checkHrefForFacebookIcon(WebDriver driver) {
        checkHref(driver, this.socialFacebookIcon, this.socialFacebookIconHref);
    }


    public void checkHrefForTwitterIcon(WebDriver driver) {
        checkHref(driver, this.socialTwitterIcon, this.socialTwitterIconHref);
    }

    public void checkHrefForYouTubeIcon(WebDriver driver) {
        checkHref(driver, this.socialYouTubeIcon, this.socialYouTubeIconHref);
    }

    public void checkHrefForSpotifyIcon(WebDriver driver) {
        checkHref(driver, this.socialSpotifyIcon, this.socialSpotifyIconHref);
    }

    public void checkHref(WebDriver driver, String navigationElement, String navigationHref) {
        Assert.assertEquals(driver.findElement(By.cssSelector(navigationElement)).getAttribute("href"), navigationHref);
    }

    public void navigationToContactPage(WebDriver driver) {
        driver.findElement(By.cssSelector(this.contactNavigationButton)).click();
    }

    public void navigationToMediaPage(WebDriver driver) {
        driver.findElement(By.cssSelector(this.mediaNavigationButton)).click();
    }

    public void navigationToTourInfoPage(WebDriver driver) {
        driver.findElement(By.cssSelector(this.tourInfoNavigationButton)).click();
    }

    public void navigationToBandPage(WebDriver driver) {
        driver.findElement(By.cssSelector(this.bandNavigationButton)).click();
    }

}
