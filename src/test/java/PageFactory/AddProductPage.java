package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
    WebDriver driver;


    @FindBy(xpath = "//*[@id='maincontainer']/div/div/div/div/div[3]/div[2]/div[1]/div/a")
    WebElement addProduct;

    @FindBy(xpath = "//*[@id='product']/fieldset/div[5]/ul/li/a")
    WebElement addCart;

    @FindBy(xpath = "//*[@id='categorymenu']/nav/ul/li[3]")
    WebElement makeup;

    public AddProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
           }

    public void cliquer_sur_makeup() {
        makeup.click();
    }

    public void cliquer_sur_le_bouton_add_to_cart() {
        addCart.click();
    }

    public void cliquer_sur_tropiques_minerale_loose_bronzer() {
        addProduct.click();
    }
}

