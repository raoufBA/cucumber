package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private final WebDriver driver;

    public Checkout() {
        driver = DriverManager.getDriver();

    }

    @Then("cliquer sur Checkout")
    public void cliquer_sur_checkout() {
        driver.findElement(By.xpath("//*[@id='main_menu_top']/li[4]/a/span")).click();
    }

    @Then("cliquer sur confirm order")
    public void cliquer_sur_confirm_order() {
        driver.findElement(By.xpath("//*[@id='checkout_btn']")).click();
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

    }


}

