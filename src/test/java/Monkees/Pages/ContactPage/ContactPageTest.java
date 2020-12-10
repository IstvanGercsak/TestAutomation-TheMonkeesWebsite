package Monkees.Pages.ContactPage;

import Monkees.DriverFactory.DriverFactory;
import Monkees.Pages.General.GeneralTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactPageTest extends ContactPagePOM {

    WebDriver driver = new DriverFactory().driver;
    GeneralTests generalTests = new GeneralTests();
    Logger logger = LogManager.getLogger(ContactPageTest.class);
    DriverFactory driverFactory = new DriverFactory();

    final static String testName = "Istvan Gercsak";
    final static String testEmail = "istvan.gercsak@test.com";
    final static String testPhoneNumber = "+353894473833";
    final static String testDescription = "This is a test!";


    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = driverFactory.setUpTest(browser, headless);
    }

    @Test
    public void checkNavigationBar() {
        navigationToContactPage(driver);
        generalTests.checkHrefForHomeButton(driver);
        generalTests.checkHrefForTourInfoButton(driver);
        generalTests.checkHrefForBandButton(driver);
        generalTests.checkHrefForMediaButton(driver);
        generalTests.checkHrefForContactButton(driver);
    }

    @Test
    public void checkFooterContent() {
        navigationToContactPage(driver);
        generalTests.checkHrefForFacebookIcon(driver);
        generalTests.checkHrefForTwitterIcon(driver);
        generalTests.checkHrefForYouTubeIcon(driver);
        generalTests.checkHrefForSpotifyIcon(driver);
    }

    @Test
    public void inputFieldInteractions() {
        navigationToContactPage(driver);
        checkNameInputField(testName);
        checkPhoneNumberField(testPhoneNumber);
        checkEmailField(testEmail);
        checkDescriptionField(testDescription);
    }

    @Test
    public void submitButtonIsVisibleAndClickable() {
        navigationToContactPage(driver);
        sendRequestButtonIsVisibleAndActionable();
    }

    public void navigationToContactPage(WebDriver driver) {
        generalTests.navigationToContactPage(driver);
    }

    public void sendRequestButtonIsVisibleAndActionable() {
        sendRequestButton(driver).isEnabled();
        sendRequestButton(driver).isDisplayed();
    }

    public void checkNameInputField(String name) {
        nameInputElement(driver).sendKeys(name);
    }

    public void checkPhoneNumberField(String phoneNumber) {
        phoneNumberInputElement(driver).sendKeys(phoneNumber);
    }

    public void checkEmailField(String email) {
        emailInputElement(driver).sendKeys(email);
    }

    public void checkDescriptionField(String description) {
        descriptionInputElement(driver).sendKeys(description);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}