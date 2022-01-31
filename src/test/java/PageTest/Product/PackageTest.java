package PageTest.Product;

import NewAssessment.PageFunc.ProductImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
@Epic("EPIC 2")
public class PackageTest{
    ProductImpl shop;
//    @Test
//    @Description
//    public void initImpl(){
//        System.out.println("Initilizing");
//        shop = new ProductImpl(bot);
//    }


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



//
//
//@Test
//@Epic("EPIC 2")
//public class PackageTest extends BasicActionIntegration{
//    ProductImpl shop;
//    String URL = "https://www.saucedemo.com/inventory.html";
//
//    @Test
//    @Description
//    public void initImpl(){
//        bot = new Bot().getBot();
//        bot.get(URL);
//        System.out.println("Initilizing");
//        shop = new ProductImpl(bot);
//    }
//
//
////    public PackageTest(WebDriver bot){
////        this.bot = bot;
////    }
//    @Test
//    @Description("select the product form the product list")
//    @Owner("Anubhuti Anand")
//    public void select_the_product(){
//        shop = new ProductImpl(bot);
//        shop.clickAddCart();
//        System.out.println("Added to cart");
//        shop.openCart();
//        System.out.println("Cart opened Successfully");
//    }
//
//
//}
