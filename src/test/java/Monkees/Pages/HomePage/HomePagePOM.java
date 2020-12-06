package Monkees.Pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePOM {

    String backgroundPicture = "body > section > div > div:nth-child(2) > img";

    String backgroundPictureSRC = "https://istvangercsak.github.io/TheMonkees/assets/images/monkees.jpg";

    String backgroundPictureAlt = "TheMonkees";

    public WebElement backgroundPictureElement(WebDriver driver) {
        return driver.findElement(By.cssSelector(backgroundPicture));
    }
}
