Feature: Login Page

  @login @demo
  Scenario: Login to Sauce Lab demo site
    Given I am on the SauceDemo login Page
    When I enter the value in username field
    And I enter the value in password field
    And I click on the Login button
    Then I should land to product list page