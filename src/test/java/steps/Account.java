package steps;

import PageFactory.AccountPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Account {
    AccountPage accountPage;
    WebDriver driver;

    public Account() {
        driver = DriverManager.getDriver();
        accountPage = new AccountPage(driver);
    }

    @Then("cliquer sur Account")
    public void cliquer_sur_account() {
        accountPage.cliquer_sur_account();
    }

    @Then("cliquer sur Manage Address Book")
    public void cliquer_sur_manage_address_book() {
        accountPage.cliquer_sur_manage_address_book();
    }

    @Then("cliquer sur le bouton edit")
    public void cliquer_sur_le_bouton_edit() {
        accountPage.cliquer_sur_le_bouton_edit();
    }

    @Then("je saisie les nouvelles données")
    public void je_saisie_les_nouvelles_donnees() {
        accountPage.je_saisie_les_nouvelles_donnees();
    }

    @Then("cliquer sur le bouton continue")
    public void cliquer_sur_le_bouton_continue() {
        accountPage.cliquer_sur_le_bouton_continue();
    }

    @Then("un message saffiche {string}")
    public void un_message_saffiche(String message) {
        String pagecontent = driver.findElement(By.tagName("html")).getText();
        List<String> motrecherche = new ArrayList<>();
        motrecherche.add("Your address has been successfully updated");
        for (String mot : motrecherche) {
            if (pagecontent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            } else {
                System.out.println(message);
            }

        }

        DriverManager.quitDriver();
    }

}
