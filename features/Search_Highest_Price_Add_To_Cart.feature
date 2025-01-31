Feature: Search Highest price item and add to cart

 @add @demo
  Scenario: Search_Highest_Price_Add_To_Cart
    Given I am on the SauceDemo login Page
    When I enter the value in username field
    And I enter the value in password field
    And I click on the Login button
    Then I should land to product list page
    And I click on menu button
    And I searched highest priced value item and add to cart
    Then I verify the badge on shopping cart is displayed
