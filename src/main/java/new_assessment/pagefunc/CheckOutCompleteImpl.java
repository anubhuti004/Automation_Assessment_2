package new_assessment.pagefunc;

import new_assessment.object_repository.checkout_complete.CheckOutCompletePage;
import new_assessment.object_repository.product.ProductPage;
import new_assessment.utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class CheckOutCompleteImpl extends CoreActions {

    public CheckOutCompleteImpl(WebDriver bot){
        super (bot);
    }
    @Step("Clicking on Back Home button")

    public void clickbackhome(){

        click(CheckOutCompletePage.backhomebutton);
        sleep(2);
        try{
            textRetriever(ProductPage.num_items);
            Assert.assertEquals("1","0");
        }catch(Exception ex){
            Assert.assertEquals("0","0");
        }
    }

}
