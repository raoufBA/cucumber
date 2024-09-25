package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckoutPage {
    WebDriver driver;

    @FindBy(css = "#main_menu_top > li:nth-child(4)")
    WebElement CheckoutButton;


    @FindBy(xpath= "//*[@id='checkout_btn']")
    WebElement ConfirmOrder;

     public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickCheckoutButton() {
        CheckoutButton.click();
    }
    public void ClickConfirmOrder() {
        ConfirmOrder.click();
    }
}