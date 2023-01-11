package tests;

import org.junit.Test;
import pages.BasePage;
import pages.LoginPage;

public class Login {

    @Test
    public void firstTest(){
        BasePage.getInstance().openLoginPage();
        LoginPage.getInstance().enterEducatorPin("UJMBVW");
    }
}
