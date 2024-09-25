package steps;

import PageFactory.CheckoutPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class Checkout {
    CheckoutPage checkoutPage;
    WebDriver driver;


    public Checkout() {
        driver = DriverManager.getDriver();
        checkoutPage = new CheckoutPage(driver);
    }


    @Then("cliquer sur Checkout")
    public void cliquer_sur_checkout() {
        checkoutPage.ClickCheckoutButton();
    }

    @Then("cliquer sur confirm order")
    public void cliquer_sur_confirm_order() {
        checkoutPage.ClickConfirmOrder();
    }

    @Then("redirection vers une autre page {string}")
    public void redirection_vers_une_autre_page(String message) {
        String pagecontent = driver.findElement(By.tagName("html")).getText();
        List<String> motrecherche = new ArrayList<>();
        motrecherche.add("Your Order Has Been Processed!");
        for (String mot : motrecherche) {
            if (pagecontent.contains(mot)) {
                System.out.println(message);
            } else {
                System.out.println("le mot " + mot + " n'existe pas sur la page");
            }

        }
        DriverManager.quitDriver();
    }


}

