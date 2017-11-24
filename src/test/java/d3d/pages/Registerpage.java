package d3d.pages;

import d3d.Basepage;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Registerpage extends Basepage {
    public void openurl(String Url){
        driver.get(Url);


    }

    public void RegisterButton () {
        String Act_register = driver.findElement(By.xpath(".//*[@id='menu-item-4529']/a")).getText();
           String Exp_register = "Register";
        assertEquals(Exp_register,Act_register);
    }


    public void RegisterButtonClick(){
        driver.findElement(By.linkText("Register")).click();
    }


    public void EmailID(){
        String Act_Header = driver.findElement(By.xpath(".//*[@id='post-4519']/h1")).getText();
         String Exp_Header = "Register";
        assertEquals(Exp_Header, Act_Header);
    }

    public void  ValidEmailID(String EmailID){
        driver.findElement(By.name("email")).sendKeys(EmailID);
    }

    public void Password(String Password){
        driver.findElement(By.name("pass1")).sendKeys(Password);

    }

    public void ConfirmPassword(String Password){

        driver.findElement(By.name("pass2")).sendKeys(Password);
    }

    public void RegisterClick(){
        driver.findElement(By.name("submit" )).click();
    }

    public void MyAccount(){

        String Act_MyAcc = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
         String Exp_MyAcc = "My Account";
         assertEquals(Act_MyAcc, Exp_MyAcc);
    }

    public void MyAccountText(){

        String Act_MyAcc = driver.findElement(By.cssSelector("#menu-item-5958>a")).getText();
         String Exp_MyAcc = "My Account";
         assertEquals(Act_MyAcc, Exp_MyAcc);
    }

    public void LogoutButton(){
        Boolean Act_Logout = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).isDisplayed();
            assertTrue(Act_Logout);
        driver.close();
    }

    public void LogoutText(){
        String Act_Logout = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
         String Exp_Logout = "Logout";
         assertEquals(Act_Logout, Exp_Logout);
         driver.close();

    }

    public void ErrorMessage(){
        String Act_ErrMsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]")).getText();
        String Exp_ErrMsg = "Username is not Vald";
        assertEquals( Act_ErrMsg, Exp_ErrMsg);
        driver.close();
    }
}

