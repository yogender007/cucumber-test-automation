package actions;

import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class LoginActions {

    private WebDriver driver;
    LoginPage login_elements;

    public LoginActions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        login_elements = new LoginPage(driver);
    }

    public void enterUsername() {
        login_elements.Username.sendKeys("standard_user");
    }

    public void enterPassword() {
        login_elements.Password.sendKeys("secret_sauce");
    }

    public void clickLogin() {
        login_elements.LoginButton.click();
    }
}
