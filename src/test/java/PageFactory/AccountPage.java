package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='main_menu_top']/li[2]/a")
    WebElement accountButton;

    @FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[3]")
    WebElement manageButton;

    @FindBy(xpath = "//*[@id='maincontainer']/div/div[1]/div/div/div[1]/table/tbody/tr/td[2]/button/i")
    WebElement editButton;


    @FindBy(xpath = "//*[@id='AddressFrm_address_2']")
    WebElement Address2;

    @FindBy(xpath = "//*[@id='AddressFrm']/div/fieldset/div[11]/div/button")
    WebElement continueButton;


    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void cliquer_sur_account() {
        accountButton.click();
    }

    public void cliquer_sur_manage_address_book() {
        manageButton.click();
    }

    public void cliquer_sur_le_bouton_edit() {
        editButton.click();
    }

    public void je_saisie_les_nouvelles_donnees() {
        Address2.clear();
        Address2.sendKeys("Monastir 5040");
    }

    public void cliquer_sur_le_bouton_continue() {
        continueButton.click();
    }
}


