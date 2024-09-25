package PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='customer_menu_top']/li/a")
    WebElement registerButton;


    @FindBy(id = "loginFrm_loginname")
    WebElement loginName;

    @FindBy(id = "loginFrm_password")
    WebElement password;

    @FindBy(xpath = "//*[@id='loginFrm']/fieldset/button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void ClickRegisterButton() {
        registerButton.click();
    }


    public void setLoginName(String name) {
        loginName.sendKeys(name);
    }


    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void ClickLoginButton() {
        loginButton.click();
    }


}

