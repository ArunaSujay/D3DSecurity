package d3d.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3d.Basepage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Register extends Basepage {


    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String Url) throws Throwable {

        driver.get(Url);
    }

    @Then("^I should see a Register button$")
    public void iShouldSeeARegisterButton() throws Throwable {
        String Act_register = driver.findElement(By.xpath(".//*[@id='menu-item-4529']/a")).getText();
        String Exp_Register = "Register";
        assertEquals(Exp_Register, Act_register);
    }

    @When("^I click on the Register button$")
    public void iClickOnTheRegisterButton() throws Throwable {
        driver.findElement(By.linkText("Register")).click();
    }

    @Then("^I should see a page with Register as header$")
    public void iShouldSeeAPageWithRegisterAsHeader() throws Throwable {
        String Act_header = driver.findElement(By.xpath(".//*[@id='post-4519']/h1")).getText();
        String Exp_header = "Register";
        assertEquals(Exp_header, Act_header);
    }


    @Given("^I enter the valid emaild as \"([^\"]*)\"$")
    public void iEnterTheValidEmaildAs(String arg0) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(arg0);
    }


    @And("^I enter the new passwd as \"([^\"]*)\"$")
    public void iEnterTheNewPasswdAs(String arg0) throws Throwable {
        driver.findElement(By.name("pass1")).sendKeys(arg0);
    }

    @And("^I enter the confirm passwd as \"([^\"]*)\"$")
    public void iEnterTheConfirmPasswdAs(String arg0) throws Throwable {
        driver.findElement(By.name("pass2")).sendKeys(arg0);
    }


    @When("^i click on the Register button on register page$")
    public void iClickOnTheRegisterButtonOnRegisterPage() throws Throwable {
        driver.findElement(By.name("submit")).click();
    }

    @Then("^I should see the My Account button$")
    public void iShouldSeeTheMyAccountButton() throws Throwable {
        Boolean Act_Myacc = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).isDisplayed();
        assertTrue(Act_Myacc);
    }

    @And("^I should see My Account text$")
    public void iShouldSeeMyAccountText() throws Throwable {
        String Act_Myacc = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
        String Exp_Myacc = "My Account";
        assertEquals(Exp_Myacc, Act_Myacc);
    }

    @And("^I should see the Logout button$")
    public void iShouldSeeTheLogoutButton() throws Throwable {
        Boolean Act_logout = driver.findElement(By.cssSelector("#menu-item-4531>a")).isDisplayed();
        assertTrue(Act_logout);
        CloseBrowser();
    }

    @And("^I should see the Logout text$")
    public void iShouldSeeTheLogoutText() throws Throwable {
        String Act_logout = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
        String Exp_Logout = "Log Out";
        assertEquals(Exp_Logout, Act_logout);
        CloseBrowser();
    }

    @Then("^I should see an error message as \"([^\"]*)\"$")
    public void iShouldSeeAnErrorMessageAs() throws Throwable {
        String Act_ErrMsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        String Exp_ErrMsg = "Username is not valid";
        assertEquals(Exp_ErrMsg, Act_ErrMsg);
        CloseBrowser();
    }

    @Then("^I should see  error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String arg0) throws Throwable {
        String Act_Errmsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        String Exp_Errmsg = "Passwords must be identical and filled";
        assertEquals(Exp_Errmsg, Act_Errmsg);
        CloseBrowser();
    }


}
