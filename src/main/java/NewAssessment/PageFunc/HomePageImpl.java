package NewAssessment.PageFunc;

import NewAssessment.ObjectRepository.Home.HomePage;
import NewAssessment.Utlis.CoreActions;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import NewAssessment.ConfigFile.JsonWriter;

public class HomePageImpl extends CoreActions {

    public HomePageImpl(WebDriver bot) {
        super(bot);
    }    //super - web driver initilize

    @Step("Verifying that correct site is opened")
    public void verifySite() {
        JsonWriter json_file = new JsonWriter();
        waitForVisibility(HomePage.login_button);
        Assert.assertEquals(json_file.read_value_from_json("PageTitle"),pageTitle());
    }

    public void enterUsernamesList(){
        JsonWriter json_file = new JsonWriter();
        String[] lines = textRetriever(HomePage.select_usernames_list).split(System.lineSeparator());
        for(int i=1;i<5;i++){
            System.out.print("Username:");
            System.out.println(lines[i]);
//            clearUsername();
            enterUserName(lines[i]);
            sleep(1);
//            clearPassword();
            System.out.print("Password:");
            System.out.println(json_file.read_value_from_json("Password"));
            enterPass(json_file.read_value_from_json("Password"));
            sleep(1);
            System.out.println(lines[i].strip().replace("\n","").equals(json_file.read_value_from_json("Username").strip().replace("\n","")));
            if(lines[i].strip().replace("\n","").equals(json_file.read_value_from_json("Username").strip().replace("\n",""))){
                login();
                sleep(1);
                if(bot.getCurrentUrl().equals(json_file.read_value_from_json("InventoryURL"))){
                    Assert.assertEquals(json_file.read_value_from_json("InventoryURL"), bot.getCurrentUrl());
                    break;
                }else{
//                    clearUsername();
//                    clearPassword();
                    sleep(1);
                }
            }
            else{
//                clearUsername();
//                clearPassword();
                sleep(1);
            }
        }
        Assert.assertEquals(json_file.read_value_from_json("InventoryURL"), bot.getCurrentUrl());
    }

    @Step("Entering username")
    public void enterUserName(String username) {
        enterText(HomePage.username_text,username);
    }

    @Step("Selecting username")
    public void username() {
        sleep(3);
        click(HomePage.select_username);
    }

    @Step("Clear Username")
    public void clearUsername(){
        clearText(HomePage.username_text);
    }

    @Step("Clear Username")
    public void clearPassword(){
        clearText(HomePage.pass_text);
    }

    @Step("Entering password")
    public void enterPass(String password){enterText(HomePage.pass_text,password);}

    @Step("Selecting password")
    public void password() {
        sleep(3);
        click(HomePage.select_password);
    }

    @Step("Clicking on login button")
    public void login(){
        click(HomePage.login_button);
    }
}
