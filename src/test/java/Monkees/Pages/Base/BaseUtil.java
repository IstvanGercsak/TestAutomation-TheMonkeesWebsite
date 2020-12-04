package Monkees.Pages.Base;

import org.openqa.selenium.WebDriver;

public class BaseUtil {
    public String website = "https://istvangercsak.github.io/TheMonkees/index.html";
    public WebDriver driver;

    public WebDriver getDriver() {
        return this.driver;
    }

    public String getWebsite() {
        return this.website;
    }

}
