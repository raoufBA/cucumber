package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LoginSteps {
    WebDriver driver;

    @Given("je suis dans le site Automation Test Store")
    public void openSite() {
        driver = DriverManager.getDriver();
        driver.get("https://automationteststore.com/");

    }

    @When("je clique sur le bouton Login Or registre")
    public void je_clique_sur_le_bouton_login_or_registre() {
        WebElement login;
        login = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        login.click();
    }


    @And("Je saisie userName {string}")
    public void setUserName(String username) {
        WebElement Username;
        Username = driver.findElement(By.id("loginFrm_loginname"));
        Username.sendKeys(username);
    }

    @And("Je saisie password {string}")
    public void setPassword(String password) {
        WebElement Password;
        Password = driver.findElement(By.id("loginFrm_password"));
        Password.sendKeys(password);
    }

    @When("je clique sur le bouton Login")
    public void onClickLogin() {

        WebElement buttonConnecter;
        buttonConnecter = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        buttonConnecter.click();
    }

    @Then("redirection vers la page Home")
    public void redirectToHomePage() {


        String CurrentUrl = driver.getCurrentUrl();
        String Url = "https://automationteststore.com/index.php?rt=account/account";
        if (Objects.equals(Url, CurrentUrl)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }


    }

    @Then("un message derreur saffiche {string}")
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
