package Basic;

import NewAssessment.Utlis.Bot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BasicActionIntegration {

    protected WebDriver bot;  // variable bot type webdriver
    protected static final String URL = "https://www.saucedemo.com";

    @BeforeClass
    public void openBrowser() {
        bot = new Bot().getBot();
        bot.get(URL);
    }

    protected static void stepLog(String step) {   //To print steps
        Logger.step(step);
    }

//    @AfterClass
//    public void close() {bot.quit();
//    }
}
