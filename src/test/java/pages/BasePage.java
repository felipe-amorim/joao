package pages;

import support.Core;

public class BasePage {

    private static BasePage basePageInstance = null;

    public static BasePage getInstance(){
        if(basePageInstance==null){
            basePageInstance = new BasePage();
        }
        return basePageInstance;
    }

    public void openLoginPage(){
        Core.getInstance().navigateToUrl("https://qa01-program.kwtears.com/login");
    }
}
