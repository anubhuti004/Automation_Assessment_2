package NewAssessment.PageFunc;

import NewAssessment.ConfigFile.JsonWriter;
import NewAssessment.ObjectRepository.Product.ProductPage;
import NewAssessment.Utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductImpl extends CoreActions {

    public ProductImpl(WebDriver bot)                //Doubt
    {
        super(bot);
    }



    @Step("Clicking on the Add to cart button")
    public void clickAddCart() {
        sleep(2);
        System.out.println("Calling click function");
        click(ProductPage.add_cart);

    }


    @Step("Adding the product to Cart")
    public void addToCart() {
        sleep(2);
        //Saving the product name for verifying with the cart
        ProductPage.ProdTextName = textRetriever(ProductPage.ProductName);

        //Saving the product price for verifying with the cart
        ProductPage.PriceTextName = textRetriever(ProductPage.ProductPrice);
    }

    @Step("Opening the Cart")
    public void openCart() {
        sleep(2);
        click(ProductPage.Cart_btn);
        //Assert.assertEquals("https://www.saucedemo.com/cart.html", bot.getCurrentUrl());
        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(json_file.read_value_from_json("CartURL"), bot.getCurrentUrl());
    }

}






