package steps;

import PageFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class LoginSteps {

    LoginPage loginPage;

    WebDriver driver;

    @Given("je suis dans le site Automation Test Store")
    public void openSite() {
        driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://automationteststore.com/");

    }

    @When("je clique sur le bouton Login Or registre")
    public void je_clique_sur_le_bouton_login_or_registre() {
        loginPage.ClickRegisterButton();
    }


    @And("Je saisie userName {string}")
    public void setUserName(String username) {
        loginPage.setLoginName(username);
    }

    @And("Je saisie password {string}")
    public void setPassword(String password) {
        loginPage.setPassword(password);
    }

    @When("je clique sur le bouton Login")
    public void onClickLogin() {

        loginPage.ClickLoginButton();
    }

    @Then("redirection vers la page Home login")
    public void redirectToHomePageLogin() {


        String CurrentUrl = driver.getCurrentUrl();
        String Url = "https://automationteststore.com/index.php?rt=account/account";
        if (Objects.equals(Url, CurrentUrl)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        DriverManager.quitDriver();
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
        DriverManager.quitDriver();
    }
}
