package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BluerentalcarsPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class KullaniciOlusturma {

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        BluerentalcarsPage bluerentCarPage = new BluerentalcarsPage();
        bluerentCarPage.ilkLogin.click();
        bluerentCarPage.createNewUserElement.click();
        Assert.assertTrue(bluerentCarPage.regesterYaziElementi.isDisplayed());


        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String password = faker.internet().password();
        String emailAddress = faker.internet().emailAddress();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String expectedName = firstName + " " + lastName;
        System.out.println("sifre:  " + password);
        System.out.println("email:  " + emailAddress);

        actions.click(bluerentCarPage.firstNameElementi).
                sendKeys(firstName + Keys.TAB).
                sendKeys(lastName + Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(faker.address().fullAddress() + Keys.TAB).
                sendKeys(faker.address().zipCode()+Keys.TAB).
                sendKeys(faker.internet().emailAddress()+Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()+Keys.TAB).
                sendKeys(faker.internet().password()).
                sendKeys(Keys.PAGE_DOWN).perform();


    }
}