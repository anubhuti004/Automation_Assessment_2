package pagetest.home;


import basic.BasicActionIntegration;
import new_assessment.pagefunc.HomePageImpl;
import pagetest.checkout.CheckoutTest;
import pagetest.CheckoutComplete.CheckoutCompleteTest;
import pagetest.checkout_overview.OverviewTest;
import pagetest.product.PackageTest;
import pagetest.cart.CartTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

@Test(priority=1)
@Epic("EPIC 1")
public class HomeLogin extends BasicActionIntegration {
    HomePageImpl login_site;
    PackageTest pack_test;
    CartTest cart_test;
    CheckoutTest checkout_form;
    OverviewTest overview;
    CheckoutCompleteTest back_home;


    @Test(priority=2)
    @Description("Creating HomePageImpl objects before class")
    public void initImpl() {
        System.out.println("Initialized");
        login_site = new HomePageImpl(bot);      //login_site is a reference variable pointing to homepageImpl object.
    }


    @Test(priority=3)
    @Description("enter the credentials to login ")
    @Owner("Anubhuti Anand")
    public void homepage_login() {
        stepLog("Verify correct site is opened");
        System.out.println(bot);
        login_site.verifySite();
        //using object they are calling properties of homepageImpl

        stepLog("Entre valid username and password");
        login_site.enterUsernamesList();
    }

    @Test(priority=4)
    @Description("Add product in the cart")
    @Owner("Anubhuti Anand")
    public void product_page_ops() {
        System.out.println(bot.getCurrentUrl());
        pack_test = new PackageTest(bot);
        bot = pack_test.select_the_product();
        System.out.println("Product Selected and added to cart");
        System.out.println(bot.getCurrentUrl());
    }

    @Test(priority=5)
    @Description("Verify the product name and price and click on checkout")
    @Owner("Anubhuti Anand")
    public void cart_page_ops() {
        System.out.println(bot.getCurrentUrl());
        cart_test = new CartTest(bot);
        bot = cart_test.verify_name_and_price();
        System.out.println(bot.getCurrentUrl());
    }

    @Test(priority=6)
    @Description("Enter the required info in the checkout form page")
    @Owner("Anubhuti Anand")
    public void checkout_form_ops() {
        System.out.println(bot.getCurrentUrl());
        checkout_form = new CheckoutTest(bot);
        checkout_form.enter_details_in_checkout_form();
        System.out.println(bot.getCurrentUrl());
    }

    @Test(priority=7)
    @Description("Enter the required info in the checkout form page")
    @Owner("Anubhuti Anand")
    public void overview_page_finish() {
        overview = new OverviewTest(bot);
        bot = overview.click_on_finish_in_Checkout_overview_page();
        System.out.println(bot.getCurrentUrl());
    }

    @Test(priority = 8)
    @Description("Click on Back Home button")
    @Owner("Anubhuti Anand")
    public void Checkout_complete_page(){
        back_home = new CheckoutCompleteTest(bot);
        bot = back_home.click_on_back_home_button();
        System.out.println(bot.getCurrentUrl());

    }

}