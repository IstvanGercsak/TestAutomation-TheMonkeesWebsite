package Monkees.Pages.ContactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPagePOM {

    String nameID = "name";
    String emailID = "emailaddress";
    String phoneNumberID = "phonenumber";
    String descriptionID = "description";
    String sendRequestButtonCSS = "body > section > div > form > button";

    WebElement sendRequestButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(sendRequestButtonCSS));
    }

    WebElement nameInputElement(WebDriver driver) {
        return driver.findElement(By.id(nameID));
    }

    WebElement emailInputElement(WebDriver driver) {
        return driver.findElement(By.id(emailID));
    }

    WebElement phoneNumberInputElement(WebDriver driver) {
        return driver.findElement(By.id(phoneNumberID));
    }

    WebElement descriptionInputElement(WebDriver driver) {
        return driver.findElement(By.id(descriptionID));
    }


}
