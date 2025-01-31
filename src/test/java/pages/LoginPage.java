package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement LoginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
