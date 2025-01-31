package steps;

import actions.CommonActions;
import actions.ProductListActions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProductListPage_steps {
	CommonActions common_actions;
	ProductListActions productListActions;

	public ProductListPage_steps(CommonActions common_actions, ProductListActions homePage_actions) {
		this.common_actions = common_actions;
		this.productListActions = homePage_actions;
	}

	@When("I should land to product list page")
	public void i_should_land_to_product_list_page() throws InterruptedException {
		// any element presence on list page can be verified, current priority is to find highest priced item
	}

	@When("I click on menu button")
	public void i_click_on_menu_button() throws InterruptedException {
		productListActions.clickmenu();
	}

	@When("I searched highest priced value item and add to cart")
	public void i_look_for_max_priced_value_item() throws InterruptedException {
		productListActions.selectHighestPricedItem();

	}

	@Then("I verify the badge on shopping cart is displayed")
	public void i_verify_the_badge_on_shopping_cart() throws InterruptedException {
		productListActions.shoppingCartBadgeIsDisplayed();

	}


}