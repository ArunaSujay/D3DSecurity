
package d3d.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3d.Basepage;
import d3d.pages.Registerpage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class registerA {
    public Registerpage Rpage = PageFactory.initElements(Basepage.driver, Registerpage.class);
    public WebDriver driver;

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String Url) throws Throwable {
       Rpage.openurl(Url);
    }


    @Then("^I should see a Register Button$")
    public void iShouldSeeARegisterButton() throws Throwable {
        Rpage.RegisterButton();
 //String Act_register= driver.findElement(By.xpath(".//*[@id='menu-item-4529']/a")). getText();
    //    String Exp_register = "Register";
 //assertEquals(Exp_register,Act_register);
     }


    @When("^I click on the register Button$")
    public void iClickOnTheRegisterButton() throws Throwable {
        Rpage.RegisterButtonClick();

        //driver.findElement(By.linkText("Register")).click();
    }


    @Then("^I should see a register page with emaild Id and password$")
    public void iShouldSeeARegisterPageWithEmaildIdAndPassword() throws Throwable {
        Rpage.EmailID();

     //String Act_Header = driver.findElement(By.xpath(".//*[@id='post-4519']/h1")).getText();
      // String Exp_Header = "Register";
       //assertEquals(Exp_Header, Act_Header);

    }

    @Given("^I enter valid emaild as \"([^\"]*)\"$")
    public void iEnterValidEmaildAs(String arg0) throws Throwable {
        Rpage.ValidEmailID(arg0);
     //driver.findElement(By.name("email")).sendKeys(arg0);

    }

    @And("^I enter valid password as \"([^\"]*)\"$")
    public void iEnterValidPasswordAs(String arg0) throws Throwable {
        Rpage.Password(arg0);
       // driver.findElement(By.name("pass1")).sendKeys(arg0);


    }



    @And("^I enter valid confirm password as \"([^\"]*)\"$")
    public void iEnterValidConfirmPasswordAs(String arg0) throws Throwable {
     Rpage.ConfirmPassword(arg0);
       // driver.findElement(By.name("pass2")).sendKeys(arg0);
    }

    @When("^I click on the Register button on register page$")
    public void iClickOnTheRegisterButtonOnRegisterPage() throws Throwable {
     Rpage.RegisterClick();
       // driver.findElement(By.name("submit" )).click();
    }

    @Then("^I should see  My Account button$")
    public void iShouldSeeMyAccountButton() throws Throwable {
        Rpage.MyAccount();

       //String Act_MyAcc = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
      // String Exp_MyAcc = "My Account";
      // assertEquals(Act_MyAcc, Exp_MyAcc);


    }

    @Then("^I should see My Account Text$")
    public void iShouldSeeMyAccountText() throws Throwable {
        Rpage.MyAccountText();
       // String Act_MyAcc = driver.findElement(By.cssSelector("#menu-item-5958>a")).getText();
       // String Exp_MyAcc = "My Account";
       // assertEquals(Act_MyAcc, Exp_MyAcc);

    }

    @And("^I should see Logout Button$")
    public void iShouldSeeLogoutButton() throws Throwable {
        Rpage.LogoutButton();

       // Boolean Act_Logout = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).isDisplayed();
        //     assertTrue(Act_Logout);
       // driver.close();
    }

    @And("^I should see Logout Text$")
    public void iShouldSeeLogoutText() throws Throwable {
        Rpage.LogoutText();
   // String Act_Logout = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
   // String Exp_Logout = "Logout";
   // assertEquals(Act_Logout, Exp_Logout);
   // driver.close();

    }

    @Then("^I should see a error message as \"([^\"]*)\"$")
    public void iShouldSeeAErrorMessageAs(String arg0) throws Throwable {
        Rpage.ErrorMessage();

        //String Act_ErrMsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]")).getText();
      //  String Exp_ErrMsg = "Username is not Vald";
      //  assertEquals( Act_ErrMsg, Exp_ErrMsg);
      //  driver.close();
    }
}
