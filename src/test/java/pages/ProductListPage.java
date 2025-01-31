package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    WebDriver driver;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElement menuButton;
    @FindBy(css = ".shopping_cart_badge")
    public WebElement shoppingCartBadge;

    public ProductListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
