package steps;

import actions.LoginActions;
import actions.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class Login_steps {
    CommonActions common_actions;
    LoginActions login_actions;

    public Login_steps(CommonActions common_actions, LoginActions login_actions) {
        this.common_actions = common_actions;
        this.login_actions = login_actions;
    }

    @Given("I am on the SauceDemo login Page")
    public void i_am_on_the_SauceDemo_login_Page() {
        common_actions.goToUrl("https://www.saucedemo.com/");
    }

    @When("I enter the value in username field")
    public void i_enter_the_value_in__username_field() {
        login_actions.enterUsername();
    }

    @When("I enter the value in password field")
    public void i_enter_the_value_in_password_field() {
        login_actions.enterPassword();
    }

    @When("I click on the Login button")
    public void i_Click_on_the_login_button() {
        login_actions.clickLogin();
    }
}