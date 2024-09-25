package steps;

import PageFactory.LogoutPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Logout {
    LogoutPage logoutPage;
    WebDriver driver;

    public Logout() {
        driver = DriverManager.getDriver();
        logoutPage = new LogoutPage(driver);
    }


    @Then("je clique sur le bouton Logout")
    public void je_clique_sur_le_bouton_logout() {
        logoutPage.je_clique_sur_le_bouton_logout();
    }

    @Then("une redirection vers autre page et message {string}")
    public void une_redirection_vers_autre_page_et_message(String string) {
        String pagecontent = driver.findElement(By.tagName("html")).getText();
        List<String> motrecherche = new ArrayList<>();
        motrecherche.add("Account Logout");
        for (String mot : motrecherche) {
            if (pagecontent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            } else {
                System.out.println("le mot " + mot + " n'existe pas sur la page");
            }

        }


    }

    }



