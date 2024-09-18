package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AddProduct {

    private WebDriver driver;

    public AddProduct() {
       driver = DriverManager.getDriver();
    }

    @When("cliquer sur makeup")
    public void cliquer_sur_makeup() {
        driver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[3]/a")).click();
        //*[@id="categorymenu"]/nav/ul/li[3]/a
    }
    @When("cliquer sur tropiques minerale loose bronzer")
    public void cliquer_sur_tropiques_minerale_loose_bronzer() {
        driver.findElement(By.xpath("//*[@id='maincontainer']/div/div/div/div/div[3]/div[2]/div[1]/div/a")).click();
    }
    @When("cliquer sur le bouton add to Cart")
    public void cliquer_sur_le_bouton_add_to_cart() {
        driver.findElement(By.xpath("//*[@id='product']/fieldset/div[5]/ul/li/a")).click();

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
