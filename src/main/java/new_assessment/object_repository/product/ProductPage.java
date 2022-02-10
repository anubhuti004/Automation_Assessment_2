package new_assessment.object_repository.product;

import org.openqa.selenium.By;

public class ProductPage {

    public static final By ProductName = By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");
    public static final By Product = By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");
    public static final By ProductPrice = By.xpath("//div[@class='inventory_item_description' and contains(div, \"Sauce Labs Backpack\")]//div[@class = 'inventory_item_price']");
    public static final By num_items = By.xpath("//span[@class = \"shopping_cart_badge\"]");
    public static final By add_cart = By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']");
    public static final By Cart_btn = By.xpath("//a[@class =\"shopping_cart_link\"]");
    public static String ProdTextName;
    public static String PriceTextName;
}
