package NewAssessment.ObjectRepository.Cart;

import org.openqa.selenium.By;

public class CartPage {

    public static final By CartProductName = By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");

    public static final By CartProductPrice = By.xpath("//div[@class = \"inventory_item_price\"]");

    public static final By clickOnCheckout = By.xpath("//button[@id = \"checkout\"]");

    public static String CartProdText;
    public static String CartPriceText;

    public static String ProdTextName;
    public static String PriceTextName;






}
