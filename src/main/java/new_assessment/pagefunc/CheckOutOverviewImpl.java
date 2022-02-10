package new_assessment.pagefunc;

import new_assessment.config.JsonWriter;
import new_assessment.object_repository.checkout_overview.OverviewPage;
import new_assessment.utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewImpl extends CoreActions {

    public CheckOutOverviewImpl(WebDriver bot){ super(bot);}

    @Step("Clicking on finish button")
    public void finish() {
        click(OverviewPage.finish_button);
        sleep(2);
        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(json_file.read_value_from_json("CheckOutCompleteURL"), bot.getCurrentUrl());
    }
}
