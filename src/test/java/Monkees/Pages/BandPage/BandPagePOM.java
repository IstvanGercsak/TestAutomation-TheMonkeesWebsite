package Monkees.Pages.BandPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BandPagePOM {

    String davyJones = "Davy Jones";
    String mickyDolenz = "Micky Dolenz";
    String michaelNesmith = "Michael Nesmith";
    String peterTork = "Peter Tork";

    String davyJonesCSS = "body > section > div > div > div:nth-child(1) > div.col-md-5.col-md-offset-1.band-member-position > h2";
    String mickyDolenzCSS = "body > section > div > div > div:nth-child(1) > div:nth-child(2) > h2";
    String michaelNesmithCSS = "body > section > div > div > div:nth-child(2) > div.col-md-5.col-md-offset-1.band-member-position > h2";
    String peterTorkCSS = "body > section > div > div > div:nth-child(2) > div:nth-child(2) > h2";

    String davyJonesImageCSS = "body > section > div > div > div:nth-child(1) > div.col-md-5.col-md-offset-1.band-member-position > p > img";
    String mickyDolenzImageCSS = "body > section > div > div > div:nth-child(1) > div:nth-child(2) > p > img";
    String michaelNesmithImageCSS = "body > section > div > div > div:nth-child(2) > div.col-md-5.col-md-offset-1.band-member-position > p > img";
    String peterTorkImageCSS = "body > section > div > div > div:nth-child(2) > div:nth-child(2) > p > img";

    // Names
    WebElement davyJonesCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(davyJonesCSS));
    }

    WebElement michaelNesmithCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(michaelNesmithCSS));
    }

    WebElement peterTorkCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(peterTorkCSS));
    }

    WebElement mickyDolenzCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(mickyDolenzCSS));
    }

    // Images
    WebElement davyJonesImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(davyJonesImageCSS));
    }

    WebElement mickyDolenzImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(mickyDolenzImageCSS));
    }

    WebElement michaelNesmithImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(michaelNesmithImageCSS));
    }

    WebElement peterTorkImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(peterTorkImageCSS));
    }

}
