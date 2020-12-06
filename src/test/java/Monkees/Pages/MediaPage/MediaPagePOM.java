package Monkees.Pages.MediaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MediaPagePOM {

    // Title
    String lastTrainToClarksVilleTitle = "Last Train to Clarksville";
    String daydreamBelieverTitle = "Daydream Believer";
    String iAmABeliverTitle = "I'm a Believer";
    String steppingStoneTitle = "Steppin' Stone";

    // Title CSS
    String lastTrainToClarksVilleTitleCSS = "body > section > div:nth-child(2) > div:nth-child(1) > h3";
    String daydreamBelieverTitleCSS = "body > section > div:nth-child(2) > div:nth-child(2) > h3";
    String iAmABeliverTitleCSS = "body > section > div:nth-child(3) > div:nth-child(1) > h3";
    String steppingStoneTitleCSS = "body > section > div:nth-child(3) > div:nth-child(2) > h3";

    // Images CSS
    String lastTrainToClarksVilleImageCSS = "body > section > div:nth-child(2) > div:nth-child(1) > div.image-container > img";
    String daydreamBelieverImageCSS = "body > section > div:nth-child(2) > div:nth-child(2) > div.image-container > img";
    String iAmABeliverImageCSS = "body > section > div:nth-child(3) > div:nth-child(1) > div.image-container > img";
    String steppingStoneImageCSS = "body > section > div:nth-child(3) > div:nth-child(2) > div.image-container > img";

    // Image src
    String lastTrainToClarksVilleSRC = "https://istvangercsak.github.io/TheMonkees/assets/images/cover.jpg";
    String daydreamBelieverSRC = "https://istvangercsak.github.io/TheMonkees/assets/images/cover4.jpeg";
    String iAmABeliverSRC = "https://istvangercsak.github.io/TheMonkees/assets/images/album.jpg";
    String steppingStoneSRC = "https://istvangercsak.github.io/TheMonkees/assets/images/album2.jpg";

    // Media player CSS
    String lastTrainToClarksVilleMediaCSS = "body > section > div:nth-child(2) > div:nth-child(1) > div.music-container > audio > source";
    String daydreamBelieverMediaCSS = "body > section > div:nth-child(2) > div:nth-child(2) > div.music-container > audio > source";
    String iAmABeliverMediaCSS = "body > section > div:nth-child(3) > div:nth-child(1) > div.music-container > audio > source";
    String steppingStoneMediaCSS = "body > section > div:nth-child(3) > div:nth-child(2) > div.music-container > audio > source";
    String videoMediaCSS = "body > section > div.row.col-md-12.video-container > div > video > source";

    // Media player SRC

    String lastTrainToClarksVilleMediaSRC = "https://istvangercsak.github.io/TheMonkees/assets/audio/Clarksville.mp3";
    String daydreamBelieverMediaSRC = "https://istvangercsak.github.io/TheMonkees/assets/audio/DaydreamBeliever.mp3";
    String iAmABeliverMediaSRC = "https://istvangercsak.github.io/TheMonkees/assets/audio/ImABeliever.mp3";
    String steppingStoneMediaSRC = "https://istvangercsak.github.io/TheMonkees/assets/audio/SteppingStone.mp3";
    String videoMediaSRC = "https://istvangercsak.github.io/TheMonkees/assets/video/TheMonkees.mp4";

    // Title WebElements
    WebElement lastTrainToClarksVilleTitleCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(lastTrainToClarksVilleTitleCSS));
    }

    WebElement daydreamBelieverTitleCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(daydreamBelieverTitleCSS));
    }

    WebElement iAmABeliverTitleCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(iAmABeliverTitleCSS));
    }

    WebElement steppingStoneTitleCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(steppingStoneTitleCSS));
    }

    // Image WebElements
    WebElement lastTrainToClarksVilleImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(lastTrainToClarksVilleImageCSS));
    }

    WebElement daydreamBelieverImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(daydreamBelieverImageCSS));
    }

    WebElement iAmABeliverImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(iAmABeliverImageCSS));
    }

    WebElement steppingStoneImageCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(steppingStoneImageCSS));
    }

    // Media Player WebElements

    WebElement lastTrainToClarksVilleMediaCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(lastTrainToClarksVilleMediaCSS));
    }

    WebElement daydreamBelieverMediaCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(daydreamBelieverMediaCSS));
    }

    WebElement iAmABeliverMediaCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(iAmABeliverMediaCSS));
    }

    WebElement steppingStoneMediaCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(steppingStoneMediaCSS));
    }

    WebElement videoMediaCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(videoMediaCSS));
    }
}
