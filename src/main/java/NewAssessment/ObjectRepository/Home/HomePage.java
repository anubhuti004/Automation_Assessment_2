package NewAssessment.ObjectRepository.Home;

import org.openqa.selenium.By;

public class HomePage {

    public static final By username_text = By.xpath("//input[@id = \"user-name\"]");
    public static final By select_username = By.xpath("//input[@id = \"user-name\"]");
    public static final By select_usernames_list = By.xpath("//div[@id='login_credentials']");
    public static final By pass_text = By.id("password");
    public static final By select_password = By.id("password");
    public static final By login_button = By.id("login-button");



}
