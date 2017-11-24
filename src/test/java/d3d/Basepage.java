package d3d;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepage {
    public static WebDriver driver;


    public void OpenBrowser(){
       String Browser = System.getProperty("Browser");
       if (Browser.equals("Chrome")) {
           ChromeDriverManager.getInstance().setup();
           driver = new ChromeDriver();

       }
        else if (Browser.equals("Firefox")){

           FirefoxDriverManager.getInstance().setup();
           driver = new FirefoxDriver();

       }


    }

    public void CloseBrowser(){

        driver.quit();

    }

}
