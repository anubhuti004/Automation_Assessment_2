package NewAssessment.PageFunc;

import NewAssessment.ObjectRepository.Cart.CartPage;
import NewAssessment.ObjectRepository.Product.ProductPage;
import NewAssessment.Utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import NewAssessment.ConfigFile.JsonWriter;


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
        Assert.assertEquals(CartPage.CartPriceText, "$29.99");

    }

    @Step("Click on checkout")
    public void clickOnCheckout() {
        click(CartPage.clickOnCheckout);
        sleep(2);
        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(json_file.read_value_from_json("CheckOutURLStepOne"), bot.getCurrentUrl());
    }



}
