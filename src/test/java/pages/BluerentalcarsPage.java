package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BluerentalcarsPage {
    public BluerentalcarsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath="(//a[@role='button'])[1]")
    public WebElement ilkLogin;

    @FindBy(xpath = "//input[@class='form-control is-invalid'][1]")
    public WebElement emailAdress;
    @FindBy(xpath = "//*[text()='Create new user']")
            public WebElement createNewUserElement;

    @FindBy(xpath = "//input[@class='form-control is-invalid']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
     public WebElement ikinciLogin;

    @FindBy(tagName = "h1")

    public  WebElement regesterYaziElementi;

    @FindBy(name = "firstName")

    public WebElement firstNameElementi;.
}
