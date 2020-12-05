package Monkees.Pages.TourInfoPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TourInfoPagePOM {

    String budapestButtonCSS = "body > section > div > div:nth-child(1) > div.col-md-1.col-sm-1.col-xs-2.button-position > button";
    String monacoBuyButtonCSS = "body > section > div > div:nth-child(2) > div.col-md-1.col-sm-1.col-xs-1.button-position > button";
    String osloBuyButtonCSS = "body > section > div > div:nth-child(3) > div.col-md-1.col-sm-1.col-xs-1.button-position > button";
    String helsinkiBuyButtonCSS = "body > section > div > div:nth-child(4) > div.col-md-1.col-sm-1.col-xs-1.button-position > button";
    String belgradeBuyButtonCSS = "body > section > div > div:nth-child(5) > div.col-md-1.col-sm-1.col-xs-1.button-position > button";
    String ankaraBuyButtonCSS = "body > section > div > div:nth-child(6) > div.col-md-1.col-sm-1.col-xs-1.button-position > button";

    WebElement budapestBuyButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(budapestButtonCSS));
    }

    WebElement monacoBuyButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(monacoBuyButtonCSS));
    }

    WebElement osloBuyButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(osloBuyButtonCSS));
    }

    WebElement helsinkiBuyButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(helsinkiBuyButtonCSS));
    }

    WebElement belgradeBuyButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(belgradeBuyButtonCSS));
    }

    WebElement ankaraBuyButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(ankaraBuyButtonCSS));
    }
}
