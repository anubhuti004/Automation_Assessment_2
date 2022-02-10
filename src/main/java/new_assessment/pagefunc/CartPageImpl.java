package new_assessment.pagefunc;

import new_assessment.object_repository.cart.CartPage;
import new_assessment.object_repository.product.ProductPage;
import new_assessment.utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import new_assessment.config.JsonWriter;


public class CartPageImpl extends CoreActions {
    public CartPageImpl(WebDriver bot)
    {
        super(bot);
    }

    @Step("Verifying the Product Name")
    public void nameCheck() {
        CartPage.CartProdText = textRetriever(CartPage.CartProductName);
        System.out.println(CartPage.CartProdText);
        Assert.assertEquals(CartPage.CartProdText, textRetriever(ProductPage.ProductName));
    }
    @Step("Verifying the Product Price")
    public void priceCheck() {
        CartPage.CartPriceText = textRetriever(CartPage.CartProductPrice);
        System.out.println(CartPage.CartPriceText);
        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(CartPage.CartPriceText, json_file.read_value_from_json("Price"));

    }
    @Step("Click on checkout")
    public void clickOnCheckout() {
        click(CartPage.clickOnCheckout);
        sleep(2);
        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(json_file.read_value_from_json("CheckOutURLStepOne"), bot.getCurrentUrl());
    }

}
