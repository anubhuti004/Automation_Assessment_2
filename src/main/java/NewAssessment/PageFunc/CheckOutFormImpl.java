package NewAssessment.PageFunc;

import NewAssessment.ConfigFile.JsonWriter;
import NewAssessment.ObjectRepository.CheckOut.CheckOutPage;
import NewAssessment.Utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutFormImpl extends CoreActions {

    public CheckOutFormImpl(WebDriver bot){super(bot);}


// 1- Fill out First Name
// 2- Fill out Last Name
// 3- Fill out postal/zip code

    @Step("Entering first name")
    public void enterFirstNAme(String f_name) {
        enterText(CheckOutPage.First_name, f_name);
        sleep(2);
    }

    @Step("Entering last name")
    public void enterLastName(String l_name) {
        enterText(CheckOutPage.Last_name, l_name);
        sleep(2);
    }

    @Step("Entering zip code")
    public void enterZipCode(String zip) {
        enterText(CheckOutPage.zip_code,zip);
        sleep(2);
    }

    @Step("Clicking on continue button")
    public void cont() {
        click(CheckOutPage.continue_button);
        sleep(2);

        JsonWriter json_file = new JsonWriter();
        Assert.assertEquals(json_file.read_value_from_json("CheckOutURLStepTwo"), bot.getCurrentUrl());



    }


}


