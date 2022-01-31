package PageTest.cart;

import NewAssessment.PageFunc.CartPageImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Epic("Epic 3")
public class CartTest{

    CartPageImpl check;
    WebDriver bot;
    public CartTest(WebDriver bot){
        this.bot = bot;
    }

    @Test
    @Description("Add product to the cart and verify whether the right product and correct price is added")
    @Owner("Anubhuti Anand")
    public WebDriver verify_name_and_price(){
        check = new CartPageImpl(bot);
        check.nameCheck();
        System.out.println("Name check successful");
        check.priceCheck();
        System.out.println("Price check Successful");
        check.clickOnCheckout();
        System.out.println("Check out successful");
        return bot;
    }
}



