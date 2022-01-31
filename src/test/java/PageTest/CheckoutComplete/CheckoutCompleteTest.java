package PageTest.CheckoutComplete;

import NewAssessment.ConfigFile.JsonWriter;
import NewAssessment.PageFunc.CheckOutCompleteImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Epic("Epic 6")
public class CheckoutCompleteTest {

    CheckOutCompleteImpl backhome;
    WebDriver bot;

    public CheckoutCompleteTest(WebDriver bot){
        this.bot = bot;
    }

    @Test(dependsOnMethods = "initImpl")
    @Description()
    @Owner("Anubhuti Anand")

    public WebDriver click_on_back_home_button(){
        backhome = new CheckOutCompleteImpl(bot);
        backhome.clickbackhome();
        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(json_file.read_value_from_json("InventoryURL"), bot.getCurrentUrl());

        return bot;
    }
}
