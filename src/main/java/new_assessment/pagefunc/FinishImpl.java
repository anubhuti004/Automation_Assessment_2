package new_assessment.pagefunc;

import new_assessment.object_repository.finish.FinishPage;
import new_assessment.utlis.CoreActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class FinishImpl extends CoreActions {

    public FinishImpl(WebDriver bot)
    {
        super(bot);
    }

    @Step("Clicking on finish button")
    public void clickFinishButton(){
        click(FinishPage.finish_button);
    }

}
