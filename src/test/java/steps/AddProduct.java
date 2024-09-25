package steps;

import PageFactory.AddProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AddProduct {
    AddProductPage addProductPage;
    WebDriver driver;


    public AddProduct() {
        driver = DriverManager.getDriver();
        addProductPage = new AddProductPage(driver);
    }

    @When("cliquer sur makeup")
    public void cliquer_sur_makeup() {
        addProductPage.cliquer_sur_makeup();

    }

    @When("cliquer sur tropiques minerale loose bronzer")
    public void cliquer_sur_tropiques_minerale_loose_bronzer() {
        addProductPage.cliquer_sur_tropiques_minerale_loose_bronzer();
    }

    @When("cliquer sur le bouton add to Cart")
    public void cliquer_sur_le_bouton_add_to_cart() {
        addProductPage.cliquer_sur_le_bouton_add_to_cart();
        DriverManager.quitDriver();
    }

    @Then("produit ajouter au panier avec sucee")
    public void produit_ajouter_au_panier_avec_sucee() {
        String pagecontent = driver.findElement(By.tagName("html")).getText();
        List<String> motrecherche = new ArrayList<>();
        motrecherche.add("Tropiques Minerale Loose Bronzer");
        for (String mot : motrecherche) {
            if (pagecontent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            } else {
                System.out.println("le mot " + mot + " n'existe pas sur la page");
            }
        }
    }

}
