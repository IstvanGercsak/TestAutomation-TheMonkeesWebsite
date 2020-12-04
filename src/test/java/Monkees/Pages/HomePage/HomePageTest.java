package Monkees.Pages.HomePage;

import Monkees.Base.NecessaryItems;
import Monkees.Pages.Base.BaseUtil;
import Monkees.Pages.General.GeneralTests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HomePageTest {

    WebDriver driver = new BaseUtil().getDriver();
    GeneralTests generalTests = new GeneralTests();
    NecessaryItems necessaryItems = new NecessaryItems();
    String website = new BaseUtil().getWebsite();

    @BeforeMethod
    @Given("I am arriving on the Home page")
    public void setUp() {
        String key = "webdriver.chrome.driver";
        System.setProperty(key, necessaryItems.getChromeDriverRoute());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website);
    }

    @Test
    @When("I check the navigation URLs")
    public void checkNavigationBar() {
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
    }

    @Test
    @When("I check the navigation footers")
    public void checkFooterContent() {
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
    }

    @AfterMethod
    @Then("I close the browser")
    public void tearDown() {
        driver.quit();
    }

}