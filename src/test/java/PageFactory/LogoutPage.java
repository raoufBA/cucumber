package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='maincontainer']/div/div[2]/div[1]/div/ul/li[10]")
    WebElement LogoutButton;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void je_clique_sur_le_bouton_logout() {

        LogoutButton.click();
    }


}
