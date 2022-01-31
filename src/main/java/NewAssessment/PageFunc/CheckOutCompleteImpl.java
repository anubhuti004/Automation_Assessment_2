package NewAssessment.PageFunc;

import NewAssessment.ObjectRepository.CheckOutComplete.CheckOutCompletePage;
import NewAssessment.ObjectRepository.Product.ProductPage;
import NewAssessment.Utlis.CoreActions;
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
