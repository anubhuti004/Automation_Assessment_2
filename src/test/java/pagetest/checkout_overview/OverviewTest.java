package pagetest.checkout_overview;

import new_assessment.pagefunc.CheckOutOverviewImpl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Epic("Epic 5")

public class OverviewTest {
    CheckOutOverviewImpl done;
    WebDriver bot;

    public OverviewTest(WebDriver bot){
        this.bot = bot;
    }


    @Test(dependsOnMethods = "initImpl")
    @Description("click_on_finish_in_Checkout_overview_page")
    @Owner("Anubhuti Anand")

    public WebDriver click_on_finish_in_Checkout_overview_page(){
        done = new CheckOutOverviewImpl(bot);
        done.finish();
        return bot;
    }
}
