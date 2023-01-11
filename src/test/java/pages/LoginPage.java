package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Core;

public class LoginPage {

    private static LoginPage loginPageInstance = null;

    public static LoginPage getInstance(){
        if(loginPageInstance==null){
            loginPageInstance = new LoginPage();
        }
        return loginPageInstance;
    }

    private WebElement educatorPinInput(){ return Core.getInstance().getDriver().findElement(By.xpath("//input[@placeholder=\"Enter Educator PIN\"]")); }
    private WebElement goButtonInput(){ return Core.getInstance().getDriver().findElement(By.xpath("//input[@value=\"Go\"]")); }

    public void enterEducatorPin(String educatorPin){
        educatorPinInput().sendKeys(educatorPin);
        goButtonInput().click();
    }
}
