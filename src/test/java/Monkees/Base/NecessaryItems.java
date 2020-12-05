package Monkees.Base;

public class NecessaryItems {

    String systemChromePropertyKey = "webdriver.chrome.driver";
    String systemFirefoxPropertyKey = "webdriver.gecko.driver";
    String chromeDriverRoute = "/Users/istvangercsak/IdeaProjects/Test/driver/chromeDriver_mac/chromedriver";
    String geckoDriverRoute = "/Users/istvangercsak/IdeaProjects/Test/driver/firefoxDriver_mac/geckodriver";

    public String getChromeDriverRoute() {
        return this.chromeDriverRoute;
    }

    public String getGeckoDriverRoute() {
        return this.geckoDriverRoute;
    }

    public String getSystemChromePropertyKey() {
        return this.systemChromePropertyKey;
    }

    public String getSystemFirefoxPropertyKey() {
        return this.systemFirefoxPropertyKey;
    }
}
