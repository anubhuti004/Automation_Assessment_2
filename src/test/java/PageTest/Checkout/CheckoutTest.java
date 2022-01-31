package PageTest.Checkout;


import NewAssessment.PageFunc.CheckOutFormImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Epic("Epic 4")


public class CheckoutTest{

    CheckOutFormImpl checkout;
    WebDriver bot;
    public CheckoutTest(WebDriver bot){
        this.bot = bot;
    }


    @Test(dependsOnMethods = "initImpl")
    @Description("Add product to the cart and verify whether")
    @Owner("Anubhuti Anand")

    public WebDriver enter_details_in_checkout_form(){
        checkout = new CheckOutFormImpl(bot);
        checkout.enterFirstNAme("Anubhuti");
        checkout.enterLastName("Anand");
        checkout.enterZipCode("201010");
        checkout.cont();
        return bot;
    }


}
