package pagetest.product;

import new_assessment.pagefunc.ProductImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
@Epic("EPIC 2")
public class PackageTest{
    ProductImpl shop;
    WebDriver bot;

    public PackageTest(WebDriver bot){
        this.bot = bot;
    }
    @Test
    @Description("select the product form the product list")
    @Owner("Anubhuti Anand")
    public WebDriver select_the_product(){
        shop = new ProductImpl(bot);
        shop.clickAddCart();
        System.out.println("Added to cart");
        shop.openCart();
        System.out.println("Cart opened Successfully");
        return bot;
    }


}



