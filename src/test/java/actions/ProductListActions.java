package actions;

import pages.ProductListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Common_Steps;

import java.util.List;

public class ProductListActions {

    private WebDriver driver;
    ProductListPage productListPage;

    public ProductListActions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        productListPage = new ProductListPage(driver);
    }


    public void clickmenu() throws InterruptedException {
        //homePage_elements.Menu.wait(5000);
        Thread.sleep(5000);
        productListPage.menuButton.click();
    }

    public void selectHighestPricedItem() {
        List<WebElement> productPrices = driver.findElements(By.className("inventory_item_price"));
        double highestPrice = 0;
        WebElement highestPricedItem = null;

        for (WebElement priceElement : productPrices) {
            String priceText = priceElement.getText().replace("$", "");
            double price = Double.parseDouble(priceText);

            if (price > highestPrice) {
                highestPrice = price;
            }
        }
        System.out.println("Value of Highest price is -->" + highestPrice);
        // xpath for highest price item is hard coded the xpath need to be refined
        //	highestPricedItem = driver.findElement(By.xpath("//div[contains(text(), '"+highestPrice+"')]/following-sibling::button[text()='Add to Cart']"));
        highestPricedItem = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
        highestPricedItem.click();

    }

    public void shoppingCartBadgeIsDisplayed() {
        productListPage.shoppingCartBadge.isDisplayed();
    }
}
