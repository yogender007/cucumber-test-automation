package actions;

import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class LoginActions {

    private WebDriver driver;
    LoginPage loginPage;

    public LoginActions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        loginPage = new LoginPage(driver);
    }

    public void enterUsername() {
        loginPage.Username.sendKeys("standard_user");
    }

    public void enterPassword() {
        loginPage.Password.sendKeys("secret_sauce");
    }

    public void clickLogin() {
        loginPage.LoginButton.click();
    }
}
