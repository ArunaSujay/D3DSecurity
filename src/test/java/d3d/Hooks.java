package d3d;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    // public WebDriver driver;

    Basepage bpage = new Basepage();


    @Before
    public void SetupBrowser() {
        bpage.OpenBrowser();

        // ChromeDriverManager.getInstance().setup();
        // driver = new ChromeDriver();

    }

    @After
    public void Teardown() {
        bpage.CloseBrowser();
        //driver.quit();


    }


}
