package runnerTest.webPages;

import org.openqa.selenium.By;

public class LoginPage extends ElementUtil{

    private By emailTextField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.xpath("//input[@value='Log in']");
    private By logout = By.xpath("//a[contains(text(),'Logout')]");
    private By header = By.xpath("//h1[contains(text(),'Dashboard')]");
    private By adminHeader = By.xpath("//h1[contains(text(),'Admin area demo')]");
    private By errorMessage = By.xpath("//div[contains(text(), 'Login was unsuccessful.')]");

    public void enterEmail(String enterEmail){
        clear(emailTextField);
        sendValue(emailTextField, enterEmail);
    }

    public void enterPassword(String enterPassword){
        clear(passwordField);
        sendValue(passwordField, enterPassword);
    }

    public void clickOnLogin(){
        clickOn(loginButton);
    }

    public String getAdminHeader(){
        return getTextFromElement(adminHeader);
    }

    public String getHomeHeader(){
        return getTextFromElement(header);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogout(){
        clickOn(logout);
    }


}
