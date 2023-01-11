package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Core {

    private static Core coreInstance = null;

    private WebDriver driver = null;

    private void CreateWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static Core getInstance()
    {
        if(coreInstance==null){
            coreInstance = new Core();
        }
        return coreInstance;
    }

    public WebDriver getDriver(){
        if(driver==null){
            CreateWebDriver();
        }
        return driver;
    }

    public void navigateToUrl(String url){
        getDriver().get(url);
    }
}
